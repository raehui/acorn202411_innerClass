package test.main;

import test.mypac.Zoo;
import test.mypac.Zoo.Monkey;
import test.mypac.Zoo.Rabbit;
import test.mypac.Zoo.Tiger;
//import 정도에 따라서 작성 정도가 달라짐

public class MainClass02 {
	public static void main(String[] args) {
		Zoo z1=new Zoo();
		
		Zoo.Monkey m1=z1.getMonkey();
		m1.say();
		
		Tiger t1=z1.getTiger();
		t1.say();
		
		Rabbit r1 = z1.getRabbit();
		r1.say();
		
		
		
	}

}
