package Start;

import java.util.*;

public class Login {
	Scanner sc = new Scanner(System.in);
	
	private ArrayList<User> Users= new ArrayList<User>();
	
	public Login() {
		System.out.println("�׼Ǻ���! ������� ���� ���� ȯ���մϴ�.");
		System.out.println(">>�α���/ȸ������/����");
		String you = sc.next();
		
		if(you.equals("�α���")) {
			System.out.println("ID : ");
			String ID = sc.next();
			System.out.println("PW : ");
			String PW = sc.next();
			if(LoginGame(ID, PW)==true);
				//�¶���
			else;
		}
		else if(you.equals("ȸ������"))
			AddUser();
		else if(you.equals("����"));
			//����
		else
			System.out.println("�߸��� �Է��Դϴ�. �ٽ� �õ����ּ���.");
	}
	
	private boolean LoginGame(String ID, String PW) {
		int num = 0;
		boolean searchID = false;
		while(searchID==false&&num<=Users.size()){
			if(ID.equals(Users.get(num).GetID()))
				searchID=true;
			else num++;
		}
		if(searchID==true)
			if(PW.equals(Users.get(num).GetPW()))
				return true;
			else {
				System.out.println("��й�ȣ�� �ùٸ��� �ʽ��ϴ�.");
				return false;
			}
		else {
			System.out.println("�ùٸ��� �ʰų� �������� �ʴ� ���̵��Դϴ�.");
			return false;
		}
	}
	
	private void AddUser() {
		System.out.print("����ϰ����ϴ� ���̵� �Է����ּ���. : ");
		String ID = sc.next();
		int num = 0;
		boolean searchID = true;
		while(searchID==true&&num<=Users.size()){
			if(ID.equals(Users.get(num).GetID()))
				searchID=false;
			else num++;
		}
		if(searchID==false) {
			System.out.print("��밡���� ���̵��Դϴ�.\n��й�ȣ�� �Է����ּ���. : ");
			String PW = sc.next();
			Users.add(new User(ID, PW));
		}
		else {
			System.out.println("�̹� �����ϴ� ���̵��Դϴ�.");
			AddUser();
		}
	}
}
