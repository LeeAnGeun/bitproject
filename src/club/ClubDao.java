package club;

import db.DBConnection;

public class ClubDao {
	
private static ClubDao dao = new ClubDao();
	
	private ClubDao() {
		
	}
	
	public static ClubDao getInstance() {
		return dao;
	}


}
