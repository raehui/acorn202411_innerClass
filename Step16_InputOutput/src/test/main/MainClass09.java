package test.main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/*
 * C:/Users/acorn/Desktop/playground/myFolder/memo.txt 파일에 저장된 문자열 읽어와서
 * 콘솔창에 출력하는 예제
 */
public class MainClass09 {
	public static void main(String[] args) {
		File f =new File("C:/Users/acorn/Desktop/playground/myFolder/memo.txt");
		try {
			//파일로 부터 문자열을 읽어들일 수 잇는 객체 생성
			var fr=new FileReader(f);
			//문자열을 줄다위로 읽어들일수 있는 객체
			var br=new BufferedReader(fr);
			//무한 루프 돌면서
			while(true) {
				String line=br.readLine();
				//더 이상 읽어올 문자열이 없으면 반복문 탈출
				if(line==null) {
					break;
				}
				//읽어낸 문자열을 한줄씩 콘솔창에 출력
				System.out.println(line);				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
