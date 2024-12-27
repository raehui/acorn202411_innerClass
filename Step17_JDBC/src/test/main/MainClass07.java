package test.main;

import java.lang.reflect.Member;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import test.dto.EmpDto;
import test.dto.MemberDto;
import test.util.DBConnector;

public class MainClass07 {
	public static void main(String[] args) {	
		//회원 목록을 아주 쉽게 얻어낼 수 있다.
		List<EmpDto>list=getList();
		for(EmpDto tmp:list) {
			System.out.printf("사번: %d, 이름:%s, 직업:%s,급여:%.2f \r\n",tmp.getEmpno(),tmp.getEname(),tmp.getJob(),tmp.getSal());
		}
	}
	//미리 준비된 메소드가 있다고 가정하면
	public static List<EmpDto> getList(){
		//회원 목록를 리턴해줄 수 있는지...
		//오라클에 있는 데이터 받아오고
		//멤버 디티오에 담고 출력
		
		//리턴해줄 객체를 미리 생성
		List<EmpDto>list=new ArrayList<>();
		
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		
		try {
			conn=new DBConnector().getConn();
			String sql="""
					SELECT empno,ename,job,sal
					FROM emp
				""";
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			
			while(rs.next()) {
				int empno=rs.getInt("empno");
				String ename=rs.getString("ename");
				String job=rs.getString("job");
				double sal=rs.getDouble("sal");
				
				//select 된 row 하나의 정보를 MemberDto 객체에 담는다.
				EmpDto edto=new EmpDto();
				edto.setEmpno(empno);
				edto.setEname(ename);
				edto.setJob(job);
				edto.setSal(sal);
				
				
				//회원 한명의 정보가 담긴 MemberDto 객체를 ArrayList 객체에 누적시킨다.
				list.add(edto);				
			}		
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}		
		return list;
		
			
	}
	
}
