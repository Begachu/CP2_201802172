package hw02;

import java.util.Scanner;

public class hw02 {
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		String user;
		int vowel = 0;
		int consonant = 0;
		
		System.out.print("���ڿ��� �Է��Ͻÿ�. ");
		user = sc.nextLine();
		
		for(int i = 0; i<user.length(); i++)
			switch(user.charAt(i)) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				vowel++;
				break;
			case 'b':
			case 'c':
			case 'd':
			case 'f':
			case 'g':
			case 'h':
			case 'j':
			case 'k':
			case 'l':
			case 'm':
			case 'n':
			case 'p':
			case 'q':
			case 'r':
			case 's':
			case 't':
			case 'w':
			case 'y':
			case 'x':
			case 'z':
				consonant++;
				break;
			}
		System.out.println("������ ���� : "+consonant+"��");
		System.out.println("������ ���� : "+vowel+"��");
		sc.close();	
		}
}
