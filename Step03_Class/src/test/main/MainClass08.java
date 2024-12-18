package test.main;

import java.io.PrintStream;

public class MainClass08 {
	//static 필드
	public static String myName ="김구라";
	//non static 필드
	public String yourName ="에이콘";
	
	public static void main(String[] args) {
		//System 클래스의 out이라는 필드에 콘솔창에 출력하는 기능
		//가지고 있는 PrintStream type의 참조값이 들어있다.
		PrintStream a = System.out;
		System.out.println();
		a.println("욍?"); //
		
		PrintStream b= System.out;
		b.println();
		
		
		//같은 공간에 있어서 가능함
		System.out.println(MainClass08.myName);
		System.out.println(myName);
		
		/*yourName은 static 필드가 아니라서 참고가 안된다
		System.out.println(MainClass08.yourName);
		
		//여기는 static 메소드 안쪽이기 때문에 this.을 사용할 수가 없다
		System.out.println(this.yourName);
		*/
		
		//Long type을 리턴해주는 static 메소드
		//1970년 1월 1일 0시를 기준으로 현재까지 경과한 시간을 
		// 1/1000초 단위로 계산해서 리넡해 주는 메소드
		Long time = System.currentTimeMillis();
		
		System.out.println("경과시간 : "+time);
		
		
		
		
		
		
	}
}
