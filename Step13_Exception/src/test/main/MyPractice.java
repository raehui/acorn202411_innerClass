package test.main;

import java.util.Random;

import test.mypac.GoException;
import test.mypac.MyUtil;

public class MyPractice {
	public static void main(String[] args) throws InterruptedException  {
		Random ran1=new Random();
		int num=ran1.nextInt(11);
		
		if(num==10) {
			new GoException("집에 어서 가세요!");
		}
		System.out.println(num);
	
		
	}


}
