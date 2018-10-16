package hw_03;

public class Plane {
	//�ʵ� ����
	private String brand; //�װ��� �ʵ�, ���ǻ��� ���� �ѱ۷θ� �Է��Ѵ�.
	private String model; //�� �ʵ�, ���ǻ��� ���� AA0000 ������ ������.
	private int max_people; //�ִ� ž�°� �ʵ�
	
	static private int planes = 0;
	
	//�ʵ� ������, ������ �޼ҵ�
	public void getbrand(String brand){ //�װ��� �ʵ� ������, ������
		this.brand = brand;
	}
	public String setbrand() {
		return brand;
	}
	
	public void getmodel(String model) { //�� �ʵ� ������, ������
		this.model = model;
	}
	public String setmodel() {
		return model;
	}
	
	public void getmax_people(int max_people) { //�ִ� ž�°� �ʵ� ������, ������
		this.max_people = max_people;
	}
	public int setmax_people() {
		return max_people;
	}
	
	//planes ��� �޼ҵ�
	static public int getPlane() {
		return planes;
	}
	
	//������
	public Plane() {                 //�ƹ��͵� �Է� ���� ���
		getbrand("�ƽþƳ��װ�");
		getmodel("OZ8901");
		getmax_people(200);
		planes++;
	}
	public Plane(String string) {    //���ڿ� �ϳ��� �Է��� ���
		if((int)string.charAt(0)>=65&&(int)string.charAt(0)<=90) {
			//�ձ��ڰ� ���빮���� ��� ���ڿ��� �𵨷� ���
			getbrand("�ƽþƳ��װ�");
			getmodel(string);
			getmax_people(200);
		}
		else {
			getbrand(string);
			getmodel("OZ8901");
			getmax_people(200);
		}
		planes++;
	}
	public Plane(int max_people) {    //���ڸ� �Է¹��� ���
		getbrand("�ƽþƳ��װ�");
		getmodel("OZ8901");
		getmax_people(max_people);
		planes++;
	}
	public Plane(String brand, String model) {  //���ڿ� �ΰ� �Է¹��� ���
		getbrand(brand);
		getmodel(model);
		getmax_people(200);
		planes++;
	}
	public Plane(String string, int max_people) { //���ڿ��� ���� �Է¹��� ���
		if((int)string.charAt(0)>=65&&(int)string.charAt(0)<=90) {
			//�ձ��ڰ� ���빮���� ��� ���ڿ��� �𵨷� ���
			getbrand("�ƽþƳ��װ�");
			getmodel(string);
			getmax_people(max_people);
		}
		else {
			getbrand(string);
			getmodel("OZ8901");
			getmax_people(max_people);
		}
		planes++;
	}
	public Plane(String brand, String model, int max_people) { //��� ���� �Է¹��� ���
		getbrand(brand);
		getmodel(model);
		getmax_people(max_people);
		planes++;
	}
}
