package test.mypac;

public class Member {
	//필드를 static 혹은 nonstatic로 만들건지 결정
	public int num;
	public String name;
	public String addr;
	
	//기본 생성자
	public Member() {
		
	}
	
	//method가 아니다 이유는 return type이 명시 되지 않았다
	//생성자로 리턴 타입이 없으면서 class 랑 이름이 동일함
	//값을 3개 전달 받은 생성자(Constructor)
	//생성자를 하나라도 만들면 기본 생성자는 사라짐
	public Member(int num, String name, String addr) {
		//매개 변수에 전달된 값을 필드에 저장하기
		this.num =num;
		this.name=name;
		this.addr=addr;
	}
	
	//필드에 저장된 정보를 콘솔창에 출력하는 메소드
	public void showInfo() {
		// 필드에 저당된 회원 정보를 1줄로 콘솔창에 출력하는 코드		
		String info ="번호:"+this.num+" 이름:"+ this.name +" 주소:"+this.addr;
		System.out.println(info);
	}
	
	public void shwoInfo2()	{
		String info2="번호:" + this.num + " 이름:" +this.name + " 주소:" + this.addr+" 입니다";
		System.out.println(info2);
	}
	
	//매개변수에 전달된 번호를 필드에 저장하고 자신의 참조값을 리턴하는 메소드
	//위에서의 필드값을 이용해서 자신의 참조값에 넣기
	public Member num(int num) {
		//입력된 값을 필드에 넣기
		this.num=num;
		return this;	
	}
	
	//매개변수에 전달된 이름를 필드에 저장하고 자신의 참조값을 리턴하는 메소드
	public Member name(String name) {
		this.name=name;
		return this;
	}
	//매개변수에 전달된 주소를 필드에 저장하고 자신의 참조값을 리턴하는 메소드
	public Member addr(String addr) {
		this.addr=addr;
		return this;
	}
}
