package test.main;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class MainClass11 {
	public static void main(String[] args) {
		try {
			//파일로 부터 byte 알갱이를 읽어들일 객체 생성
			var fis=new FileInputStream("C:\\Users\\acorn\\Desktop\\playground\\myFolder\\1.jpg");
			//byte 알갱이를 파일에 출력할 때 객체 생성
			var fos=new FileOutputStream("C:\\Users\\acorn\\Desktop\\playground\\myFolder\\copied.jpg");
			
			//반복문 돌면서
			while(true) {
				//1.byte 읽어들여서 int type으로 변환시킴(0~256까지 표현 가능함)
				int readByte=fis.read();
				System.out.println(readByte);
				
//				byte readByte=(byte)fis.read(); (byte로 변환하면 -128~127까지 표현 가능)
//				System.out.println(readByte);
				
				
				//if문 뒤에 코드가 한줄이면 {} 생략
				if(readByte==-1) break;
				//읽어들인 1byte 출력
				fos.write(readByte);
				fos.flush();
				
			}
			System.out.println("파일을 copy했습니다.");
			//마무리 작업
			//파일관련 작업은 모두 닫아줘야 함
			fos.close();
			fis.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
