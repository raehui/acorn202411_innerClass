package test.main;

import test.mypac.Weapon;

public class MyPractice {
	//클래스 안의 메서드
	public static void mung() {
		System.out.println("멍멍멍!");
	}
	//메인메서드
	public static void main(String[] args) {
		MyPractice m=new MyPractice();
		m.mung();
		
		//메서드 안에 클래스 생성하기, 로컬 이너 클래스
		class yang{
			public static void yang1() {
				System.out.println("냥냥~");
			}
		}
		
		yang.yang1();
		
		
		
		}
	
}
