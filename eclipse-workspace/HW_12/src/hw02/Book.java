package hw02;

public class Book {
	//�ʵ�
	private String title;
	private String writer;
	private int page;
	
	//�ʵ� ������, ������ �޼ҵ�
	public void setTitle(String title) {
		this.title = title;
	}
	public String getTitle() {
		return title;
	}
	
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getWriter() {
		return writer;
	}
	
	public void setPage(int page) {
		this.page = page;
	}
	public int getPage() {
		return page;
	}
	
	//������
	public Book() {
		System.out.println("Book ����!");
		setTitle("���� ���� ã�ƶ�");
		setWriter("�ﷻ ��Ű");
		setPage(160);
	}
	
	//��� �޼ҵ�
	public void print() {
		System.out.println("*****Book*****");
		System.out.println("Title : "+getTitle());
		System.out.println("Writer : "+getWriter());
		System.out.println("Page : "+getPage());
		System.out.println("**************\n");
	}
}
