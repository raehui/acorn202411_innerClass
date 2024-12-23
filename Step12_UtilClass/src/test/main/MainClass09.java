package test.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import test.mypac.MemberDto;

public class MainClass09 {
	public static void main(String[] args) {
		//1. 세명의 회원정보(번호, 이름, 주소)를 HashMap 객체를 생성해서 담아 보세요.
		//HashMap 객체 하나당 한명의 회원정보를 담으니깐 총 3개의 HashMapr 객체가 생성디 되어야 함
		//**여기에 dto는 들어가지 못한는가?
		
		Map<String, Object> member=new HashMap<>();
		Map<String, Object> member1=new HashMap<>();
		Map<String, Object> member2=new HashMap<>();
		
		member.put("num", 1);
		member.put("name", "김구라");
		member.put("addr", "노량진");

		member1.put("num", 2);
		member1.put("name", "해골");
		member1.put("addr", "행신동");
		
		member2.put("num", 3);
		member2.put("name", "원숭이");
		member2.put("addr", "분당");
		
						
		//2. 위에서 생성한 HashMap 객체를 담은 ArrayList 객체를 생성해 보세요.
		List<Map<String, Object>> members =new ArrayList<>();
		
		//3. ArrayList  객체에 HashMap 객체 3개를 담아 보세요.
		members.add(member);
		members.add(member1);
		members.add(member2);
						
		// 4. 반복문 돌면서 ArryList 에 담긴 회원정보를 콘솔창에 출력해 보세요!
		for(Map<String, Object> tmp :members) {
			String info=String.format("번호: %d 이름: %s 주소:%s", tmp.get("num"),tmp.get("name"),tmp.get("addr"));
			System.out.println(info);
		}
		
	}

}
