package test.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import test.dto.DeptDto;
import test.dto.EmpDeptDto;
import test.util.DBConnector;

public class MainClass09 {
	public static void main(String[] args) {
		List<EmpDeptDto>list=getList();
		for(EmpDeptDto tmp:list) {
			System.out.printf("사번: %d, 사원이름:%s, 부서번호:%d, 부서이름:%s \r\n ",tmp.getEmpno(),tmp.getEname(),tmp.getDeptno(),tmp.getDname());
		}
		
	}
	
	//자동으로 배열에 넣어주는 
	public static List<EmpDeptDto> getList(){
		List<EmpDeptDto>list=new ArrayList<>();
		
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		
		try {
			conn=new DBConnector().getConn();
			String sql="""
					SELECT empno,ename,deptno,dname 
					FROM emp 
					JOIN dept USING(deptno)
					ORDER BY empno
					""";
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			
			while(rs.next()) {
				//리턴할 객체 생성
				EmpDeptDto eddto=new EmpDeptDto();
				eddto.setEmpno(rs.getInt("empno"));
				eddto.setEname(rs.getString("ename"));
				eddto.setDeptno(rs.getInt("deptno"));
				eddto.setDname(rs.getString("dname"));
				
				list.add(eddto);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return list;
	}

}
