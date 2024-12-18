package test.auto;

public class Car {
	//필드(ptotected는 패키지가 달라도 상속관계 자식이면 참조가능)
	protected Engine engine;
	//Engine 객체를 생성자의 인자로 전달받는 생성자( 이 생성자를 정의하면 default 생성자는 사라진다)
	public Car(Engine engine) {
		this.engine=engine;	
	}
	//메서드
	public void drive() {
		if(this.engine==null) {
			System.out.println("Engine 이 없어서 달릴 수가 없어요!");
			return; //메서드를 여기서 리턴시키기(종료 시키기)
		}
		System.out.println("달려요~");
	}
}
