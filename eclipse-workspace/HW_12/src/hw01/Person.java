package hw01;

public class Person {
	//�ʵ� ����
	private String name;
	private String address;
	private int number;
	
	//�ʵ忡 ���� �����ڿ� ������ �޼ҵ�
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAddress() {
		return address;
	}
	
	public void setNumber(int number) {
		this.number = number;
	}
	public String getNumber() {
		return "0"+number;
	}
	
	//������
	public Person() {
		System.out.println("Person ����!");
		setName("������");
		setAddress("��õ������");
		setNumber(1027489933);
	}
	
	//���ڸ� Ǯ���ϴ� �޼ҵ�
	public void print() {
		System.out.println("*****Person*****");
		System.out.println("Name : "+getName());
		System.out.println("Address : "+getAddress());
		System.out.println("PhoneNumber : "+getNumber());
		System.out.println("****************\n");
	}
}
