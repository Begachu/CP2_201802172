package ����;
import java.util.Scanner;
public class ���� {
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		int students = sc.nextInt();
		int num = 0;
		int [] score = new int[students];
		double average = 0;
		for(int i = 0; i<students; i++) {
			score[i]=sc.nextInt();
			average=average+score[i];}
		average = average/students;
		for(int i = 0; i<students; i++)
			if(score[i]<average)
				num++;
		System.out.println("������� �̴��л� = "+num);
		}
	}

