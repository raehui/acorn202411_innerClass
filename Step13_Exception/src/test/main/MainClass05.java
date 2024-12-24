package test.main;

public class MainClass05 {
	public static void main(String[] args) throws InterruptedException {//메인메소드가 예외를 처리하게끔 
		System.out.println("main 메소드가 시작 되었습니다!");
		
		//실행의 흐름을 일정시간 머무르게 하는 기능		
		Thread.sleep(1000*5);
	
		System.out.println("main 메소드가 종료됩니다!");
	}

}
