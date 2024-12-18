package test.main;

import java.util.Random;
import java.util.Scanner;

public class MainClass04 {
	
	public static void main(String[] args) {
		//String type 이 저장되어 있는 배열
		String[] data = {"🍒", "🍎", "🍌", "🍈", "7"};
		//배열에 저장된 문자열중에 1개가 랜덤하게 콘솔창에 출력되도록 프로그래밍
		Random ran =new Random();
		// 0~4 사이의 랜덤한 정수가 얻어내진다.
		//나왔던 숫자를 저장할 배열 객체 생성
		int[] snum =new int[3];		
		Scanner scan=new Scanner(System.in);
		//기본점수
		int score= 1000;
		//사용자가 시작하기 전에 점수를 배팅
		System.out.println("당신은 얼마나 배팅하겠습니까?");
		String multi= scan.nextLine();
		int multi_int=Integer.parseInt(multi);
		
		while(true) {
			System.out.println("진행할려면 엔터를 치세요");
			scan.nextLine(); //스캔기가 엔터를 인지해서 진행한다
			//score를 10씩 감소 시키기
			score -=10;
			
			for(int i=0;i<3;i++) {
				int num=ran.nextInt(data.length);
				System.out.print(data[num]+" ");			
				//나왔던 숫자를 배열에 순선대로 저장한다.
				snum[i]= num;
			}
			System.out.println();
			//나온 숫자 저장 -> for 끝나고 나서 -> 하나라도 다르면 0점
			if((snum[0]==snum[1]) && (snum[1]==snum[2])) {
				System.out.print("100점");
				score +=100;
			}else {
				System.out.println("0점");
			}
			
			System.out.println("score: "+score);
			if(score ==0 ) {
				System.out.println("게임오버");
				break;
			}else if(score>=1100) {
				System.out.println("당신의 승리!");
				break;
			}
			//777의 특별한 조합이 나오면 큰 점수 주기
			if(snum[0]==4 && snum[1]==4 &&snum[2]==4) {
				System.out.println("당신에게 777점 부여");
				score +=777;				
			}
			
						
		} // while end
					
	}

}
