package hw01;

public class Movie {
	//��ȭ ���� �ʵ� ����, String��
	String title;
	//���� �ʵ� ����, double��
	double rating;
	//���� �ʵ� ����, String��
	String director;
	//�����⵵ �ʵ� ����, String��
	String publishDate;
	
	//��ȭ�� ��� ������ ȭ�鿡 ����ϴ� �޼ҵ�
	public void print() {
		System.out.print("��ȭ�� ���� : "+title+"\n��ȭ�� ���� : "+rating+"\n��ȭ�� ���� : "+director+"\n��ȭ �����⵵ : "+publishDate);
	}
}
