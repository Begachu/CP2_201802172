package �ǽ�2_1;

import java.awt.*;
import javax.swing.*;

	class MyFrame extends JFrame{
		private JButton button;
		private JTextField text1, text2;
		private JPanel panel;
		
		public MyFrame() {
			setTitle("My Frame");
			setSize(600, 200);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setLayout(new FlowLayout());
			
			panel = new JPanel();
			text1 = new JTextField(20);
			text1.setText("������ �����մϴ�.");
			
			text2 = new JTextField(20);
			text2.setText("������ �Ұ����մϴ�.");
			text2.setEditable(false);
			
			button = new JButton("��ư");
			
			panel.add(text1);
			panel.add(text2);
			panel.add(button);
			
			add(panel);
			
			setVisible(true);
		}	
	}
public class Practice02 {
	public static void main(String[] args) {
		new MyFrame();
	}

	
}
