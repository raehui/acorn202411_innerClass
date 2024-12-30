package test.main;

import java.util.Scanner;

import test.dao.MemberDao;
import test.dto.MemberDto;

public class MainClass17 {
	public static void main(String[] args) {
		/*
		 * Scanner 객체를 이용해서 불러올 회원의 번호를 입력받은 다음
		 * 
		 * 입력한 번호에 해당하는 회원의 정보를 MemberDao 객체를 이용해서 얻어온 다음
		 * 
		 * 해당 회원이 존재하면 해당 회원의 정보를 콘솔에 출력하고
		 * 
		 * 존재하지 않으면 "x번 회원은 존재 하지 않습니다!"를 콘솔창에 출력하기
		 */
		System.out.println("불러올 회원의 번호를 입력하세요.");
		Scanner scan=new Scanner(System.in);
		
		int num=scan.nextInt();
//		Integer num1=Integer.parseInt(num);
		
		MemberDao dao=new MemberDao();
		
		MemberDto dto=dao.getData(num);
		
		if(dto!=null) {
			System.out.printf("%d 번의 이름: %s 주소:%s",dto.getNum(),dto.getName(),dto.getAddr());
		}else {
			System.out.printf("%d번 회원은 존재하지 않습니다!",num);
		}
		
		
		
		
		
	}

}
