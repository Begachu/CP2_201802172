package hw01;

public abstract class Animal {
	//�ʵ�
	protected int legs; //������ �ٸ� �� ����
	
	//������
	public Animal(int leg) { //Legs�� �ʱ�ȭ�ϴ� �����ڸ� ����
		this.legs = leg;
	}
	
	//�޼ҵ�
	public abstract void eat(); //�߻�޼ҵ�
	public void walk() {
		if(legs>0)
			System.out.println("�� ������ "+legs+"���� �ٸ��� �Ƚ��ϴ�.");
		else
			System.out.println("�� ������ ���Ĩ�ϴ�.");
	}
}
