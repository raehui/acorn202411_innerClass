package test.mypac;

public class AppleBox {
	//필드
	private Apple item;
	
	//사과를 포장하는 메소드
	public void pach(Apple item) {
		this.item =item;
	}
	//사과를 꺼내는 메소드
	public Apple unPack() {
		return item;
	}
	

}
