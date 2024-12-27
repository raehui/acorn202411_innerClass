package test.main;
/*
 * 콘솔창에 입력한 내용 메모장에 추가되게끔
 */

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.util.Scanner;

public class MyPractice {
	public static void main(String[] args) {
		
		//콘솔창에 문자열을 입력
		//입력한 문자열을 
		//특정 파일에 저장되게끔
		System.out.println("문자열을 입력하세요!");
		Scanner scan=new Scanner(System.in);
		String msg=scan.nextLine();
		System.out.println(msg);
		
		try {
			FileOutputStream fos=new FileOutputStream("C:\\Users\\acorn\\Desktop\\playground\\myFolder//memo2.txt");
			fos.write(msg);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
