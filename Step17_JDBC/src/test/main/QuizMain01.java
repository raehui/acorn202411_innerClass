package test.main;

import java.util.Scanner;

import test.dao.MemberDao;
import test.dao.PostDao;
import test.dto.MemberDto;
import test.dto.PostDto;

public class QuizMain01 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("제목 입력: ");
		String title=scan.nextLine();
		System.out.println("글 입력: ");
		String content=scan.nextLine();
		
		//입력한 이름과 주소를 MemberDto 객체에 담기
		PostDto dto=new PostDto();
		dto.setTitle(title);
		dto.setContent(content);
		
		PostDao dao=new PostDao();
		boolean isSuccess =dao.insert(dto);
		if(isSuccess) {
			System.out.printf("%d 번째 글에 제목이 %s로 저장되었습니다.",title);			
		}else {
			System.out.println("저장 실패!");
		}
	}

}
