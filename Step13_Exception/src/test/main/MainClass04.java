package test.main;

public class MainClass04 {
	public static void main(String[] args) {
		System.out.println("main 메소드가 시작 되었습니다!");
		
		//실행의 흐름을 일정시간 머무르게 하는 기능		
		try {
			Thread.sleep(1000*5); //스레드를 일정시간 지연 시키기 (mili second 단위로 숫자를 전달하면 된다!)
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("main 메소드가 종료됩니다!");
	}

}
