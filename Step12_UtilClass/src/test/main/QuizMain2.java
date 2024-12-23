package test.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class QuizMain2 {
	public static void main(String[] args) {
		//1. 로또 번호를 담을 HashSet 객체를 생성해서 set1이라는 지역 변수에 담아 보세요
		Set<Integer>set1=new HashSet<>();
		
		//2. while 문을 이용해서 랜덤한 로또 번호를 set1 에 반복적으로 담아 보세요
		//while 문 탈출 조건은 set1.size()가 6이 되면 탈출되도록 해 보세요.
		Random ran1=new Random();
//		while(true) {
//			//1~45 사이의 랜덤한 숫자를 얻어내서
//			if(set1.size()<6) {
//				int num=ran1.nextInt(45)+1;
//				set1.add(num);
//			}
//			break;
//			
//		}
		
		while(true) {
			int ranNum=ran1.nextInt(45)+1;
			set1.add(ranNum);
			
			if(set1.size()==6) {
				break;
			}
		}
		
		
		
		//3. set1 에 담긴 번호를 오름 차순 정렬해서 콘솔창에 모두 출력해 보세요.
		List<Integer> nums=new ArrayList<>(set1);
		Collections.sort(nums);
		
		for(Integer tmp:nums) {
			System.out.println(tmp);
		}
		
		
		
	}

}
