package hw_03;

public class PlaneTest {
	public static void main(String args[]) {
		//��� ����� �� �������� ������!
		Plane[] planes = new Plane[8];
		
		planes[0] = new Plane();   //�Է� X
		planes[1] = new Plane("�����װ�"); //�װ��縸
		planes[2] = new Plane("OZ6615"); //����� �𵨸�
		planes[3] = new Plane(120);  //�ִ��ο���
		planes[4] = new Plane("�����װ�", "KE7273"); //�װ���� ������
		planes[5] = new Plane("�����װ�", 150);  //�װ���� �ִ��ο�
		planes[6] = new Plane("OZ6615", 120);  //����� �𵨰� �ִ��ο�
		planes[7] = new Plane("�����װ�", "KE7273", 150);  //����!
		
		
		System.out.println("������ �� ������� �� : "+Plane.getPlane()); //getPlane�޼ҵ�� planes ���
		System.out.println();
		
		for(int i=0; i<planes.length; i++) {
			System.out.println((i+1)+"���� ����� : ");
			System.out.print("�װ��� - "+planes[i].setbrand()+"	����� �� - "+planes[i].setmodel());
			System.out.println("	  �ִ� ž�°��� �ο� - "+planes[i].setmax_people());
			System.out.println();
		}
		
	}
}
