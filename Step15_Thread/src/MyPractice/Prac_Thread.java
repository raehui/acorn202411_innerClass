package MyPractice;

public class Prac_Thread extends Thread{
	@Override
	public void run() {
		System.out.println("5초 걸리는 작업을 실행합니다!");
		try {
			Thread.sleep(1000*5);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("5초 걸리는 작업이 끝났습니다.");
	}

}
