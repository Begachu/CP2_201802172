package n01;

import java.util.*;

public class N01 {
	public static void main(String[] arg) {
		String string;
		char ch;
		int a=0; int b=0;
		
		Scanner sc = new Scanner(System.in);
		string = sc.nextLine();
		
		for(int i=0; i<string.length(); i++) {
			ch = string.charAt(i);
			if(ch>='A'&&ch<='Z')
				a++;
			else if(ch==' ')
				b++;
		}
		System.out.println("�빮�� : "+a+"��");
		System.out.println("���� : "+b+"��");
	}

}
