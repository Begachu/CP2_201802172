package hw01;

public class TestMovie {
	public static void main(String[] arg) {
		Movie movie = new Movie();
		movie.director = "����ȣ";
		movie.title = "����";
		movie.rating = 8.61;
		movie.publishDate = "2006�� 07�� 27��";
		
		movie.print();
	}
}
