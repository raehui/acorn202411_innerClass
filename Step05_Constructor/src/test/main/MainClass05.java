package test.main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MainClass05 {
	public static void main(String[] args) throws FileNotFoundException {

		File f=new File("src/test/mypac/memo.txt");		
		Scanner scan = new Scanner(f);
		while(true) {
			String line =scan.nextLine();
			/*
			 * System 클래스 안에 있는 out 필드에 있는 PrintStream 객체의 도움을 받으면
			 * 콘솔창에 문자열을 출력할 수 있다. 
			 */
			
			System.out.println(line);
			
		}
		
		
	}
}
