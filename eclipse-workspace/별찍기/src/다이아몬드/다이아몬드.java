package ���̾Ƹ��;
import java.util.Scanner;
public class ���̾Ƹ�� {
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 1; i<=n; i++) {
			for(int r = n-i; r>0; r--)
				System.out.print(" ");
			for(int r = 2*i-1; r>0; r--)
				System.out.print("*");
			System.out.println("");}  //��������� �׳� �Ƕ�̵� �ر��� ���� ���̾Ƹ��. ��, ������ 2n-1�� ��µ�//
		for(int i = 1; i<n; i++) {
			for(int r = i; r>0; r--)
				System.out.print(" ");
			for(int r =(n-i)*2-1; r>0; r--)
				System.out.print("*");
			System.out.println("");}
	}
}

