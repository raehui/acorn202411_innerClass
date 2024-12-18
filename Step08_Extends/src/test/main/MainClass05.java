package test.main;

import test.mypac.AndroidPhone;
import test.mypac.HandPhone;
import test.mypac.IosPhone;

public class MainClass05 {
	public static void main(String[] args) {
		//AndroidPhone 객체를 생성해서 참조값을 AndroidPhone type p1 이라는 지역변수에 담기
		AndroidPhone p1= new AndroidPhone();
		p1.Call();
		p1.mobileCall();
		p1.takePicture();
		p1.doInertnet();
		
		System.out.println("-------");
		//AndroidPhone 객체를 생성해서 참조값을 HandPhone type p2 이라는 지역변수에 담기
		HandPhone p2 =new AndroidPhone();
		p2.takePicture(); //Override 된 메소드가 호출됨
		
		System.out.println("--------");
		HandPhone p3 = new HandPhone();
		p3.takePicture(); //원래 HandPhone 객체의 메소드가 호출됨
		
		System.out.println("------IosPhone 객체 생성하기");
		IosPhone i1 = new IosPhone();
		i1.takePicture();
		i1.Game();
		i1.Dang();
		i1.mobileCall();
		
		
	}
}
