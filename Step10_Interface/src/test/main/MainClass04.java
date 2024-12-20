package test.main;

import test.mypac.Drill;

public class MainClass04 {
	public static void main(String[] args) {
		Drill d1=new Drill() {			
			@Override
			public void hole() {
				// TODO Auto-generated method stub
				System.out.println("책상에 구멍을 뚫어요!");
			}
		}; //객체에 동작이 하나 포장되어 있다.
		
		userDrill(d1); //해당 객체를 메소드를 호출하면서 전달한다.
		
		//()->{}; 
		//하나의 객체를 만들어서 메서드 DIY
		Drill d2=()->{
			System.out.println("의자에 구멍을 뚫어요!");
			
		}; 
		 userDrill(d2);
		 
		 //모양은 이렇지만 객체다!
		 //Drill interface를 implements 받아서 override의 의무를 다함
		 userDrill(()->{
			 System.out.println("벽에 구멍을 뚫어요!");
		 });
		 
		 
	}
	
	public static void userDrill(Drill d) {
		//메소드 안에서는 객체에 포장된 1개의 동작을 사용한다
		d.hole();
		d.hole();
	}

}
