package test.mypac;

public class MyRemocon implements Remocon{
	//git 변경사항입니다!
	@Override
	public void up() {
		// TODO Auto-generated method stub
		System.out.println("볼륨을 올려요!");
		
	}

	@Override
	public void down() {
		// TODO Auto-generated method stub
		System.out.println("볼륨을 내려요!");
	} // 인터페이스는 implements  해야 한다

}
