package test.main;

import test.mypac.SeaWeapon;
import test.mypac.Weapon;

public class MainClass04 {
	//내부안의 클래스를 만들어서 하는 방법
	static class SeaWeapon1 extends Weapon{
		@Override
		public void attack() {
			// TODO Auto-generated method stub
			System.out.println("바다에 있는 적들을 공격합니다!");			
		}
	}
	
	public static void main(String[] args) {
		
		//아래의 useWeapon()메소드를 호출하려면 Weapon type 의 참조값이 필요하다, 하지만 Weapon의 자식이 올수도
		//아래의 메소드를 호출했을때 "바다에 있는 적들을 공격" 하려면 여기에서 어떻게 코딩해야 할까?
		
		Weapon w1=new SeaWeapon1();		
		MainClass04.useWeapon(w1);
		
		//메서드 안에 클래스 정의하기
		class SpaceWeapon extends Weapon{

			@Override
			public void attack() {
				// TODO Auto-generated method stub
				System.out.println("우주를 공격해요!");				
			}			
		}
		useWeapon(new SpaceWeapon());
	} 
	
	// 자식을 받을 수 있음
	public static void useWeapon(Weapon w) {
		w.prepare();
		w.attack();
		
	}
		
}
