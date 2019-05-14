package ingsw.pdd.strategy.impl.providers;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import ingsw.pdd.strategy.impl.IAuthenticationStrategy;
import ingsw.pdd.strategy.impl.Principal;
import ingsw.pdd.strategy.util.MySQLDBAdapter;

public class SQLAuthenticationProvider implements IAuthenticationStrategy{
    private static final String USER_QUERY = "SELECT userName,rol from users where userName='%s' and password = '%s'";
    private MySQLDBAdapter mysqlAdapter;
    
    public SQLAuthenticationProvider(){
        mysqlAdapter = new MySQLDBAdapter();
    }
    
    @Override
    public Principal authenticate(String user, String passwrd) {
        try {
            Connection connection = mysqlAdapter.getConnection();
            Statement statement = connection.createStatement();
            String queryUser = String.format(USER_QUERY, user,passwrd);
            ResultSet query = statement.executeQuery(queryUser);
            while(query.next()){
                return new Principal(query.getString("userName"),
                        query.getString("rol"));
            }
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        
    }
}
