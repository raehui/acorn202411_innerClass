package test.main;

import test.mypac.MyUtil;
import test.mypac.YourUtil;

public class MainClass07 {
	public static void main(String[] args) {
		//static는 객체 생성 없이 사용 가능
		//Myutil 클래스의 static 메소드 호출
		MyUtil.send();
		//Myutil 클래스의 static 필드 참조
		String a = MyUtil.version;
		
		YourUtil.remove();
		String b=YourUtil.color;
		
		
	}
}