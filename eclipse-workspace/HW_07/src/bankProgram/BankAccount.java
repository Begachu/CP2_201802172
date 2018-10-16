package bankProgram;

public class BankAccount {
	//�ʵ尪 ����
	int accountNumber; //���¹�ȣ
	String owner; //������
	int balance; //�ܾ�ǥ��
	int password; //���� ��й�ȣ
	
	public BankAccount(int num, String name, int money, int pw) {
		accountNumber = num;
		owner = name;
		balance = money;
		password = pw;
	}
	public void deposit(int amount) {  //���� ��� �޼ҵ�
		balance += amount;
	}
	public void withdraw(int amount) {  //���� ��� �޼ҵ�
		balance -= amount;
	}
	public int sendAccount(int amount, BankAccount otherAccount) {  //������ü ��� �޼ҵ�
		withdraw(amount);
		otherAccount.deposit(amount);
		return balance;
	}
}
