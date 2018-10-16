package hw02;

import java.awt.*;
import javax.swing.*;

class CP extends JFrame{
	JPanel p, p1, p2; //������� �����â, ����� ��ư, ���� �Է� ��ư�� ���� �г�
	
	public CP() { //������
		setTitle("���� ���α׷�(Demo)"); //Frame�� Ÿ��Ʋ ����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		p = new JPanel();
		p.setLayout(new BoxLayout(p, BoxLayout.Y_AXIS));
		p.setBorder(BorderFactory.createEmptyBorder(10, 10, 5, 10)); //TextField�� Ÿ ������Ʈ �� ������ ����
		JTextField t = new JTextField(20);
		p.add(t);
		
		p1 = new JPanel();
		p1.setBorder(BorderFactory.createEmptyBorder(0, 1, 0, 0));
		JButton c = new JButton("    C    "); //��ư�� ������ �����ϱ� ���� ������ �߰���(��ư ������� ȿ���� ���...)
		p1.add(c);
		
		p2 = new JPanel();
		p2.setLayout(new GridLayout(4, 4, 5, 5));
		p2.setBorder(BorderFactory.createEmptyBorder(0, 6, 6, 6));		
		
		String [] s = new String[6];
		s[0] = "/"; s[1] = "*";s[2] = "-"; s[3] = "Back "; s[4] = "="; s[5] = "+";
		

		
		for(int i=0; i<4; i++) { //1��° �ݺ���, ��
			int n = 7-i*3;
			for(int j=0; j<4; j++) { //2��° �ݺ���, �࿡ ���� ���� ����
				if(i==3) {
					JButton b0 = new JButton("0");
					p2.add(b0);
					for(int m=3; m<6; m++) {
						JButton b = new JButton(s[m]);
						p2.add(b);
					}
					j = 4; //������ �� �ݺ��� ������ ���� 2��° �ݺ����� �����Ŵ
				}
				else if(j==3) {
					JButton b = new JButton(s[i]);
					p2.add(b);
				}
				else {
					JButton b = new JButton(""+n); //JButton�� ��ư �̸��� String���θ� ����
					p2.add(b);
					n++;
				}
			}
		}
		
		//JFrame�� Layout������ BorderLayout�̹Ƿ� �� ���Ŀ� ���߾� �� Panel�� ����
		add(p, BorderLayout.PAGE_START);
		add(p1, BorderLayout.LINE_START);
		add(p2, BorderLayout.PAGE_END);
		
		pack(); //Frame�� ũ�⸦ �� �гο� �°Բ� ����
		setVisible(true); //���� Frame�� �� �� �ְ� ����
		
	}
}

public class CPTest {
	public static void main(String argv[]) {
		CP cp = new CP();
	}
}
