package bankProgram;

import java.util.Scanner;
import java.util.ArrayList;

public class TestBankAccount {
	public static void main(String[] arg) {

		Scanner sc = new Scanner(System.in);

		int end = 0; // Bank ���α׷� �ݺ����� �Ǵ�
		String user, string; // ��� ����, ������ �� �Է¹��� ���� ���¹�ȣ
		int a, m, p; // ���¹�ȣ, �ݾ�, ��й�ȣ
		ArrayList<BankAccount> array = new ArrayList<BankAccount>();

		while (end == 0) {
			System.out.println("�泲�� ���࿡ ���� ���� ȯ���մϴ�.\n[1]���»���  [2]������ȸ  [3]���¼۱�  [4]����");
			user = sc.next();

			if ((int) user.charAt(0) >= 49 && (int) user.charAt(0) <= 52 && user.length() == 1) {
				if ((int) user.charAt(0) == 49) { // ���»���
					
					int n = 0;
					
					System.out.println("���¹�ȣ �Է� :");
					string = sc.next();
					if (string.length() == 7 && string.charAt(3) == '-') {
						string = string.replaceAll("[^01234456789]", "");
						a = Integer.parseInt(string);
							
						for(int i = 0; i<array.size(); i++)
							if(array.get(i).accountNumber == a) {
								n++;
							}
						if(n==0) {
							a = Integer.parseInt(string);
							System.out.println("������ :");
							string = sc.next();
							System.out.println("�ʱ� �ܾ� ���� :");
							m = sc.nextInt();
							System.out.println("���� ��й�ȣ ����(4�ڸ�):");
							p = sc.nextInt();
							if(p<=9999&&p>=0)
								array.add(new BankAccount(a, string, m, p)); // array�� �Է��� ��� ����!
							else
								System.out.println("��й�ȣ�� 4�ڸ� ���ڷθ� �������ּ���.");
						}
						else
							System.out.println("�̹� �����ϴ� ���¹�ȣ�Դϴ�. �ٸ� ��ȣ�� �Է����ּ���.");
					}
					else
						System.out.println("�߸��� ������ ���¹�ȣ�Դϴ�. 000-000 �������� �Է����ּ���.\n���α׷��� �����˴ϴ�.");
					System.out.println("�۾��� �����մϴ�. ���α׷��� ���۵��մϴ�.\n\n");
				}
				if ((int) user.charAt(0) == 50) { // ������ȸ
					System.out.println("��ȸ�� ���¹�ȣ�� �Է��ϼ���.");
					string = sc.next();
					if (string.length() == 7 && string.charAt(3) == '-') {
						string = string.replaceAll("[^01234456789]", "");
						a = Integer.parseInt(string);

						int n = 0; // ���� ���� ���θ� �Ǵ��ϴ� ���� �߰�

						for (int i = 0; i < array.size(); i++) {
							if (array.get(i).accountNumber == a) { // ���� ���� �Ǵ� �� ���
								System.out.println("���� ��ȣ : " + string);
								System.out.println("������ : " + array.get(i).owner);
								System.out.println("�ܾ� : " + array.get(i).balance);
								n++; // ���� �����ϹǷ� n�Լ��� ����
							}
						}
						if (n == 0) { // �������� ���� �� ����
							System.out.println("���� �Է��� ���¹�ȣ�� �������� �ʽ��ϴ�.");
							System.out.println("��ȣ�� �ٽ� Ȯ���ϰ� ��õ����ּ���.");
						}
					} else
						System.out.print("�߸��� ������ ���¹�ȣ�Դϴ�. 000-000 �������� �Է����ּ���.\n���α׷��� �����˴ϴ�.");
					System.out.println("�۾��� �����մϴ�. ���α׷��� ���۵��մϴ�.\n\n");
				}
				if ((int) user.charAt(0) == 51) { // ���¼۱�
					System.out.println("������ ���¸� �Է��Ͽ� �ֽʽÿ�.");
					string = sc.next();
					if (string.length() == 7 && string.charAt(3) == '-') {
						string = string.replaceAll("[^0123456789]", "");
						a = Integer.parseInt(string);

						int n = 0; // ���� ���� ���θ� �Ǵ��ϴ� ���� �߰�

						for (int i = 0; i < array.size(); i++) {
							if (array.get(i).accountNumber == a&&n==0) { // ���� ���� �Ǵ� �� ���
								System.out.println("���� ��й�ȣ�� �Է��Ͽ� �ֽʽÿ�.");
								p = sc.nextInt();
								if (array.get(i).password == p) {
									System.out.println("����Ȯ�� �Ϸ�. �۱��� ���¸� �Է��ϼ���.");
									string = sc.next();
									string = string.replaceAll("[^0123456789]", "");
									a = Integer.parseInt(string);

									int n2 = 0; // ���� ���� ���θ� �Ǵ��ϴ� ���� �߰�

									for (int r = 0; r < array.size(); r++) {
										if (array.get(r).accountNumber == a) { // ���� ���� �Ǵ� �� ���
											System.out.println("�۱��� �ݾ��� �Է����ּ���.");
											m = sc.nextInt();
											if(m<0)
												System.out.println("�˸��� �ݾ��� �Է����ּ���.");
											else {
												if (array.get(i).balance >= m) {
													System.out.println("�۱� �Ϸ�!");
													System.out.println("�ܿ� �ݾ� : "+array.get(i).sendAccount(m, array.get(r)));
												}
												else {
													System.out.println("�ѵ� �ʰ��� �ݾ��� �Է��Ͽ����ϴ�.");
													System.out.println("���� �ݾ�  ���� �ݾ��� �Է����ּ���.");
												}
											}
											n2++;
										}
									}
									if (n2 == 0) { // �������� ���� �� ����
										System.out.println("���� �Է��� ���¹�ȣ�� �������� �ʽ��ϴ�.");
										System.out.println("��ȣ�� �ٽ� Ȯ���ϰ� ��õ����ּ���.");
									}
								} else
									System.out.println("�߸��� ��й�ȣ�Դϴ�. �ٽ� �õ����ּ���.");
								n++; // ���� �����ϹǷ� n�Լ��� ����
							}
						}
						if (n == 0) { // �������� ���� �� ����
							System.out.println("���� �Է��� ���¹�ȣ�� �������� �ʽ��ϴ�.");
							System.out.println("��ȣ�� �ٽ� Ȯ���ϰ� ��õ����ּ���.");
						}
					} else
						System.out.println("�߸��� ������ ���¹�ȣ�Դϴ�. 000-000 �������� �Է����ּ���.");
					System.out.println("�۾��� �����մϴ�. ���α׷��� ���۵��մϴ�.\n\n");
				}
				if ((int) user.charAt(0) == 52) { // ����
					System.out.println("Bank Program�� �����մϴ�.");
					end++;
				}
			} else { // 1~4������ ���ڰ� �ƴ� �Է��� ���� ��� �����
				System.out.println(" �߸��� �Է��Դϴ�.\n���ϴ� �۾��� ��ȣ(1~4)�� �Է����ּ���.");
				System.out.println("���α׷��� ���۵��մϴ�.\n\n");
			}
		}
	sc.close();
	}
}
