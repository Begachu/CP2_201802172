package hw01;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CPTest extends JFrame {
	public CPTest() {
		setTitle("���� ���α׷�"); // Frame�� Ÿ��Ʋ ����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(new CP());
		pack();
		setVisible(true);
	}

	public static void main(String[] args) {
		new CPTest();
	}
}

class CP extends JPanel {
	private JPanel p, p1, p2; // ������� �����â, ����� ��ư, ���� �Է� ��ư�� ���� �г�
	private String num1 = "0"; // ����� ù��° ����
	private String num2 = "0"; // ����� �ι�° ����
	private double result; // ��� �����
	private boolean noNumber = true; // ����ư�� �������� ������ ���� ����
	private boolean operate = false; // �տ� ���� ����ؾ��ϴ� ���� �����ϴ°�?
	private int f_operate = 0; // ��Ģ����. 0�� ���� �ƹ� ��굵 ���� �ʴ´�.
	private JTextField t = new JTextField(20); // ��� ����� ��Ÿ���� â
	private JButton c = new JButton("    C    "); // �ʱ�ȭ ��ư
	private JButton[] numbers = new JButton[10]; // ���� ��ư
	private JButton[] oper = new JButton[6]; // ��ȣ ��ư

	public CP() {
		MyListener l = new MyListener(); // �̺�Ʈ�� �����ϱ� ���� �߰�
		setLayout(new BorderLayout());

		// �г� ���� ���� �� ����
		p = new JPanel();
		p.setLayout(new BoxLayout(p, BoxLayout.Y_AXIS));
		p.setBorder(BorderFactory.createEmptyBorder(10, 10, 5, 10)); // TextField�� Ÿ ������Ʈ �� ������ ����

		p1 = new JPanel();
		p1.setBorder(BorderFactory.createEmptyBorder(0, 1, 0, 0));

		p2 = new JPanel();
		p2.setLayout(new GridLayout(4, 4, 5, 5));
		p2.setBorder(BorderFactory.createEmptyBorder(0, 6, 6, 6));

		// ��ư �̺�Ʈ �ۼ� �� �� �гο� �߰�
		p.add(t);
		c.addActionListener(l);
		p1.add(c);
		for (int i = 0; i < 10; i++) {
			numbers[i] = new JButton("" + i);
			numbers[i].addActionListener(l);
		}
		oper[0] = new JButton("/");
		oper[0].addActionListener(l);
		oper[1] = new JButton("*");
		oper[1].addActionListener(l);
		oper[2] = new JButton("-");
		oper[2].addActionListener(l);
		oper[3] = new JButton(" Back");
		oper[3].addActionListener(l);
		oper[4] = new JButton("=");
		oper[4].addActionListener(l);
		oper[5] = new JButton("+");
		oper[5].addActionListener(l);

		for (int i = 0; i < 4; i++) { // 1��° �ݺ���, ��
			int n = 7 - i * 3;
			for (int j = 0; j < 4; j++) { // 2��° �ݺ���, �࿡ ���� ���� ����
				if (i == 3) {
					p2.add(numbers[0]);
					for (int m = 3; m < 6; m++) {
						p2.add(oper[m]);
					}
					j = 4; // ������ �� �ݺ� ����
				} else if (j == 3) {
					p2.add(oper[i]);
				} else {
					p2.add(numbers[n]);
				}
				n++;
			}
		}

		// �гο� �߰�
		add(p, BorderLayout.PAGE_START);
		add(p1, BorderLayout.LINE_START);
		add(p2, BorderLayout.PAGE_END);
	}

	private double Compute(int i) { // ����� �ϴ� �޼ҵ�
		if (i == 1) { // ������
			result = result / Integer.parseInt(num2); // result�� �Ǽ����̹Ƿ� �̶� ������ �߻����� �ʴ´�. ���� ���������� �����Ͽ� ������ ��ƺ��ڴ�.
			try {
				int zero = (int) result / Integer.parseInt(num2); // ������ ������ �����Ϳ� ����� �־��.
			} catch (Exception e) { // 0�� �������� �� ���
				f_operate = 5;
				Compute(f_operate); // ��ü������ �� �� �� Compute �޼ҵ� ����
			}
		} else if (i == 2) { // ���ϱ�
			result = result * Integer.parseInt(num2);
		} else if (i == 3) { // ����
			result = result - Integer.parseInt(num2);
		} else if (i == 4) { // ���ϱ�
			result = result + Integer.parseInt(num2);
		} else if (i == 5) { // 0�� ���� ���
			num1 = "0���� ���� �� �����ϴ�.";
			t.setText(num1);
		} else {
			result = Integer.parseInt(num1);
		}
		return result;
	}

	private class MyListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == c) { // �ʱ�ȭ ��ư. ��� ���� �ʱ�ȭ ��Ų��.
				num1 = "0";
				num2 = "0";
				operate = false;
				f_operate = 0;
				t.setText("");
			} else if (f_operate != 5) {// 0�� ���� ��� �ʱ�ȭ�� �۵��ϵ��� �����.
				if (e.getSource() == numbers[0]) { // �� ���ڸ� �޾Ƽ� ����. ������ result�� �����ʴ´�. (Back �̿��� ����)
					noNumber = false;
					if (operate == false) {
						num1 = "" + Integer.parseInt(num1 + 0);
						t.setText(num1);
					} else {
						num2 = "" + Integer.parseInt(num2 + 0);
						t.setText(num1 + num2);
					}
				} else if (e.getSource() == numbers[1]) {
					noNumber = false;
					if (operate == false) {
						num1 = "" + Integer.parseInt(num1 + 1);
						t.setText(num1);
					} else {
						num2 = "" + Integer.parseInt(num2 + 1);
						t.setText(num1 + num2);
					}
				} else if (e.getSource() == numbers[2]) {
					noNumber = false;
					if (operate == false) {
						num1 = "" + Integer.parseInt(num1 + 2);
						t.setText(num1);
					} else {
						num2 = "" + Integer.parseInt(num2 + 2);
						t.setText(num1 + num2);
					}
				} else if (e.getSource() == numbers[3]) {
					noNumber = false;
					if (operate == false) {
						num1 = "" + Integer.parseInt(num1 + 3);
						t.setText(num1);
					} else {
						num2 = "" + Integer.parseInt(num2 + 3);
						t.setText(num1 + num2);
					}
				} else if (e.getSource() == numbers[4]) {
					noNumber = false;
					if (operate == false) {
						num1 = "" + Integer.parseInt(num1 + 4);
						t.setText(num1);
					} else {
						num2 = "" + Integer.parseInt(num2 + 4);
						t.setText(num1 + num2);
					}
				} else if (e.getSource() == numbers[5]) {
					noNumber = false;
					if (operate == false) {
						num1 = "" + Integer.parseInt(num1 + 5);
						t.setText(num1);
					} else {
						num2 = "" + Integer.parseInt(num2 + 5);
						t.setText(num1 + num2);
					}
				} else if (e.getSource() == numbers[6]) {
					noNumber = false;
					if (operate == false) {
						num1 = "" + Integer.parseInt(num1 + 6);
						t.setText(num1);
					} else {
						num2 = "" + Integer.parseInt(num2 + 6);
						t.setText(num1 + num2);
					}
				} else if (e.getSource() == numbers[7]) {
					noNumber = false;
					if (operate == false) {
						num1 = "" + Integer.parseInt(num1 + 7);
						t.setText(num1);
					} else {
						num2 = "" + Integer.parseInt(num2 + 7);
						t.setText(num1 + num2);
					}
				} else if (e.getSource() == numbers[8]) {
					noNumber = false;
					if (operate == false) {
						num1 = "" + Integer.parseInt(num1 + 8);
						t.setText(num1);
					} else {
						num2 = "" + Integer.parseInt(num2 + 8);
						t.setText(num1 + num2);
					}
				} else if (e.getSource() == numbers[9]) {
					noNumber = false;
					if (operate == false) {
						num1 = "" + Integer.parseInt(num1 + 9);
						t.setText(num1);
					} else {
						num2 = "" + Integer.parseInt(num2 + 9);
						t.setText(num1 + num2);
					}
				} else if (noNumber == false) {
					if (e.getSource() == oper[0]) { // ������
						if (operate == false) {
							result = Integer.parseInt(num1);
							num1 = num1 + "/";
							t.setText(num1);
							f_operate = 1;
							operate = true;
						} else {
							result = Compute(f_operate);
							num1 = num1 + num2 + "/";
							num2 = "0";
							t.setText(num1);
							f_operate = 1;
						}
						noNumber = true;
					} else if (e.getSource() == oper[1]) { // ���ϱ�
						if (operate == false) {
							result = Integer.parseInt(num1);
							num1 = num1 + "*";
							t.setText(num1);
							f_operate = 2;
							operate = true;
						} else {
							result = Compute(f_operate);
							num1 = num1 + num2 + "*";
							num2 = "0";
							t.setText(num1);
							f_operate = 2;
						}
						noNumber = true;
					} else if (e.getSource() == oper[2]) { // ����
						if (operate == false) {
							result = Integer.parseInt(num1);
							num1 = num1 + "-";
							t.setText(num1);
							f_operate = 3;
							operate = true;
						} else {
							result = Compute(f_operate);
							num1 = num1 + num2 + "-";
							num2 = "0";
							t.setText(num1);
							f_operate = 3;
						}
						noNumber = true;
					} else if (e.getSource() == oper[3]) { // �ڷ�. ���ڸ� �ٽ� �Է��� �� �ִ�.
						if (operate == false) {
							num1 = "0";
							t.setText("");
						} else {
							num2 = "0";
							t.setText(num1);
						}
						noNumber = true;
					} else if (e.getSource() == oper[4]) { // ���. ���� �Է��� ��Ģ������ �̿��� ������ ����� �� �� ������� ����Ѵ�.
						result = Compute(f_operate);
						if (f_operate != 5) {
							operate = false;
							f_operate = 0;
							num2 = "0";
							if (result == (int) result)
								num1 = "" + (int) (result);
							else
								num1 = "" + result;
							t.setText(num1);
							result = 0; // ���� ����� �ʿ��� ��츦 ���� ����
						}
					} else if (e.getSource() == oper[5]) { // ���ϱ�
						if (operate == false) {
							result = Integer.parseInt(num1);
							num1 = num1 + "+";
							t.setText(num1);
							f_operate = 4;
							operate = true;
						} else {
							result = Compute(f_operate);
							num1 = num1 + num2 + "+";
							num2 = "0";
							t.setText(num1);
							f_operate = 4;
						}
						noNumber = true;
					}
				}
			}
		}
	}
}