package Chapter5;

import java.util.Scanner;

public class ArrayTest2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] ar = new int[5];
		int temp = 0;
		int j = 1;
		int i;
		for (i = 0; i < ar.length; i = i + 1) {
			System.out.print((i + 1) + "번째 숫자를 입력하세요 : ");
			ar[i] = sc.nextInt();
		}
	}

}
