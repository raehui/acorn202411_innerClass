package test.main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/*
 * C:/Users/acorn/Desktop/playground/myFolder/memo.txt 파일에 저장된 문자열 읽어와서
 * 콘솔창에 출력하는 예제
 */
public class MainClass10 {
	public static void main(String[] args) {
		
		//문자열을 누적 시킨다음 한번에 누적된 문자열을 얻어낼 수 있는 객체 생성
		var sb=new StringBuilder();
		
		File f =new File("C:/Users/acorn/Desktop/playground/myFolder/memo.txt");
		try {
			//파일로 부터 문자열을 읽어들일 수 잇는 객체 생성
			var fr=new FileReader(f);
			//문자열을 줄다위로 익어들일수 있는 객체
			var br=new BufferedReader(fr);
			//무한 루프 돌면서
			while(true) {
				String line=br.readLine();
				//더 이상 읽어올 문자열이 없으면 반복문 탈출
				if(line==null) {
					break;
				}
				//읽어낸 문자열을 StringBuilder 객체에 누적 시키기
				sb.append(line);
				sb.append("\r\n");//개행기호
							
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		// StringBuilder 객체에 누적된 문자열을 한번에 출력하기
		String result=sb.toString(); //한번에 String type으로 변경하기
		System.out.println(result);
		
		
	}

}
