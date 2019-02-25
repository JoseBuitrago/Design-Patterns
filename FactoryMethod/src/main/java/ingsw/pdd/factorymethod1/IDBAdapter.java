package ingsw.pdd.factorymethod1;

import java.sql.Connection;

public interface IDBAdapter {
	
	public Connection getConnection();

}
