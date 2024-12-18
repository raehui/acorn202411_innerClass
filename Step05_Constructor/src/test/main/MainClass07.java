package test.main;
import test.mypac.*;

public class MainClass07 {
	public static void main(String[] args) {
		//Computer 객체를 생성해서 참조값을 com1에 담아 보세요.
		Computer com1 = new Computer(new Cpu(),new Memory(),new Ssd());
		
		// 생성자에 전달할 객체를 미리 생성해서 참고값을 지역 변수에 담은 다음
		Cpu c1 = new Cpu();
		Memory m1 = new Memory();
		Ssd s1 = new Ssd();
		
		Computer c2 = new Computer(c1, m1, s1);
		
		//생성자에 지역변수명으로 전달한다.
		c1.test();
		
	
		
	
		
	}

}
