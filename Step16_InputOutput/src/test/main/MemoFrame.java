package test.main;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MemoFrame extends JFrame {
	//생성자
	public MemoFrame(String title) {
		super(title);
		
		var topPanel=new JPanel();
		var inputMsg=new JTextField(30);
		var saveBtn=new JButton("save");
		
		topPanel.add(inputMsg);
		topPanel.add(saveBtn);
		setLayout(new BorderLayout());
		add(topPanel,BorderLayout.NORTH);
		saveBtn.addActionListener((event)->{
			String msg=inputMsg.getText();
			
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
			
			
		});
				
	}
	
	public static void main(String[] args) {
		var f=new MemoFrame("메모 프레임");
		f.setBounds(100,100,500,500);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		


		
		
		
	}

}
