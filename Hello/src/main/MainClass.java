package main;
/*
 *  eclipse 에서 진한 빨강색으로 표시되는 단어는 예약어 이다.
 *  예약어는 아주 특별히 해석되기로 약속된 단어이기 때문에 식별자(클래스명, 메소드명, 변수명 등등) 으로
 *  사용할 수 없다.
 *  javascript에서 let을 변수명으로 사용할 수 없는 경우처럼...
 * */


public class MainClass {
	public static void main(String[] args) {
		
		System.out.println("Hello, World!");
		System.out.println("김구라, 세상!");
		//let num =10;
		int num =10;
		//let name="김구라";
		String name = "김구라";
		//let isMan = true;
		boolean isMan=true;		
		//num="김";
		
		//0부터 9까지 출력하기
		for(int i=0;i<10;i++) {
			System.out.println(i);
			
		}
		
	}
}
