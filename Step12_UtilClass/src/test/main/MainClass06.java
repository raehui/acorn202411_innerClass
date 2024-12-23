package test.main;

import java.util.ArrayList;
import java.util.List;

import test.mypac.MemberDto;

public class MainClass06 {
	public static void main(String[] args) {
		//1. MemberDto 객체를 담을 수 있는 ArrayList 객체를 생성해서 참조값을 members 라는
		//지역변수에 담아 보세요.
		List<MemberDto> members=new ArrayList<>();
		
		//2. 3명의 회원정보를 MemberDto 객체에 담아보세요(MemberDto 객체가 3개 생성되어야 함)
		MemberDto m1=new MemberDto();
		m1.setNum(1);
		m1.setName("김구라");
		m1.setAddr("노량진");

		MemberDto m2=new MemberDto();
		m2.setNum(2);
		m2.setName("해골");
		m2.setAddr("행신동");
		
		//해당 생정자가 정의되어있으면 가능
		MemberDto m3=new MemberDto(3,"원숭이","분당");		
		
		//3. 위에서 생성된  MemberDto 객체의 참조값을 ArrayList 객체에 모두 담아 보세요.
		members.add(m1);
		members.add(m2);
		members.add(m3);
		
		//4. 반복문을 이용해서 members 에 들어 있는 회원정보를 출력하세요.
		//메서드 안에 다른 메서드의 참조값이 들어갈 수 있음
		for(MemberDto tmp:members) {
			String info=String.format("번호: %d, 이름:%s, 주소: %s", tmp.getNum(),tmp.getName(),tmp.getAddr());
			System.out.println(info);
			
		}
		
		//테스트 메서드 호출(매개 변수에 전달할 String type 의 갯수는 유동적이다.)
		test();
		test("kim");
		test("kim","lee","park");
		test("안녕","이제부터","점심시간~");
	
	}
	
	
	//...테스트
	
	public static void test(String...msgs) {
		//String ...은 String[] type 이다.
		String[] a= msgs;
		
	}

}
