package hw_04;

import java.util.Scanner;

public class Convert {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int intger; //����ڷκ��� �Է¹��� ���α׷� ����Ƚ���� ������ ����
		String user; //��ȯ�� 16����
		
		System.out.print("Test Case ������ �Է��Ͻÿ� : "); //����ڷκ��� �ݺ� Ƚ���� �Է¹޴´�.
		intger = sc.nextInt();
		for(int i=0; i<intger; i++) {  //�ݺ�Ƚ����ŭ ���� ����
			System.out.print("16���� �Է� : ");
			user = sc.next();  //����ڷκ��� ��ȯ�� 16���� ���� �޴´�.
			
			for(int r=0; r<user.length(); r++) { //�� ���ڿ� �ϳ��ϳ��� 2������ ��ȯ�Ѵ�. ���� ���̸�ŭ ��ȯ�۾� ���� 
				if((int)user.charAt(r)>=65&&(int)user.charAt(r)<=70) { //A~F�� ���
					System.out.print(user.charAt(r)+", "+(10+(int)user.charAt(r)-65)+", "); //������ ��� 10�� ����
					
					int converting = (int)user.charAt(r)-55; //���ڿ��� ���� 65-10�� ���� �ӽ÷� �����Ѵ�.
					
					for(int n=3; n>=0; n--) { //�� 4���� 2���� �����
						int two = 1; //2�� ������ ������ �ӽ� ���� ����
						for(int m = n; m>0; m--) //n+1��° �ڸ��� ������ two�� ������ش�.
							two = two*2;
						if(converting>=two) { //�񱳸� ���� converting�� �� Ŭ ���
							System.out.print(1); //1���
							converting=converting-two; //���� ���� �ڸ����� ���ϱ� ���� two�� ����.
						}
						else
							System.out.print(0);} //���� ��� 0 ���
				}
				else if((int)user.charAt(r)>=48&&(int)user.charAt(r)<=57) { //������ ���
					System.out.print(user.charAt(r)+", "+((int)user.charAt(r)-48)+", ");
					
					int converting = (int)user.charAt(r)-48; //���ڴ� ��ȯ�ϸ� 48�� ���ָ� ���� ���� �ȴ�.
					
					for(int n=3; n>=0; n--) { //���ڿ� ��ȯ�� ����
						int two = 1;
						for(int m = n; m>0; m--)
							two = two*2;
						if(converting>=two) {
							System.out.print(1);
							converting=converting-two;
						}
						else
							System.out.print(0);}
				}
				System.out.println(); //���� ���ڿ� �ڸ� ����� ���� ������ ���.
			}
		}
		sc.close();
	}
}
