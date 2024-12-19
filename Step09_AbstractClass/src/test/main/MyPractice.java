package test.main;

import test.mypac.Weapon;

public class MyPractice {
	public static void main(String[] args) {
		Weapon w1=new Weapon() {
			
			@Override
			public void attack() {
				// TODO Auto-generated method stub
				System.out.println("아무 곳이나 공격하세요!");
			}
		};
		useWeapon(w1);
		
		useWeapon(new Weapon() {
			
			@Override
			public void attack() {
				// TODO Auto-generated method stub
				System.out.println("김구라를 공격하자~");
			}
		});
		
		
		}
		public static void useWeapon(Weapon w) {
			w.prepare();
			w.attack();
		}
	
}
