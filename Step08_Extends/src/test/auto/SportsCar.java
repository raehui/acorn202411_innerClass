package test.auto;
/*
 *  - 접근 지정자 접근범위
 *  
 *  public : 어디에서나 접근 가능 
 *  protected : 동일한 package 혹은 상속관계에서 자식에서 접근 가능 
 *  default(작성 안한 경우) : 동일한 package 안에서만 접근 가능
 *  private : 동일한 클래스(static을 생각하자!) 혹은 동일한 객체 안에서만 접근가능 (한 페이지 안에서만 가능) 
 *  
 *  - 접근 지정자를 붙이는 위치
 *  
 *  1. 클래스를 선언 할때 (import 가능여부를 결정한다)
 *  2. 생성자 (객체 생성 가능여부를 결정한다)
 *  3. 필드 (필드 참조 가능 여부를 결정한다)
 *  4. 메소드 (메소드 호출 가능 여부를 결정한다)
 *  
 *  클래스는 default 와 public 두가지의 접근 지정자만 지정 가능하다
 *  접근 지정자를 생략한것이 default 접근 지정자다 
 */

public class SportsCar extends Car{
	//Engine type 을 매개변수에 전달받은 생성자
	public SportsCar(Engine engine) {
		//자식 생성자에서 받아서 부모에게 전달
		//super()부모 생성자에 engine을 전달
		/*
		 * super()는 부모 생성자(Car 클래스의 생성자)를 의미한다.
		 * 부모 생성자에 필요한 값을 자식 생성자에서 받아서 전달해야 한다.
		 * super() 코드 실행전에 다른 코드가 있으면 안되다.
		 */
		super(engine);
		}
		// TODO Auto-generated constructor stub
		
		//메서드
		public void openDrive() {
			if(this.engine==null) {
				System.out.println("Engine 이 없어서 달릴 수가 없어요!");
				return;
			}
			System.out.println("뚜껑을 열고 달려요!");
		
	}
	

}
