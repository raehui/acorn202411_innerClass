package test.auto2;

import test.auto.Bread;
import test.auto.Flour;

public class MyBread extends Bread{
	public MyBread(Flour flour) {
		super(flour);
	}
	
	public void mycook() {
		if(this.flour==null) {
			 System.out.println("밀가루가 없어서 요리가 불가해요!");
			 return;
		 }
		 System.out.println("나만의 요리중!");
	}
}
