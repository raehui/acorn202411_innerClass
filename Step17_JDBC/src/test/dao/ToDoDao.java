package test.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import test.dto.MemberDto;
import test.dto.ToDoDto;
import test.util.DBConnector;

/*
 * insert , update, delete, 전제 to do list 내용 조회하는 getList() , 매개 변수에 전달된 내용만 조회하기 getData(int num)
 */
public class ToDoDao {
	public boolean insert(ToDoDto dto) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		int rowCount = 0;

		try {
			conn = new DBConnector().getConn();
			//실행할 sql문
			String sql = """
					INSERT INTO todolist
					(num,todo,content)
					VALUES(todo_sequence.NEXTVAL,?,?)
					""";
			pstmt = conn.prepareStatement(sql);
			//?에 값 바인딩
			pstmt.setString(1, dto.getTodo());
			pstmt.setString(2, dto.getContent());

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
	
	public boolean update(ToDoDto dto) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		int rowCount = 0;

		try {
			conn = new DBConnector().getConn();
			//실행할 sql문
			String sql = """
					UPDATE todolist
					SET todo=? , content=?
					WHERE num=?
					""";
			pstmt = conn.prepareStatement(sql);
			//?에 값 바인딩
			pstmt.setString(1, dto.getTodo());
			pstmt.setString(2, dto.getContent());
			pstmt.setInt(3, dto.getNum());

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
	
	public boolean delete(int num) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		int rowCount = 0;

		try {
			conn = new DBConnector().getConn();
			//실행할 sql문
			String sql = """
					DELETE FROM todolist
					WHERE num=?
					""";
			pstmt = conn.prepareStatement(sql);
			//?에 값 바인딩
			pstmt.setInt(1,num);
			

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
	//전체 todolist 반환하기
	public List<ToDoDto> getList(){
		//반환할 list 생성하기
		List<ToDoDto>list=new ArrayList<>();
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = new DBConnector().getConn();
			String sql = """
					SELECT *
					FROM todolist
					ORDER BY num asc
					""";
			pstmt = conn.prepareStatement(sql);
			//? 에 값 바인딩 할게 있으면 여기서 한다.

			//select 문 실행하고 결과를 ResultSet 객체로 리턴받기
			rs = pstmt.executeQuery();
			while (rs.next()) {
				ToDoDto dto=new ToDoDto();
				dto.setNum(rs.getInt("num"));
				dto.setTodo(rs.getString("todo"));
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
	
	//매개변수에 전달할 내용만 조화하기
	public ToDoDto getData(int num) {
		//필드에서 데이터 타입을 지정했기에 메서드 안에서 어디에서나 사용 가능
		ToDoDto dto=null;
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = new DBConnector().getConn();
			String sql = """
					SELECT *
					FROM todolist
					WHERE num=?
					""";
			pstmt = conn.prepareStatement(sql);
			//? 에 값 바인딩 할게 있으면 여기서 한다.
			pstmt.setInt(1, num);
			//select 문 실행하고 결과를 ResultSet 객체로 리턴받기
			rs = pstmt.executeQuery();
			while (rs.next()) {
				dto=new ToDoDto();
				dto.setNum(num);
				dto.setTodo(rs.getString("todo"));
				dto.setContent(rs.getString("content"));

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
		return dto;
	}
	
	
	

}//class end
