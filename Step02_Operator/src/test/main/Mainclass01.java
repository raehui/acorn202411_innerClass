package test.main;
/*
 * 1. 산술연산자 테스트
 * +,-,*,/,%
 * */

public class Mainclass01 {
	public static void main(String[] args) {
		int num1=5;
		int num2=2;
		//+연산하기
		int sum=10+1;
		int sum2=num1+num2;
		int sum3=10+num2;
		//정수끼리 연산하면 결과는 정수만 나온다.
		int result1=5/3;
		int result2=num1/num2;
		//연산의 결과로 실수 값을 얻어내고 싶으면 적어도 하나는 실수여야 한다.
		double result3=5/3.0; //3.0 = 3d
		
		//type casting (형 변환)
		
//		byte a =10;
//		int b=a;
		
		/*
		 * a 자체는 int type이지만 (byte)연산자로 casting하면
		 * 대입연산자의 우측에는 byte type 이 있다고 간주되어서 문법이 성립한다.
		 * 대신 a 안에 들어 있는 값이 byte 범위안에 들어 있다는 것이 확실할때만
		 * casting 해야지 오류가 없다. 
		 * 범위가 넘어가면 컴파일에는 오류가 없지만 런할때는 오류가 발생함*/
		int a=129;
		byte b=(byte)a;
		
	}

}
