package test.mypac;

public class IosPhone extends HandPhone {
	public IosPhone() {
		System.out.println("IosPhone 생성자가 호출되었습니다!");
	}
	//메서드
	public void Game() {
		System.out.println("게임을 실행할 수 있습니다!");
	}
	@Override
	public void takePicture() {
		// TODO Auto-generated method stub
//		super.takePicture();
		System.out.println("2000만 화소의 사진을 찍을 수 있습니다!");
	}
	
	public void Dang() {
		System.out.println("댕댕댕 알람이 울려요~!");
	}
	@Override
	public void mobileCall() {
		// TODO Auto-generated method stub
//		super.mobileCall();
		System.out.println("운전하면서 전화를 걸어요~");
	}

}
