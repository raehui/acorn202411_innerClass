package test.main;

public class MyPractice {
	//클래스 내부에 클래스를 만듬
	//main 메서드에서 객체 만들어서 RaeHui 메서드 이용
	public static class RaeHUi{
		public void say() {
			System.out.println("안녕 나는 래희야!");
		}
	}
	
	public static void main(String[] args) {
		RaeHUi r1=new RaeHUi();
		r1.say();		
		//메서드 안에 클래스 만들기
			class Travel{
				public void travel() {
					System.out.println("나는 여행을 갈래요!");
				}
			}
			Travel t1 = new Travel();
			t1.travel();	
	}
}
