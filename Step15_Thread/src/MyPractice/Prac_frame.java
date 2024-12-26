package MyPractice;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Prac_frame extends JFrame{
	public Prac_frame(String title) {
		super(title);
		
		setLayout(new FlowLayout());
		
		var startBtn=new JButton("작업시작");
		add(startBtn);
		var startBtn2=new JButton("작업시작2");
		add(startBtn2);
		
		this.setBounds(100, 100, 500, 500);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
		
		startBtn.addActionListener((e)->{
			System.out.println("10 초 걸리는 작업을 시작합니다.");
			try {
				Thread.sleep(1000*10);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			System.out.println("작업이 종료 되었습니다");
		});
		//외부클래스 + 객체 생성
		startBtn2.addActionListener((e)->{
			var pt1=new Prac_Thread();
			pt1.start();
		});
		

		
		
		
	}
	public static void main(String[] args) {
		new Prac_frame("나의 연습");
		
	}//main end
	
}
