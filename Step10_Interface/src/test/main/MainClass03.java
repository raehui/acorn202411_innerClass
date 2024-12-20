package test.main;

import test.mypac.Remocon;

public class MainClass03 {
	public static void main(String[] args) {
		//인터페이스 익명 클래스로 활용해서 구현 후에 참조값을 얻어낼 수 잇다.
		Remocon r1=new Remocon() {			
			@Override
			public void up() {
				//메서드를 재정의할 의무가 생긴다!
				System.out.println("채널을 올려요!");
				// TODO Auto-generated method stub				
			}
			@Override
			public void down() {
				// TODO Auto-generated method stub
				System.out.println("채널을 내려요!");				
			}
		};
		//메서드 호출하면서 지역변수에 담겨져 있은 Remocon type 의 참조값을 전달
		useRemocon(r1);
		//메서드 호출하면서 즉석에서 Remocon type 참조값을 얻어내서 전달
		useRemocon(new Remocon() {
			
			@Override
			public void up() {
				// TODO Auto-generated method stub
				System.out.println("밝기 up");
				
			}
			
			@Override
			public void down() {
				// TODO Auto-generated method stub
				System.out.println("밝기 down");
			}
		});
		}
		
	//메인 밖에서 정의해야 한다.
	//Remocon  인터페이스도 이미 만들어져 있고
	//그 type 을 사용하는 메소드도 이미 만들어져 있는 상황
	
	//개발자는 Remocon 인터페이스를 구현한 클래스를 만들고
	//메소드를 재정의해서 우리가 하고싶은 동작을 메소드 안에 코딩한다.
		public static void useRemocon(Remocon r) {			
			r.up();
			r.down();
	}
}
