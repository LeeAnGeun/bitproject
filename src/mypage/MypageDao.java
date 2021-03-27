package mypage;

import db.DBConnection;

public class MypageDao {

	
private static MypageDao dao = new MypageDao();
	
	private MypageDao() {
		
	}
	
	public static MypageDao getInstance() {
		return dao;
	}
}
