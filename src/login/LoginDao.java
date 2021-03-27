package login;


import java.util.List;

import db.DBConnection;

public class LoginDao {
	
private static LoginDao dao = new LoginDao();
	
	private LoginDao() {
		DBConnection.initConnection();
	}
	
	public static LoginDao getInstance() {
		return dao;
	}

	
	
	
}
