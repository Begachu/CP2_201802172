package hw01;

public class Fish extends Animal implements Pet{
	private String name; //������� �̸� ����
	
	public Fish() {
		super(0);
	}
	
	//�޼ҵ�
	public void eat() {
		System.out.println("������ ���̸� �Խ��ϴ�.");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void play() {
		System.out.println("����Ⱑ ���ġ�� ��ϴ�.");
	}
}
