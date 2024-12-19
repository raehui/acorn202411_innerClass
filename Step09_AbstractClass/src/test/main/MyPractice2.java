package test.main;

public class MyPractice2 {
	public static class Cup{
		public void cup() {
			System.out.println("나는 핑크컵을 갖고있엉");
		}
	}
	
	public static void main(String[] args) {
		Cup c1=new Cup();
		c1.cup();
		
		//class 생성하기
		class Dog{
			public void wang() {
				System.out.println("강쥐가 왕왕왕");
			}			
		}
		Dog d1=new Dog();
		d1.wang();
	}
	
	

}
