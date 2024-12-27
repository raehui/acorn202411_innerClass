package test.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import test.dto.DeptDto;
import test.util.DBConnector;

public class MainClass08 {
	public static void main(String[] args) {
		List<DeptDto>list=getList();
		for(DeptDto tmp:list) {
			System.out.printf("부서번호: %d, 부서이름:%s, 부서위치:%s \r\n ",tmp.getDeptno(),tmp.getDname(),tmp.getLoc());
		}
		
	}
	
	
	public static List<DeptDto> getList(){
		List<DeptDto>list=new ArrayList<>();
		
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		
		try {
			conn=new DBConnector().getConn();
			String sql="""
					SELECT deptno,dname,loc
					FROM dept
					""";
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			
			while(rs.next()) {
				//리턴해줄 객체를 하나 생성하기
				DeptDto ddto=new DeptDto();
				//부서 하나의 정보 담기
				ddto.setDeptno(rs.getInt("deptno"));
				ddto.setDname(rs.getString("dname"));
				ddto.setLoc(rs.getString("loc"));
				
				list.add(ddto);
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return list;
	}
}
