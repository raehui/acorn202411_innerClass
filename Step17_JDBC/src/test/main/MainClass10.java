package test.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import test.dto.MemberDto;
import test.util.DBConnector;

public class MainClass10 {
	public static void main(String[] args) {
		//추가할 회원 정보라고 가정하자
		String name="김구라";
		String addr="노량진";
		
		//추가할 회원정보를 MemberDto 객체에 답고
		MemberDto dto=new MemberDto();
		dto.setName(name);
		dto.setAddr(addr);
		
		//미리 준비된 메소드를 이용해서 DB에 저장하고 성공여부를 리턴 받는다
		boolean isSuccess=insert(dto);
		
		if(isSuccess) {
			System.out.println("회원 정보를 저장했습니다.");
		}else {
			System.out.println("저장 실패");
		}
		
	}
	
	//매개 변수에 전달된 MemberDto 객체에 담긴 name과 addr 를 DB에 저장
	//작업의 성공여부를 리런하는 메소드
	public static boolean insert(MemberDto dto) {
		//필요한 객체를 담을 지역변수 미리 만들기
		Connection conn=null;
		PreparedStatement pstmt=null;
		//변화된 row 갯수를 저장할 변수를 0을 대입해서 미리 만들기
		int rowCount=0;
		try {
			//Connection 객체의 참조값 얻어내기
			conn=new DBConnector().getConn();
			//실행할 미완성 sql문
			String sql="""
					INSERT INTO member
					(num,name,addr)
					VALUES(member_seq.NEXTVAL,?,?)
					""";
			//미완성 sql 문을 전달하면서 PreparedStatement 객체의 참조값 얻어내기
			pstmt=conn.prepareStatement(sql);
			//? 에 값 바인딩 하기
			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getAddr());
			//sql문 실행하고 추가(insert)되거나, 변경(update)되거나, 삭제(delete)된 row 의 갯수리턴 받기
			rowCount=pstmt.executeUpdate(); //int 정수 값이 리턴된다
			
			
		} catch (SQLException se) {
			se.printStackTrace();
			// TODO: handle exception
		}finally {
			try {
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		//rowCount 변수에 들어 있는 값을 확인해서 작업의 성공여부를 리턴해 준다.
		if(rowCount>0) {
			return true;
		}else {
			return false;
		}
		
	}
	
}
