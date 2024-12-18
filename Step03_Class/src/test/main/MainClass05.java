package test.main;

import test.mypac.*;
public class MainClass05 {
	public static void main(String[] args) {
		Car car1=new Car();
		car1.drive();
		
		//참조값에 . 찍어서 호출할 수 있음
		//객체를 일회용으로만 사용함
		//Car 객체를 생성해서 메소드 호출하고 참조값은 더이상 사용할 수 없다.
		new Car().drive();
		
		car1.drive();
		car1.drive();
		
		
		
	}
}
