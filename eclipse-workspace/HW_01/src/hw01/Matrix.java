package hw01;

public class Matrix {
	int row; //���� ��Ÿ���� ������ �ʵ�
	int col; //���� ��Ÿ���� ������ �ʵ�
	double [][] matrix; //����� ��Ÿ���� 2���� �迭
	
	int num = 0; //������ ���� �ʰ��ϴ� �Է����� ���� ������ �����ϴ� �ʵ尪
	
	public Matrix(int row, int col) { //Matrix Ŭ���� ������	
		matrix = new double[row][col];
		this.row = row;
		this.col = col;
	}
	
	public void setMatrix(double... d) {
		//���ڷ� �� ������ ����� ���� 1������ �ʱ�ȭ
		if(num<row) {	//���� �ʰ��ϴ� �Է��ΰ��� �Ǵ�
			for(int i=0; i<col; i++) {
				matrix[num][i]=d[i];
			}
			num++;
		}
	}
	
	public Matrix addMatrix(Matrix otherMatrix) {
		//�� ����� ���� ����
		Matrix result = new Matrix(row, col); //��������� ������ ��� ����
		
		for(int i=0; i<row; i++) { //�� ����� ���� ��� ���� ��İ� ũ�Ⱑ ������ �̿�
			double[] d = new double[col]; //�� ���� ���� ���� �Է¹ް� ��Ŀ� �����ϴ� ������� �۵�
			for(int j=0; j<col; j++) {
				d[j]=matrix[i][j]+otherMatrix.matrix[i][j]; //���� �� ���� ���� ���� ���Ͽ� ����
			}
			result.setMatrix(d); //�ϼ��� �� ���� �� ���� �̹� �ۼ��� �޼ҵ带 �̿��Ͽ� �����Ѵ�
		}
		return result; //�ϼ��� Ŭ������ ����� ����
	}
	
	public Matrix multiMatrix(Matrix otherMatrix) {
		//�� ����� ���� ����
		Matrix result = new Matrix(row, otherMatrix.col); //��������� ������ ��� ����
		//����� ���� ��� ��������� ���� ����� ù��° ����� ��, �ι�° ����� ���� ũŰ�� ���� ���� �̿�
		for(int i=0; i<result.row; i++) { //result.row == row��
			double[] d = new double[result.col];
			for(int j=0; j<result.col; j++) { //result.col == otherMatrix.col��
				for(int n=0; n<otherMatrix.row; n++) { //������ ���� ������� �ۿ��ϴ� ���, ���������� ������ ����ؾ���
					/*�� �ุ�� �����Ѵ� ���� �� ������ ��� ù ��° ����� ���� �� ��° ����� ���� ���Ͽ� ����.
					 * ���� ���� ���� ���� ������ �� �ݺ����� ����Ͽ� ���� ��Ŀ� ���Ͽ� �����ϴ� ������� ���� �� �ݺ��� Ƚ����
					 * ù ��° ����� ��(=�� ��° ����� ��)�� ũ�⸸ŭ�̴�.*/
					d[j]+=matrix[i][n]*otherMatrix.matrix[n][j]; //����� ���� ������ ���� ���Ѱ��� ����
				}
			}
			result.setMatrix(d); //�ϼ��� �� ���� ��� ��Ŀ� ����
		}
		return result; //�ϼ��� ����� ����
	}
	public Matrix transposed() {
		//����� ��ġ ����� ����
		Matrix result = new Matrix(col, row); //��� ���� ũ�Ⱑ �ڹٲ�
		
		for(int i=0; i<col; i++) {
			double[] d = new double[row];
			for(int j=0; j<row; j++) {
				d[j]=matrix[j][i]; //��� ���� ��ġ�� �ٲ� �� ����
			}
			result.setMatrix(d);
		}
		return result; //��������� �ϼ��� ��ġ ����� ������
	}
	public void print() {
		//����� ���
		System.out.print(">>\n");
		for(int i=0; i<row; i++) {
			System.out.print("["); //���� ����
			for(int j=0; j<col; j++) {
				System.out.print(matrix[i][j]);
				if(j<col-1)
					System.out.print(", "); //���� ���� ����� ��� ������ ���� ���� ���
			}
			System.out.print("]\n"); //���� ��, ���� ������ �Ѿ��
		}
		System.out.println();
	}
}
