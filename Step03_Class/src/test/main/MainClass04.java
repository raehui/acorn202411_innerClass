package test.main;
import test.mypac.*;

public class MainClass04 {
	public static void main(String[] args) {//void는 리턴값이 없음 , 받아갈 생각 ㄴㄴ
		// Car 객체를 생성해서 참조값을 얻어낸 다음
		Car car1=new Car();
		car1.name="소나타";
		
		Car car2=new Car();
		car2.name="캐스퍼";
		
		
		//참조값에 . 찍어서 호출할 수 있음
		//메소드는 참조할 수 없다. 메소드는 데이터가 아님
		//단독으로 존재할 수 없기에 꼭 객체 안에 있어야 함!
		car1.drive();
		car2.drive();
		
		//참조값에 . 찍어서 호출할 수 있음
		String name = "kim"; //name에 객체의 참조값이 들어가 있음
		String name2 =new String("park");
		
	}

}
