package test.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import test.dto.PostDto;
import test.util.DBConnector;

public class PostDao {
	// insert 메서드
	public boolean insert(PostDto dto) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		int rowCount = 0;
		try {
			conn = new DBConnector().getConn();
			String sql = """
					INSERT INTO posts
					(id,title,content)
					VALUES(posts_seq.nextval,?,?)
					""";
			pstmt = conn.prepareStatement(sql);
			// ? 에 값 바인딩
			pstmt.setString(1, dto.getTitle());
			pstmt.setString(2, dto.getContent());
			// sql 문 실행
			rowCount = pstmt.executeUpdate();
		} catch (SQLException se) {
			se.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
			}
		}
		if (rowCount > 0) {
			return true;
		} else {
			return false;
		}
	}

	// update 메서드
	public boolean update(PostDto dto) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		int rowCount = 0;

		try {
			conn = new DBConnector().getConn();
			// 실행할 sql문
			String sql = """
					UPDATE posts
					SET title=?, content=?
					Where id=?
					""";
			pstmt = conn.prepareStatement(sql);
			// ?에 값 바인딩
			pstmt.setString(1, dto.getTitle());
			pstmt.setString(2, dto.getContent());
			pstmt.setInt(3, dto.getId());

			// sql문 실행
			rowCount = pstmt.executeUpdate();

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		// rowCount 변수에 들어 있는 값을 확인해서 작업의 성공여부를 리턴해 준다.
		if (rowCount > 0) {
			return true;
		} else {
			return false;
		}
	}

	// delete 메서드
	public boolean delete(int num) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		int rowCount = 0;

		try {
			conn = new DBConnector().getConn();
			//실행할 sql문
			String sql = """
					DELETR FROM posts
					WHERE id=?
					""";
			pstmt = conn.prepareStatement(sql);
			//?에 값 바인딩
			pstmt.setInt(1, num);
			

			//sql문 실행
			rowCount = pstmt.executeUpdate();

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		//rowCount 변수에 들어 있는 값을 확인해서 작업의 성공여부를 리턴해 준다.
		if (rowCount > 0) {
			return true;
		} else {
			return false;
		}

	}
	
	//getData 메서드
	//매개변수에 전달된 번호에 해당하는 글 하나의 정보를 리턴하기
	public PostDto getData(int id) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		PostDto dto=null;
		
		try {
			conn = new DBConnector().getConn();
			String sql = """
					SELECT titel,content
					FROM posts
					WHERE id=?
					""";
			pstmt = conn.prepareStatement(sql);
			//? 에 값 바인딩 할게 있으면 여기서 한다.
			pstmt.setInt(1, id);
			//select 문 실행하고 결과를 ResultSet 객체로 리턴받기
			rs = pstmt.executeQuery();
			while (rs.next()) {
				dto=new PostDto();
				dto.setId(id);
				dto.setTitle(rs.getString("title"));
				dto.setContent(rs.getString("content"));

			}
		} catch (SQLException se) {
			se.printStackTrace();
		} finally {
			try {
				if (rs != null)rs.close();
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {}
		}
			return dto;
	
	}
	
	//전체 회원 목록을 리턴하는 메소드
	public List<PostDto>getList(){
		
		List<PostDto>list=new ArrayList<>();
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = new DBConnector().getConn();
			String sql = """
					SELECT id,title,content
					FROM posts
					ORDER BY id asc

					""";
			pstmt = conn.prepareStatement(sql);
			//? 에 값 바인딩 할게 있으면 여기서 한다.

			//select 문 실행하고 결과를 ResultSet 객체로 리턴받기
			rs = pstmt.executeQuery();
			while (rs.next()) {
				PostDto dto=new PostDto();
				
				dto.setId(rs.getInt("id"));
				dto.setTitle(rs.getString("title"));
				dto.setContent(rs.getString("content"));
				
				list.add(dto);

			}
		} catch (SQLException se) {
			se.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
			}
		}
		return list;
	}
	
	
	

}// class end
