package test.main;
//import test.mypac.Car;
//import test.mypac.Menu;
import test.mypac.*;
public class MainClass03 {
	public static void main(String[] args) {
		/*
		 * 1. Car 객체를 3개 만들어서
		 * 임의의 자동차 이름과 가격을 필드에 각각 대입하는 코드를 작성해 보세요.
		 */
		Car car1 = new Car();
		car1.name ="캐스퍼";
		car1.price=2000;
		
		Car car2 = new Car();
		car2.name="볼보";
		car2.price=5000;
		
		
		Car car3 = new Car();
		car3.name="밴틀리";
		car3.price=9000;
		/* 
		 * 다 하신분은 자신만의 클래스를 test.mypac 패키지에 만들어 놓고
		 * 테스트 하는 코드를 작성해 보세요.
		 */
		
		Menu menu1 = new Menu();
		menu1.name ="샐러디";
		menu1.price=5000;
		menu1.my_rank=1;
		
		Menu menu2 = new Menu();
		menu2.name ="서브웨이";
		menu2.price=6000;
		menu2.my_rank=3;
		
		Menu menu3 = new Menu();
		menu3.price=9000;
		menu3.name ="본죽";
		menu3.my_rank=2;
		
		Menu menu4 = new Menu();
		menu4.name ="수제햄버거";
		menu4.price=10000;
		menu4.my_rank=3;
		
		
	}
}
