package n04;

import java.util.*;

public class ArraySum {
	public static void ReadArray(double array[][]) {
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<array.length;i++)
			for(int j=0;j<array[i].length;j++) {
				System.out.print(i+1+"�� ");
				System.out.print(j+1+"�� : ");
				array[i][j] = sc.nextDouble();
			}
	}
	public static double SumArray(double array[][]) {
		double sum = 0;
		for(int i=0;i<array.length;i++)
			for(int j=0;j<array[i].length;j++)
				sum+=array[i][j];
		return sum;
	}
	public static void main(String[] arg) {
		double[][] array = new double[2][2];
		System.out.println("20�� 10�� 2���� �迭 �Է�");
		ReadArray(array);
		System.out.println("2���� �迭�� �� : "+SumArray(array));
	}
}
