package hw01;

public class Customer extends Person{
	//�ʵ� �߰�
	private int c_number;
	private int mileage;
	
	//�ʵ� ������ ������ �޼ҵ�
	public void setC_number(int c_number) {
		this.c_number = c_number;
	}
	public int getC_number() {
		return c_number;
	}
	
	public void setMileage(int mileage) {
		this.mileage = mileage;
	}
	public int getMileage() {
		return mileage;
	}
	
	//������
	public Customer() {
		System.out.println("Customer ����!\n");
		setName("������");
		setAddress("��õ������");
		setNumber(1027489933);
		setC_number(1);
		setMileage(1000);
	}
	
	//���ڸ� Ǯ���ϴ� �޼ҵ�
	public void print() {
		System.out.println("****Customer****");
		System.out.println("Name : "+getName());
		System.out.println("Address : "+getAddress());
		System.out.println("PhoneNumber : "+getNumber());
		System.out.println("CustomerNum : "+getC_number());
		System.out.println("Mileage : "+getMileage());
		System.out.println("****************\n");
	}
}
