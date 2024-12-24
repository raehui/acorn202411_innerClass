package test.main;

public class QuizMain {
	public static void main(String[] args) {
		/*
		 * run 했을 때 콘솔창에
		 * 
		 * 
		 * 1초
		 * 2초
		 * 3초
		 * .
		 * .
		 * .
		 * 경과 시간이 출력되다가
		 * .
		 * .
		 * 10초
		 * 까지만 출력하고 종료되는 프로그래밍을 해 보세요.
		 * hint=> Thread.sleep(1000);
		 */
		System.out.println("메인 메소드가 시작되었습니다!");
		
		for(int i=0;i<10;i++) {try {
			Thread.sleep(1000);
					
		}catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println(i+1+"초");
		}
		
		//while문으로 실행되게끔
			
	}

}
