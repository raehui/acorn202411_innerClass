package test.main;

import java.util.Scanner;

public class MainClass03 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("나눌 수 입력:");
		String inputNum1=scan.nextLine();
		
		System.out.println("나누어 지는 수 입력:");
		String inputNum2=scan.nextLine();
		try {
			//문자열 형태의 숫자를 실제 정수로 변경하기
			int num1=Integer.parseInt(inputNum1);
			int num2=Integer.parseInt(inputNum2);
			//계산하기
			int result1=num2/num1; //몫
			int result2=num2%num1; //나머지
			System.out.println(num2+"를"+num1+"으로 나눈 몫:"+result1);
			System.out.println(num2+"를"+num1+"으로 나눈 나머지:"+result2);
		}
		catch (Exception e) {
			//Exception 은 모든 예외의 부모  type 이기 때문에 어떤 예외가 발생해도 여기가 실행된다!
			System.out.println(e.getMessage());
			System.out.println("오류가 발생합니다");
		}finally {
			//예외가 실행되던지 안되던지 무조건 실행한다!
			//중요한 마무리 작업을 여기서 주로 수행한다.
			System.out.println("중요한 마무리 작업을 합니다!");
		}
		
		System.out.println("main 메소드가 정상 종료 됩니다!");
		
		
	}

}
