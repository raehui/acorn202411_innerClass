package test.main;

import test.mypac.Practice;

public class Mypractice {
	public static void main(String[] args) {
		Practice.send();
		Practice.input();
		//tring 는 같은 문자열이면 스트링풀에 같은 객체로 저장되기에
		//같은 id로 나옴
		String a = Practice.my_1;
		String b = Practice.my_2;
		System.out.println(a);
		
		
	} 
}
