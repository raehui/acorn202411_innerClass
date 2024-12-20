package test.main;

import java.util.ArrayList;

public class MainClass02 {
	public static void main(String[] args) {
		//정수를 저장할 수 있는 ArrayList<Integer> 객체를 생성해서 참조값을 지역변수 nums 에 담기
		ArrayList<Integer> nums=new ArrayList<>();
		//ArrayList 객체에 10,20,30 숫자 3개를 담기
		nums.add(10);
		nums.add(20);
		nums.add(30);
		//ArrayList 객체에 저장된 숫자를 for문을 이용해서 순서대로 콘솔창에 출력해 보세요.
		//ArrayList type를 만드는 이유는 ArrayList 객체의 기능을 이용하기 위해서 만든다.
		for(int i=0;i<nums.size();i++) {
			 
			int a=nums.get(i);
			 System.out.println(a);
		}
		
		System.out.println("---확장 for문을 이용하면---");
		
		for(int a: nums) {
			System.out.println(a);
		}
		
	
		
	}

}
