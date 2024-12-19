package test.mypac;

public class Phone {
	//클래스 안의 클래스 정의하기
	public class Iphone{
		public void say() {
			System.out.println("저는 아이폰입니다!");
		}
	}
	
	//내부클래스
	public class Android{
		public void say() {
			System.out.println("저는 안드로이드 입니다!");
		}
	}
	
	//Phone 클래스이 멤버 메서드
	public Iphone getIphone() {
		return new Iphone();
	}
	public Android getAndroid() {
		return new Android();
	}
	

}
