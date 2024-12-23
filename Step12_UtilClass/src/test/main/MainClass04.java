package test.main;

import java.util.ArrayList;
import java.util.function.Consumer;

import test.mypac.Car;

public class MainClass04 {
	public static void main(String[] args) {
		//1. Car type 을 저장할 수 있는 Arraylist 객체를 생성해서
		//참조값을 List 인터페이스 type 지역변수 cars 에 담아보세요.
		ArrayList<Car>cars=new ArrayList<>();
		
		//2. Car객체를 (3개) 생성해서 List 객체에 저장해 보세요.
		cars.add(new Car("소나타"));
		cars.add(new Car("캐스퍼"));
		cars.add(new Car("볼보"));
		
		//3. 일반 for 문을 이용해서 ArrayList 객체에 저장된 모든 Car 객체의 drive()메소드를 
		//순서대로 호출해 보세요.
		for(int i=0;i<cars.size();i++) {
			Car a=cars.get(i);
			a.drive();			
		}
		
		System.out.println("----확장 for문-----");
		//4. 확장 for 문을 이용해서 ArrayList 객체에 저장된 모든 Car 객체의 drive()메소드를
		//순서대로 호출해 보세요.
		for(Car a:cars) {
			a.drive();
		}
		
		System.out.println("----forEach-----");
		//5. ArrayList 객체의 forEach()메소드를 이용해서 ArrayList 객체에 저장된 모든 Car 객체의 drive()
		//메소드를 순서대로 호출해 보세요.		
		cars.forEach((b)->{//cars 리스트에 들어 있는 첫번째 요소를 b라는 이름으로 전달
			b.drive();
		});
			
	}//main end

}
