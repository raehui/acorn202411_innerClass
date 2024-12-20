package test.main;

import test.mypac.Calc;
import test.mypac.Drill;

public class MyPractice {
	public static void main(String[] args) {
		Drill d1=()->{
			System.out.println("쿼가에 구멍을 뚫어요!");
		};
		useDrill(d1);
		
	}//main end
	
	public static void useDrill(Drill d1) {
		d1.hole();
	}

}
