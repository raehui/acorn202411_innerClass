package test.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MyPractice3 {
	public static void main(String[] args) {
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
		} //Connection을 잘 가지고 오기위한 코딩, Connection 객체 생성하기 위해서~
		
		//SELECT 작업을 위해서 필요한 객체의 참조값을 담을 지역 변수 미리 만들기
		PreparedStatement pstmt=null; //SQL문을 실행한 객체
		ResultSet rs=null; //결과를 받아올 객체
//		String[] sql=new String[
//		                       "SELECT empno,ename,job sal"
//		                       + "FROM emp"
//		                       + "ORDER by empno ", 
//		                        ];
		try {
			for(int i=0;i<3;i++) {
				String sql1="""
						SELECT empno, ename,job,sal as S
						FROM emp
						ORDER BY empno ASC
					""";
				
				
			}
			
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
