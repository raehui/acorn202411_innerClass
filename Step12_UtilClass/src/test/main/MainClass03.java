package test.main;

import java.util.ArrayList;
import java.util.function.Consumer;

public class MainClass03 {
	public static void main(String[] args) {
		//인사말을 담을 ArrayList 객체를 생성해서 참조값을 greets 라는 지역변수에 담기
		ArrayList<String> greets=new ArrayList<>();
		//greets 에 들어있는 참조값을 이용해서 인사말 3개을 임의로 담아보세요!
		greets.add("안녕");
		greets.add("메리크리스마스");
		greets.add("새해 복 많이 받으세요!");
		
		//확장 for문을 이용해서 모든 인사말을 콘솔창에 순서대로 줄력해 보세요.
		for(String a:greets) {
			System.out.println(a);
		}
		
		System.out.println("---- ---");
		
		//consumer
		Consumer<String> con=new Consumer<>() {
			
			@Override
			public void accept(String t) {
				// TODO Auto-generated method stub
				//매개 변수에 전달되는 item 을 가지고 어떤 작업을 할지 여기에 coding 을 하면된다.
				System.out.println(t);
			}
		};
		/*
		 * Arraylist 객체의 forEach() 메소드를 호출하면 Consumer type 객체를 전달하면
		 * 전달된 객체의 accept() 메소드를 호출하면서 - 
		 * 그렇다면 accept()메소드는 Consumer 객체에 있는 메소드인가? 맞음
		 * Arraylist 객체에 저당된 item 을 순서대로 매개 변수에 전달해 준다.
		 */
				
		//forEach는 Consumer type이랑 꼭 같이 사용해야 한다.
		greets.forEach(con);
		System.out.println("--------");
		
		
		Consumer<String> con2=(t)->{
			System.out.println(t);
		};
		
		greets.forEach(con2);
		
		System.out.println("--------");
		
		greets.forEach((t)->{
			System.out.println(t);
		});
				
//		greets.forEach(new Consumer<String>(){
//			public void accept(String t) {
//				System.out.println(t);
//			}
//		});
//		
//		System.out.println("---화살표 함수 이용하기--");
//		//화살표 함수 사용해서 이용하기
//		//메서드가 하나이기에 가능
//		greets.forEach((String a)->{
//			System.out.println(a);
//		});		
	}//main end
}
