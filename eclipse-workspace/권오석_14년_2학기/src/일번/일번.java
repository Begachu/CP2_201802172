package �Ϲ�;
import java.util.Scanner;
public class �Ϲ� {
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		int [] num = new int[3];
		for(int i=0; i<3; i++)
			num[i]=sc.nextInt();
		int max = num[0];
		int min = num[0];
		for(int i=1; i<3; i++) {
			if(max<num[i])
				max = num[i];
			if(min>num[i])
				min = num[i]; }
		System.out.println("�� = "+max/min);
		System.out.println("������ = "+max%min);
	}

}
