package test.main;

//test.util.MyUtil클래스 안에 있는 모든 static 자원을 import 하기
import static test.util.MyUtil.*;

import test.mypac.Phone;

public class MainClass10 {
	public static void main(String[] args) {
		//static import 를 하면 마치 자신(MainClass10)의 멤버 static 메서드 처럼 사용할 수 있다.
		clear();
		light();
		send();
		
		
		
		
	}
	

}
