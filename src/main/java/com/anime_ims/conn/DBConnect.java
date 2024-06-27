package com.anime_ims.conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.anime_ims.utils.Constants;

public class DBConnect {
	
	public static Connection getConnection() throws SQLException {
		return DriverManager.getConnection(Constants.url, Constants.user, Constants.pass);
	}

}
