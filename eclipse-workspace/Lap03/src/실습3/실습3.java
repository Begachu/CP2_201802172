package �ǽ�3;

import java.awt.*;
import javax.swing.*;

class MileToKilloFrame extends JFrame{
	private JPanel p, p1;
	private JTextField inputTextField, outputTextField;
	private JButton b1;
	public MileToKilloFrame() {
		setTitle("������ ų�ι��ͷ� ��ȯ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		p = new JPanel();
		p.setLayout(new BoxLayout(p, BoxLayout.Y_AXIS));
		
		p1 = new JPanel();
		p1.add(new JLabel("�Ÿ��� ���� ������ �Է��Ͻÿ�."));
		inputTextField = new JTextField(10);
		p1.add(inputTextField);
		
		b1 = new JButton("��ȯ");
		b1.setAlignmentX(Component.CENTER_ALIGNMENT);
		outputTextField = new JTextField(30);
		
		p.add(p1);
		p.add(b1);
		p.add(outputTextField);
		
		add(p);
		pack();
		setVisible(true);
	}
}

public class �ǽ�3 {
	public static void main(String args[]) {
		MileToKilloFrame M = new MileToKilloFrame();
	}

}
