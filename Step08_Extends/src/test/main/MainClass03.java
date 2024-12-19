package test.main;

import test.mypac.HandPhone;
import test.mypac.Phone;

public class MainClass03 {
	public static void main(String[] args) {
		//아래의 3줄을 실행하면 참조값이 몇개가 나올까?(객체가 몇개가 생성될까?)
		//아마 1개가 아니야?
		HandPhone p1 = new HandPhone();
		//HandPhone type 안에 있는 값은 Phone type(부모	type) 변수에 대입 가능!
		Phone p2=p1;
		//HandPhone type 안에 있는 값은 Object type(부모 type) 변수에 대입 가능!
		Object p3=p1;
		
		//type casting : 부모 클래스의 객체를 자식 클래스이 객체
		//뭘 new 했는지가 중요한가
		//컴파일 할 때는 오류가 안 나지만 실행할 때는 오류가 발생할 수 있음
		
		//casting 후에 담을 수 있다.
		HandPhone p4 =(HandPhone)p3;
		p4.takePicture();
		
		Phone p5 = (Phone)p3;
		p5.Call();
	}

}
