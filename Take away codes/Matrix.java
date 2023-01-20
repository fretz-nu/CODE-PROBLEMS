import java.util.Scanner;
public class Matrix {
	int row;
	int col;
	int[][] mat;
public Matrix (int r, int c) {
	row = r;
	col = c;
	mat = new int[r][c];
}
	public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.println("Enter rows:");
int x = input.nextInt();

System.out.println("Enter columns:");
int y = input.nextInt();
System.out.println("Set elements position [here][]:");
int r = input.nextInt();
System.out.println("Set elements position [][here]:");
int c = input.nextInt();
System.out.println("Enter the value you want to input:");
int val = input.nextInt();
	}

	public int getRow(int x) {
		
		return x = row;
	}

	public int getColumn(int y) {
		return y = col;
	}

	public int setElemMat(int r, int c, int val) {
		
		
		
		return val;
	}

	public int addMatrix(int[][] mat) {
		int a = 0;
		return a;
	}

	public int addMatrix(int[][] mat1, int[][] mat2) {
		int b = 0;
		return b;
	}

	public int mulMatrix(int[][] mat) {
		int c = 0;
		return c;
	}

	public int mulMatrix1(int[][] mat) {
		int d = 0;
		return d;
	}
}
