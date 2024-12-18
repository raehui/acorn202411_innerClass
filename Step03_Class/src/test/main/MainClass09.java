package test.main;
import test.mypac.Member;

public class MainClass09 {
	public static void main(String[] args) {
		/*
		 * Member 객체를 3개 생성해서 각각의 객체에 3명을 정보를 담아 보세요.
		 */
		//new 클래스명 () = 생성자
		Member member1= new Member();
		Member member2= new Member();
		Member member3= new Member(3,"원숭이","동물원");
		
		member1.num =1; 
		member1.name="김구라";
		member1.addr="노량진";
		
		member2.num =2; 
		member2.name="해골";
		member2.addr="구의동";
		
		//매개변수에 값을 3개 전달받는 생성자를 이용해서 객체 생성
//		member3.num=3;
//		member3.name="원숭이";
//		member3.addr="동물원";
		
		member1.showInfo();
		member2.showInfo();
		member3.showInfo();
		
		member1.shwoInfo2();
		
		
		
		
		
	}
}
