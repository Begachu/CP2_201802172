package ����01;

import java.util.Scanner;

public class �ð�_����_�������α׷� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int s1, s2, m, h;
		Scanner sc = new Scanner(System.in);
		System.out.print("��ȯ�� �� �Է� : ");
		s1 = sc.nextInt();
		
		m = s1/60;
		h = m/60;
		s2 = s1-m*60;
		m = m-h*60;
		
		System.out.println(s1+"�ʴ� "+h+"�ð� "+m+"�� "+s2+"���Դϴ�.");
	}

}
