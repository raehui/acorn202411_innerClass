package test.main;

import test.dao.MemberDao;

public class MainClass16 {
	public static void main(String[] args) {
		/*
		 * MemberDao 객체를 이용해서1 번 회원의 정보를 삭제해 보세요.
		 * 단 성공여부를 콘솔창에 출력하세요.
		 */
		//삭제할 번호
		int num=5;
		
		//dao기능을 이용하기 위해서 객체 생성
		var dao=new MemberDao();
		
		var isSucces=dao.delete(num); //return type 을 알기에 infer 가능
		if(isSucces) {
			System.out.printf("%d번 회원의 정보를 삭제했습니다.",num);
		}else {
			System.out.println("삭제 실패!");
		}
		
	}
}
