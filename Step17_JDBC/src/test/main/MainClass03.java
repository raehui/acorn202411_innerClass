package test.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class MainClass03 {
	public static void main(String[] args) {
		//수정할 회원의 정보라고 가정하기
		int num=1;
		String name="에이콘";
		String addr="강남";
		
		//위 정보대로 1번회원의 이름을 수정하는 프로그래밍
		Connection conn=null;
		try {
			//오라클 드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//접속할 DB 의 정보 @아이피주소:port번호:db이름
			String url="jdbc:oracle:thin:@localhost:1521:xe";
			//계정 비밀번호를 이용해서 Connection 객체의 참조값 얻어오기
			conn=DriverManager.getConnection(url, "scott", "TIGER");
			//예외가 발생하지 않고 여기까지 실행순서가 내려오면 접속 성공이다.
			System.out.println("Oracle DB 접속 성공");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		PreparedStatement pstmt=null;
		try {
			String sql="""
					UPDATE member
					SET name=?, addr=?
					WHERE num=?					
					""";
			pstmt=conn.prepareStatement(sql);			
			//순서대로 해야함(? 순서대로 바인딩하기)
			pstmt.setString(1, name);
			pstmt.setString(2, addr);
			pstmt.setInt(3, num);
			
			pstmt.executeUpdate();
			System.out.println("회원 정보를 수정했습니다.");
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
}
