package hw04;

import java.awt.*;
import java.util.*;
import javax.swing.*;

/* *�ֻ��� ��*
 * �ֻ����� ���� �����ִ� ����� ������� ��, ���� ���� �� �ִ� ��ġ�� �� 7���̴�.
 * ���� ��ġ�� ��Ģ���� ���캸���� ��, Ȧ���� ������ ����� ���� �����Ѵ�.
 * ��� ���� ���� �����Ѵٸ�, ���ڰ� 2������ ������ �� 2���� ���� �� ���⿡ �߰��� �����ȴ�. ���� 6�� ��쿡�� ���ڷ� �����ȴ�. 
 * �̸� �����ϱ� ���� switch���� �̿��ϵ��� �ϰڴ�.
 * 
 * *�ֻ��� ��ġ*
 * ��ġ�� �ʰ� �ϱ� ���ؼ��� ���� �׸� �ֻ���(Ȥ�� ��)�� ��ġ�� ����ؾ� �Ѵ�.
 * �������� ��ǥ�� �����ϰ� ������ ������ �ֻ����� ��ġ�� ���ϸ鼭 �ٽ� ��ġ�� ���������� �����Ѵ�.
 * ������ �׷����� �Լ��� �������� �� ������ ��ǥ�� �� ������ �� ���� �簢�� ���ʿ��� ���� �� �κ� �𼭸��� ��ġ�� ���Ѵ�.
 * ������ �ֻ����� �������� �������� x��ǥ�� (�ٸ� �ֻ����� x��ǥ)+(�ֻ��� ũ��)���� ũ�ų� (�ٸ� �ֻ����� x��ǥ)-(�ֻ��� ũ��)���� �۾ƾ��Ѵ�.
 * y��ǥ ���� �̿� �����ϴ�.
 * ������ �����Ͽ� ���α׷��� �ϵ��� ����.
 */

public class DiceTest extends JFrame{
	
	static int size = 1000; //ȭ���� ������ ����(�̶� ȭ���� ���簢��������� �Ѵ�.)
	static int dice; //�ֻ����� ����
	
	public DiceTest() {
		setSize(size, size);
		setTitle("�ֻ��� ������ ���α׷�");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(new DicePanel());
		setVisible(true);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �ֻ��� ������ �Է��Ͻÿ�. :");	//�̺�Ʈ ó���� ���� �� ���󼭤̤� �ý��ۿ��� �ֻ��� ������ ��������
		dice = sc.nextInt();
		new DiceTest();
	}
}

class DicePanel extends JPanel{
	Dice[] d_array;
	int[][] d_location; //�ֻ��� ���� �� �� �ֻ����� ��ġ�� Ȯ���ϱ� ���� 2���� �迭
	Color dice_c = Color.WHITE;
	Color dot_c = Color.BLACK;
	
	public DicePanel() {
		d_array = new Dice[DiceTest.dice];
		d_location = new int[DiceTest.dice-1][2]; //������ �ֻ����� ��ġ�� ������ �ʿ䰡 �����Ƿ� -1
		for(int i=0; i<DiceTest.dice; i++) {
			if(i==0) d_array[i] = new Dice();
			else {
				d_location[i-1][0] = d_array[i-1].x; //ũ�� ������ ���� ���� else�� ������
				d_location[i-1][1] = d_array[i-1].y;
				d_array[i] = new Dice(i,d_location);
			}
		}
	}
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		setBackground(Color.PINK);
		for(int i=0; i<DiceTest.dice; i++) {
			g.setColor(dice_c);
			g.fillRoundRect(d_array[i].x, d_array[i].y, d_array[i].d_size, d_array[i].d_size, 10, 10); //�ֻ���
			g.setColor(dot_c);
			g.drawRoundRect(d_array[i].x, d_array[i].y, d_array[i].d_size, d_array[i].d_size, 10, 10); //�ֻ��� �׵θ�
			if(d_array[i].num%2==1)  //�ֻ��� ��� ���� �ִ� ��� = ���ڰ� Ȧ���� ���� �ǹ�. ���� 1�� �ϼ���Ŵ
				g.fillOval(d_array[i].x+20, d_array[i].y+20, 10, 10);	//����� ��
			
			switch(d_array[i].num-1) {
			case 5:	//���� 6. �� 6�� �׸�
				g.fillOval(d_array[i].x+5, d_array[i].y+20, 10, 10);	//���� 2��° ��
				g.fillOval(d_array[i].x+35, d_array[i].y+20, 10, 10);	//���� 2��° ��
			case 4:	//���� 5. ������ �� 1���� �������Ƿ� ������ 4�� �� �׸�
			case 3:	//���� 4. �� 4�� �׸�
				g.fillOval(d_array[i].x+5, d_array[i].y+35, 10, 10);	//���� 3��° ��
				g.fillOval(d_array[i].x+35, d_array[i].y+5, 10, 10);	//���� 1��° ��
			case 2:	//���� 3. ������ �� 1���� �������Ƿ� ������ 3�� �� �׸�
			case 1: //���� 2. �� 2�� �׸�
				g.fillOval(d_array[i].x+5, d_array[i].y+5, 10, 10);		//���� 1��° ��
				g.fillOval(d_array[i].x+35, d_array[i].y+35, 10, 10);	//���� 3��° ��
			}
		}
	}	
	class Dice{
		int d_size = 50; //�ֻ��� ������
		int x, y; //�ֻ��� ��ġ
		int num; //�ֻ��� ����
		
		public Dice() {  //ù ���� �ֻ��� ���� �� ����ϴ� ������
			num = Random(6, 1);
			x = Random(DiceTest.size-2*d_size, 0);	//���� ���� ��ġ�� �ֵ��� �� �ִ밪�� ������
			y = Random(DiceTest.size-2*d_size, 0);	//���� ���� ��ġ�� �ֵ��� �� �ִ밪�� ������
		}
		
		public Dice(int n, int[][] location) { //���� �ֻ��� ���� �� ����ϴ� �����ڷ�, 2���� �迭�� ���ڸ� ���� Ÿ �ֻ����� ��ġ�� �ν�
			this.num = Random(6, 1);
			boolean f_result = true;		//do while�� Ż�⿩��
			do {
				x = Random(DiceTest.size-2*d_size, 0);	//���� ���� ��ġ�� �ֵ��� �� �ִ밪�� ������
				y = Random(DiceTest.size-2*d_size, 0);	//���� ���� ��ġ�� �ֵ��� �� �ִ밪�� ������
				
				boolean result = false;		//��ġ�� �ڸ��ΰ�? �ϴ� �ƴ϶�� ����.
				for(int i=0; i<n; i++) {
					if(x>=location[i][0]-d_size&&x<=location[i][0]+d_size&&y>=location[i][1]-d_size&&y<=location[i][1]+d_size)
						result = true;		//��ģ��
				}
				if(result==false) f_result=false; //�� �Ȱ�ġ�� do while�� Ż��
			}while(f_result);
		}
		
		int Random(int max, int min) {  //������ �� ����ϰ� �������ؼ� �߰��� �޼ҵ�
			Random rand = new Random();
			int n = rand.nextInt(max-min+1)+min;
			return n;
		}
	}
}
