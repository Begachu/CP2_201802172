package hw04;

import java.util.ArrayList;
import java.util.Random;

/*
�� �׸��� �����ϴ� J�г��� J�����ӿ� �ٿ��� ���� ����

1. ���� ���� : ���Ƿ� ����
2. ���� �� : ���� �Լ� �̿� ( ���� : Lab04 )
3. ���� ��ġ �� ũ�� : ���� �Լ� �̿� ( ���� : lab04 )
*/

import java.awt.*;
import javax.swing.*;

public class CircleTest extends JFrame{ //���� Ŭ����
	
	static int size = 600;        //ȭ�� ������ �Լ�. �� ���� �� ũ��� ������ġ�� ��������;
	
	public CircleTest() {
		setSize(size, size);
		setTitle("�� �׸���");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(new CirclePanel());
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new CircleTest();
	}
}

class CirclePanel extends JPanel{        //���� �׸� �г� Ŭ����
	int circleNum = 10;                   //���� ���� ����
	Circle[] c = new Circle[circleNum];   //�� Ŭ������ �迭
	public CirclePanel() {
		for(int i=0; i<circleNum; i++) {
			c[i] = new Circle();
		}
	}
		
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		for(int i=0; i<circleNum; i++) {
			g.setColor(new Color(c[i].colorR, c[i].colorG, c[i].colorB));
			g.fillOval(c[i].x, c[i].y, c[i].c_size, c[i].c_size);
		}
		
	}
	
	class Circle{                    //���� ������ ��� �ִ� ���� Ŭ����
		int x, y;
		int c_size;
		int colorR, colorG, colorB;
		public Circle() {
			c_size = Random(CircleTest.size/2, CircleTest.size/5);  //���� �ִ�ũ�� : ȭ��ũ��/2, �ּ�ũ�� : ȭ��ũ��/5�� ����
			x = Random(CircleTest.size-c_size/2, -CircleTest.size/10); //���� ���ø� �����Ͽ� �����¿� �鿡 ���� �������� ��쵵 �����Ͽ� ��ġ����
			y = Random(CircleTest.size-c_size/2, -CircleTest.size/10);
			
			colorR = Random(255, 0);
			colorG = Random(255, 0);
			colorB = Random(255, 0);
		}
		
		int Random(int max, int min) {  //������ �� ����ϰ� �������ؼ� �߰��� �޼ҵ�
			Random rand = new Random();
			int n = rand.nextInt(max-min+1)+min;
			return n;
		}
	}
}