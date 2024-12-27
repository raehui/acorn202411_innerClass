package test.main;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class MainClass12 {
	public static void main(String[] args) {
		//선언과 대입을 따로
		FileInputStream fis=null;
		FileOutputStream fos=null;
		
		try {
			//파일로 부터 byte 알갱이를 읽어들일 객체 생성
			fis=new FileInputStream("C:\\Users\\acorn\\Desktop\\playground\\myFolder\\1.jpg");
			//byte 알갱이를 파일에 출력할 때 객체 생성
			fos=new FileOutputStream("C:\\Users\\acorn\\Desktop\\playground\\myFolder\\copied.jpg");
			//byte 알갱이 여러개를 한번에 담을 배열 미리 준비하기
			byte[]buffer=new byte[1024]; //한번에 1kb
			//byte[]buffer=new byte[1024*1024]; //한번에 1mb
						
			//반복문 돌면서
			while(true) {
				//byte[] 배열을 전달해서 byte 알갱이를 한번에 1024 개씩 읽어준다.
				int readedCount=fis.read(buffer); //읽어들인 갯수가 리턴된다.
				System.out.println(readedCount+"byte 를 읽었습니다"); //0번방부터 51번째 방까지만 읽어오기
				if(readedCount==-1)break; //더 이상 읽을 데이터가 없다면 반복문 탈출
				//byte[] 배열에 저장된 byte 알갱이를 0번 인덱스로 부터 읽은 갯수만큼만 출력하기
				fos.write(buffer, 0, readedCount);				
			}
			System.out.println("파일을 copy했습니다.");
			//마무리 작업
			//파일관련 작업은 모두 닫아줘야 함
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				//마무리 작업
				//파일관련 작업은 모두 닫아줘야 함
				if(fos!=null)fos.close();
				if(fis!=null)fis.close();
			} catch(Exception e) {}
			
		}
		
	}
}
