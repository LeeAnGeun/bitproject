package book;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import db.DBClose;
import db.DBConnection;

public class BookDao {
	private static BookDao dao = new BookDao();
	
	private BookDao() {
		DBConnection.initConnection();
	}
	
	public static BookDao getInstance() {
		return dao;
	}
	
	// 책 리스트 가져가기 위한 메소드
	public List<BookDto> getBookList(int choice){
		
		String sql = " SELECT BOOKNUM, BOOKTITLE, CATEGORIES, BOOKREADCOUNT, BOOKDEL, GRADE, "
									+ " AUTHOR, ISSUEDATE, BOOKHEADER, PUBLISHER ";
		
		// 이달의 추천
		if(choice == 1) {
			
			sql +=  " FROM BOOK "
				+ " ORDER BY GRADE ";
		}
		// 분야별 추천
		else if(choice == 2) {
			sql += " RNUM "
				+ " FROM (SELECT ROW_NUMBER() OVER (PARTITION BY CATEGORIES ORDER BY GRADE DESC) AS RNUM, BOOKNUM, BOOKTITLE, CATEGORIES, BOOKREADCOUNT, BOOKDEL, GRADE, "
							+ " AUTHOR, ISSUEDATE, BOOKHEADER, PUBLISHER " 
					+ " FROM BOOK) "
				+ "	WHERE RNUM = 1 ";
		} 
		else {//일반 검색
			
			
		}
		System.out.println("sql = " + sql);		
		
		Connection conn = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;
		
		List<BookDto> list = new ArrayList<BookDto>();
		
		try {
			conn = DBConnection.getConnection();
			System.out.println("1/4 S getBookList");
			
			psmt = conn.prepareStatement(sql);
			System.out.println("2/4 S getBookList");
			
			rs = psmt.executeQuery();
			System.out.println("3/4 S getBookList");
			
			while(rs.next()) {
				int i = 1;
				
				BookDto dto = new BookDto(rs.getInt(i++), 
									      rs.getString(i++), 
										  rs.getInt(i++), 
										  rs.getInt(i++),
										  rs.getInt(i++),
										  rs.getDouble(i++),
										  rs.getString(i++),
										  rs.getString(i++),
										  rs.getString(i++),
										  rs.getString(i) );
									
				list.add(dto);
				
			}
			System.out.println("4/4 S getBookList");
		} catch (SQLException e) {
			System.out.println("getBookList fail");
			e.printStackTrace();
		} finally {
			DBClose.close(conn, psmt, rs);
		}
		
		return list;
	}
	
	
	
}
