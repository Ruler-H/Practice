package Chapter5;

public class Matrix {

	public static void main(String[] args) {
		int[][] ar= {{10, 20, 30},{40,50,60}};
		int i, j;
		int rowCount;
		int columnCount;
		
		rowCount = ar.length;
		for(i = 0; i < rowCount; i = i + 1) {
			columnCount = ar[i].length;
			for(j = 0; j < columnCount; j = j + 1) {
				System.out.print(" " + ar[i][j]);
			}
			System.out.println();
		}

	}

}
