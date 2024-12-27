package test.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MainClass01 {
	public static void main(String[] args) {
		/*
		 * java 로 oracle 에 scott/TIGER 계정으로 접속해서
		 * 
		 * 모든 사원의 사원번호, 사원이름, 직업, 급여를 사원이름으로 내림차순 정렬해서 SELECT 한다음
		 * 콘솔창에 출력하기
		 */
		/*
		 * xxx.jar 파일은 class 파일 여러개가 압축되어 있다.
		 */
		//DB 연결객체를 담을 지역 변수 만들기
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
		
		try {
			//실행할 sql 문을 미리 준비하기 (java10 부터 새로운 문자열 만드는 문법)
			String sql="""
				SELECT empno, ename,job,sal as S
				FROM emp
				ORDER BY empno ASC
			""";

			
			//PreparedStatement 객체의 참조값 얻어오기
			pstmt=conn.prepareStatement(sql);
			//SELECT 문 실행하고 결과 값을 ResultSet 으로 얻어내기
			//SELECY 
			rs=pstmt.executeQuery();
			//반복문 돌면서
			while(rs.next()) {//커서를 내리는 역할로 true 반환
				int empno=rs.getInt("empno");
				String ename=rs.getString("ename");
				String job=rs.getString("job");
				double sal=rs.getDouble("S");
				System.out.println(empno+ " | " + ename+ " | "+ job+" | "+sal);
				
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
