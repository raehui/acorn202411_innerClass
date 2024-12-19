package test.main;
import test.mypac.*;

public class MainClass01 {
	public static void main(String[] args) {
		/*
		 * new Player()는 Player 객체를 생성할 때 사용하는 표현식인데
		 * 이것은 Player 클래스의 생성자(constructor)를 호출하는 표현식이다.
		 */
		//p1에는 Player()의 참조값이 들어가 있음
		Player p1=new Player();
		p1.move();
		p1.attack();
	}
}