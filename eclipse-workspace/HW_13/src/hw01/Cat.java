package hw01;

public class Cat extends Animal implements Pet{
	//�ʵ�
	private String name; //������� �̸� ����
	
	//������
	public Cat() {
		super(4);
	}
	public Cat(String name) {
		super(4);
		setName(name);
	}
	
	//�޼ҵ�
	public void eat() {
		System.out.println("����̴� ������ �� �Խ��ϴ�.");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void play() {
		System.out.println("����̰� ���� ������ ��ϴ�.");
	}
}
