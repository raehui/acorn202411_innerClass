package test.main;

import test.mypac.Weapon;

public class MainClass05 {
	public static void main(String[] args) {
		//익명의 inner class를 이용해서 Weapon type 의 참조값을 얻어내서 변수에 담은 다음
//		Weapon w1 = new Weapon() {//class ? extends Weapon{}
			
			Weapon w1=new Weapon() {
				
				@Override
				public void attack() {
					// TODO Auto-generated method stub
					System.out.println("공격하기");
				}
			};
			//메소드 호출하면서 전달하기
			useWeapon(w1);
			
			//메소드 호출하면서 즉석에서 Weapon type 의 참조값을 얻어내서 전달하기
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
