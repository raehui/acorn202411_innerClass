package test.main;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MainClass07 {
	public static void main(String[] args) {
		// \는 특별하게 해석하지 마!
		System.out.println("main() 메서드가 \"시작\" 되었습니다.");
		System.out.println("main()메소드가 \\시작\\ 되었습니다");
		System.out.println("안녕하세요 저는 \"래희\"입니다");
		
		//파일에 저장할 문자열
		String msg="나는 java의 신이다!";
		//파일에 msg 변수 안에 들어있는 문자열을 출력하기
		//메모 파일 만들고 메모 파일 안에 출력하기
		
		//memo.txt 파일을 만들기 위한 File 객체 생성
//		File f =new File("C:\\Users\\acorn\\Desktop\\playground\\myFolder\\memo.txt");
		//슬래시는 하나만써도 인식한다.
		File f =new File("C:/Users/acorn/Desktop/playground/myFolder/memo.txt");
		try {
			//만약 해당 파일이 존재하지 않으면
			if(!f.exists()) {
				//새로 만들어라
				f.createNewFile();
				System.out.println("memo,txt 파일을 만들어라");
			}
			//문자열을 파일에 출력하는 객체
			//new fileWriter(File 객체, append mode 여부)
			var fw=new FileWriter(f,true);
			fw.append(msg);
			fw.append("\r\n");//개행기호
			fw.flush();//실제출력
			fw.close();//마무리
			System.out.println("memo,txt 파일에 문자열을 기록했습니다.");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
