package hw_01;

public class CheckArray {
	public boolean solution(int array[]) { //�� ���� �Ǵ� �޼ҵ�
		
		boolean answer = false;
		int every = 0;           //1���� array.length������ ���� �� �迭�� �����ϴ� ������ ���� 
		
		for(int i=1; i<=array.length; i++) {    //i�� 1~array.length������ ��
			
			boolean find = false; //�� ���ڸ� ã�Ҵ��� Ȯ��
			
			for(int j=0; j<array.length&&find==false; j++) {  //j�� �迭�� ��ġ
				if(array[j]==i) {             //j��ġ�� ���� i�� ��ġ�ϴ°�?
					find = true;      //i�� ����. ���� i�� ã�� �۾� ������ ���� �� ã�� �۾��� ����
					every++;          //i�� �����ϹǷ� ����
				}
			}
		}
		if(every==array.length)       //1���� length������ ���ڰ� ��� �����ϴ°�?
			answer = true;
		
		return answer;           //�� ���� ����� ����
	}
	
	public void print(int array[]) {  //���� �迭�� ���ҵ�� �������� ����ϴ� �޼ҵ�
		System.out.print("array : ");
		for(int i=0; i<array.length; i++)  //�迭�� ���ҵ� ���
			System.out.print(array[i]+" ");
		System.out.println(solution(array));  //�� ���� �Ǵ� �޼ҵ� �̿��Ͽ� ���
	}
	
	public static void main(String args[]) {
		
		CheckArray ca = new CheckArray();   //���� �޼ҵ�(static)���� ���� �޼ҵ尡 �ƴ� �޼ҵ带 ����ϱ� ���� class ȣ��
		
		int array[] = {4, 1, 3, 2};
		int array2[] = {4, 1, 3};
		int array3[] = {5, 4, 1, 2, 3};
		int array4[] = {2, 4, 1, 1, 4};
		int array5[] = {3, 4, 2, 6, 1, 5};
		int array6[] = {4, 2, 5, 1, 3, 7};
		
		ca.print(array);
		ca.print(array2);
		ca.print(array3);
		ca.print(array4);
		ca.print(array5);
		ca.print(array6);
	}
}
