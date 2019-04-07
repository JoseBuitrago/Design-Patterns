package ingsw.pdd.proxy.services;

public class SecurityService {
    public boolean authorization(String user,String password){
        if(user.equals("Jose_Buitrago") && password.equals("1234")){
            System.out.println("Usuario " + user + " autorizado");
            return true;
        }else{
            System.out.println("Usuario " + user + " no autorizado");
            return false;
        }
    }
}
