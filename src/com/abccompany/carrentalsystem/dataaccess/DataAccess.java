package com.abccompany.carrentalsystem.dataaccess;

import java.sql.SQLException;

public interface DataAccess {
	void readAll(Dao dao) throws SQLException;
	boolean write(Dao dao) throws SQLException;
	Object readOne(Dao dao) throws SQLException;
}
