package test.main;

import java.io.IOException;
import java.io.InputStream;

/*
 *  입력, 출력(Input Output)
 *  
 *  - 어떤 대상으로 부터 데이터를 메모리로 읽어 들이는 것을 입력이라고 한다.
 *  - 프로그래밍 언어의 관점에서 메모리라는 것은 변수 or 필드 or 객체 로 생각하면 편한다.
 *  - 데이터는 2진수로 이루어져 있지만 2진수 8개의 묶음인 1byte 단위로 생각하면 편하다.
 *  - 1byte 는 총 256 가지의 값을 표현할 수 있다.
 *  - 1byte 를 10진수로 환산하면 0~255 사이의 숫자숭에 하나이다.
 *  - 입력과 출력을 통해서 이동하는 데이터는 byte(byte 알갱이) 하나 하나가 이동한다고 생각하면 된다.
 */
public class MainClass01 {
	public static void main(String[] args) {
		System.out.println("main 메서드가 시작 되었습니다.");
		//키보드와 연결된 InputStream type의 참조값을 kdb라는 지역변수에 담기
		//InputStream 객체는 1바이트 단위 처리 스트림이다.
		//영문자, 대소문자,숫자, 특수문자만 처리할 수 있고
		//한글은 처리가 불가능하다.
		InputStream kbd=System.in; //System.in은 객체로 읽어 들어오는 메서드를 포함하고 있다.
		
		try {
			//읽은키의 코드값을 리턴해줌
			int code=kbd.read();
			System.out.println("code:"+code);
			//code값에 대응되는 문자 얻어내기
			char ch=(char)code;
			System.out.println("ch:"+ch);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
