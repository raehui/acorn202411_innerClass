package test.main;

import test.dao.MemberDao;
import test.dto.MemberDto;

public class MainClass15 {
	public static void main(String[] args) {
		/*
		 * MemberDto 객체를 이용해서
		 * 1번 회원의 이름을 "김구라" 주소를 "노량진"으로 수정해 보세요.
		 * 단) 성공 여부를 콘촐창에 출력해 보세요.
		 */
		int num=2;
		String name="김구라";
		String addr="노량진";
		
		MemberDto dto=new MemberDto();
		dto.setNum(num);
		dto.setName(name);
		dto.setAddr(addr);
		
		MemberDao dao=new MemberDao();
		//성공 여부를 리턴하게끔 메소드를 설정
		boolean isSuccess=dao.update(dto);
		
		if(isSuccess) {
			System.out.printf("%d번 회원 정보가 이름은 %s 주소는 %s로 수정되었습니다.",num,name,addr);			
		}else {
			System.out.println("수정 실패!");
		}
		
		
	}

}
