package hw02;

public class Magazine extends Book{
	//�ʵ� �߰�
	private String release;
	
	public void setRelease(String release) {
		this.release = release;
	}
	public String getRelease() {
		return release;
	}
	
	//������
	public Magazine() {
		System.out.println("Magazine ����!\n");
		setTitle("�ڷ��ڷ��ڹͽ�");
		setWriter("���ĭ");
		setPage(50);
		setRelease("2018-05");
	}
	
	//��� �޼ҵ� ����
	public void print() {
		System.out.println("***Magazine***");
		System.out.println("Title : "+getTitle());
		System.out.println("Writer : "+getWriter());
		System.out.println("Page : "+getPage());
		System.out.println("Release : "+getRelease());
		System.out.println("**************\n");
	}
}
