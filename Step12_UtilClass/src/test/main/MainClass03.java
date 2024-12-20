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
		
		Consumer<String> con=new Consumer<>() {
			
			@Override
			public void accept(String t) {
				// TODO Auto-generated method stub
				System.out.println(t);
			}
		};
				
		//forEach는 Consumer type이랑 꼭 같이 사용해야 한다.
		greets.forEach(con);
		System.out.println("---- ----");
		
		greets.forEach(new Consumer<String>(){
			public void accept(String t) {
				System.out.println(t);
			}
		});
		
		System.out.println("---화살표 함수 이용하기--");
		//화살표 함수 사용해서 이용하기
		//메서드가 하나이기에 가능
		greets.forEach((String a)->{
			System.out.println(a);
		});
		
		

		
		
		
		
		
		
	}//main end
}
