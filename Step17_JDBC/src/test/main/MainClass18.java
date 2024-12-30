package test.main;

import java.security.interfaces.RSAKey;
import java.util.ArrayList;
import java.util.List;

import test.dao.MemberDao;
import test.dto.MemberDto;

public class MainClass18 {
	public static void main(String[] args) {
		/*
		 * MemberDao 객체를 이용해서 회원목록을 얻어온 다음
		 * 전체 목록을 반복문 돌면서 출력하기
		 */
		
		
		MemberDao dao=new MemberDao();
		List<MemberDto>list=dao.getList();
		//ArrayList는 축약 for문과 같이
		for(MemberDto tmp:list) {
			System.out.printf("번호:%d, 이름:%s 주소:%s",tmp.getNum(),tmp.getName(),tmp.getAddr());
			System.out.println();
		}
		
	}

}
