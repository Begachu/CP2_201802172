package hw01;

import java.awt.*;
import javax.swing.*;

class CC extends JFrame{
	JPanel p;
	public CC() {
		setTitle("���� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		p = new JPanel();
		p.setLayout(new BoxLayout(p, BoxLayout.Y_AXIS));
		p.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5)); //Frame�� �⺻ ������ ����
		JPanel p1, p2;
		p1 = new JPanel();
		p2 = new JPanel();
		p1.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5)); //Panel�� ���� ����
		p2.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5)); //Panel�� ���� ����
		p1.setLayout(new GridLayout(2, 2));
		p2.setLayout(new BoxLayout(p2, BoxLayout.Y_AXIS));
		
		JLabel l1 = new JLabel("������ �Է��Ͻÿ�. 	");
		JLabel l2 = new JLabel("������ �Է��Ͻÿ�. 	");
		JTextField t1 = new JTextField(10);
		JTextField t2 = new JTextField(10);
		JTextField t3 = new JTextField(30);
		JButton b = new JButton("��ȯ");
		b.setAlignmentX(Component.CENTER_ALIGNMENT); //b ��ư�� ����� ��ġ
		
		p1.add(l1);
		p1.add(t1);
		p1.add(l2);
		p1.add(t2);
		p2.add(t3);
		
		p.add(p1);
		p.add(b);
		p.add(p2);
		add(p);
		
		pack(); //Frame�� ũ�⸦ �� �гο� �°Բ� ����
		setVisible(true); //���� Frame�� �� �� �ְ� ����
		
	}
}

public class ���ڰ��� {
	public static void main(String args[]) {
		CC c = new CC();
	}

}
