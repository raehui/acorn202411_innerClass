package test.main;

import java.util.Scanner;

public class MainClass03 {
	public static void main(String[] args) {
		/*
		 * System 클래스의 in이라는 필드에는 콘솔창으로부터 입력 받을 수 있는
		 * 객체의 참조값이 들어 있다.
		 * in의 type은 InputStream 이다.
		 * Scanner 클래스의 생성자는 아래와 같은 모양의 생성자가 있다.
		 * Scanner(InputStream is)
		 * 따라서 아래의 코드는 콘솔창으로 부터 입력받을 수 있는 Scanner 객체가 생성된 것이다.
		 */
		System.out.println("문자열 입력:");
		
		//새로운 스캐너에 콘솔창을 읽어오는 객체의 참조값 넣기
		//어떤 용도로 사용할 것인가
		//inputStream type 객체의 참조값을 Scanner 클래스의 생성자에 전달해서 객체 생성
		//
		Scanner scan=new Scanner(System.in); 
		
		//scan로 읽어 들어온 문자를 대입
		String line=scan.nextLine();
		
		System.out.println("입력한 문자열 :"+ line);
		
	}
}
