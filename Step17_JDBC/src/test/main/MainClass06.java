package test.main;

import java.lang.reflect.Member;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import test.dto.MemberDto;
import test.util.DBConnector;

public class MainClass06 {
	public static void main(String[] args) {	
		//회원 목록을 아주 쉽게 얻어낼 수 있다.
		List<MemberDto>list=getList();
		for(MemberDto tmp:list) {
			System.out.printf("번호 : %d, 이름:%s, 주소:%s \r\n",tmp.getNum(),tmp.getName(),tmp.getAddr());
		}
	}
	//미리 준비된 메소드가 있다고 가정하면
	public static List<MemberDto> getList(){
		//회원 목록를 리턴해줄 수 있는지...
		//오라클에 있는 데이터 받아오고
		//멤버 디티오에 담고 출력
		
		//리턴해줄 객체를 미리 생성
		List<MemberDto>list=new ArrayList<>();
		
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		
		try {
			conn=new DBConnector().getConn();
			String sql="""
					SELECT num,name,addr
					FROM member
					ORDER BY num ASC	
				""";
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			
			while(rs.next()) {
				int num=rs.getInt("num");
				String name=rs.getString("name");
				String addr=rs.getString("addr");
				//select 된 row 하나의 정보를 MemberDto 객체에 담는다.
				MemberDto dto=new MemberDto();
				dto.setNum(num);
				dto.setName(name);
				dto.setAddr(addr);
				
				//회원 한명의 정보가 담긴 MemberDto 객체를 ArrayList 객체에 누적시킨다.
				list.add(dto);				
			}		
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}		
		return list;
		
			
	}
	
}
