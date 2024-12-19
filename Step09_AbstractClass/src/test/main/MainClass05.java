package test.main;

import test.mypac.Weapon;

public class MainClass05 {
	public static void main(String[] args) {

//		Weapon w1 = new Weapon() {//class ? extends Weapon{}
			
			Weapon w1=new Weapon() {
				
				@Override
				public void attack() {
					// TODO Auto-generated method stub
					System.out.println("공격하기");
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
