package test.main;

import java.util.Scanner;

import test.auto.Car;
import test.auto.Engine;
import test.mypac.Phone;

/*
 * java 에서는 사용하는 모든 data는 Object type 변수나 필드에 담을 수 있다.
 * 
 */
public class MainClass07 {
	public static void main(String[] args) {
		Object a =10;
		Object b=true;
		Object c='a';
		Object d="abce";
		Object e=new Phone();
		Object f=new Scanner(System.in);
		Object g=new Car(new Engine());
		
		Object[] objs=new Object[5];
		objs[0]=10;
		objs[1]=true;
		objs[2]="kim";
		objs[3]=new Phone();
		objs[4]=new Scanner(System.in);
		
		//지역변수 e에 저장된 참조값을 이용해서 전화를 걸어 보세요
		Phone p1=(Phone)e;
		p1.Call();
		//objs 배열의 3번방에 있는 참조값을 이용해서 전화를 걸어 보세요
		Phone p2 =(Phone)objs[3];
		p2.Call();
		//변수에 담지 않고 casting 후에 바로 메서드를 호출할 수 있음
		((Phone)objs[3]).Call();
		
		//objs 배열의 4번방에 있는 참조값을 이용해서 콘솔창을 스캔해보시오
		Scanner s1=(Scanner)objs[4];
		s1.nextLine();
		
		
		
		
	}

}
