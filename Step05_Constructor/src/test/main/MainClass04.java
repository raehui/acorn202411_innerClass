package test.main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MainClass04 {
	public static void main(String[] args) throws FileNotFoundException {
		//객체를 제대로 만들어야 전달할 수 있음 
		
		File f=new File("src/test/mypac/memo.txt");
		
		//여기서 scan는 src/test/mypac/memo.txt 파일을 읽어올 수 있는 기능
		//용도에 따라서 다른 생성자를 만들 수 있음
		Scanner scan=new Scanner(f); 
		
		//줄 단위로 읽어들임
		
		String line =scan.nextLine();
		System.out.println("memo.txt 파일의 첫번째 줄:"+ line);
		
		/*
		 *
		 * public class Scanner{
		 * 		public Scanner(File file){
		 * 	 }
		 * }
		 */
	}

}
