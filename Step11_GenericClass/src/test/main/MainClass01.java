package test.main;

import test.mypac.Apple;
import test.mypac.FruitBox;
import test.mypac.Melon;
import test.mypac.Orange;
import test.mypac.*;

public class MainClass01 {
	public static void main(String[] args) {
		//Generic 클래스(포괄클래스)를 Apple 로 지정해서 객체 사용하기
		FruitBox<Apple> box1=new FruitBox<Apple>();
		box1.pack(new Apple());
		Apple a1=box1.UnPack();
		
		//Generic 클래스(포괄클래스)를 Orange 로 지정해서 객체 사용하기
		FruitBox<Orange> box2=new FruitBox<Orange>();
		box2.pack(new Orange());
		Orange o1=box2.UnPack();
		
		//Generic 클래스(포괄클래스)를 Melon 로 지정해서 객체 사용하기
		//객체 생성시에 Generic 은 생략 가능하다.
		FruitBox<Melon> box3=new FruitBox<>();
		box3.pack(new Melon());
		Melon m1=box3.UnPack();
		
		FruitBox<Banana> box4=new FruitBox<>();
		
		
		
		
		
		
		
		
	}

}
