package test.main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.io.File;
import java.io.FileWriter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MyGui extends JFrame {
	//생성자
	public MyGui() {
		//프레임의 제목 설정
		this.setTitle("나의 파일 읽어오기");
		//프레임의 위치와 크기 설정 setBounds(x, y, width, height)
		setBounds(100, 100, 500, 500);
		//종료 버튼을 눌렀을때 프로세스 전체가 종료 되도록 한다 
		setDefaultCloseOperation(EXIT_ON_CLOSE);		
		// 레이아웃 메니저 객체 생성 
		BorderLayout layout=new BorderLayout();	
		//프레임의 레이아웃 메니저 설정
		setLayout(layout);	
				
		//TextField 와 Button 을 배치할 Panel 객체 
		JPanel topPanel=new JPanel();
		topPanel.setBackground(Color.YELLOW);
		//TextField 와 Button 을 생성해서 
		JTextField inputMsg=new JTextField(30);
		JButton sendBtn=new JButton("받아오기");
		//Panel 에 추가
		topPanel.add(inputMsg);
		topPanel.add(sendBtn);
		//프레임의 위쪽에 Panel 추가
		add(topPanel, BorderLayout.NORTH);
		
		//버튼을 눌렀을 때 호출되는 함수 
		sendBtn.addActionListener((evnet)->{
			String savemsg=inputMsg.getText();
			File f =new File("C:/Users/acorn/Desktop/playground/myFolder/memo.txt");
			try {
				if(!f.exists()) {
					f.createNewFile();
					System.out.println("memo,txt 파일을 만들어라");					
				}
				var fw=new FileWriter(f,true);
				fw.append(savemsg);
				fw.append("\r\n");//개행기호
				fw.flush();//실제출력
				fw.close();//마무리
				System.out.println("memo,txt 파일에 문자열을 기록했습니다.");
				
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}			
		});
		
		setVisible(true);	
	}
	
	public static void main(String[] args) {
		new MyGui();
		
	}


}
