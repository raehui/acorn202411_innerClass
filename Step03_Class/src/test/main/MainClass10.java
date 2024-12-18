package test.main;
import test.mypac.*;

public class MainClass10 {
	public static void main(String[] args) {
		
		Member m1 = new Member();
		m1.num(1);
		m1.name("김구라");
		m1.addr("노량진");
		//메서드에서 this 가 반복될때 사용함
		//this를 계속 리턴해주기에 가능함
		Member  m2= new Member().num(2).name("해골").addr("행신동");
		
		Member  m3= new Member().num(3).name("원숭이").addr("분당");
		
		Member m4 = new Member().num(4).name("골룸").addr("방배동");
		
	}

}
