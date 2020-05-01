package Chapter5;

import java.util.Scanner;

public class ArrayTest1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] ar = new int[5];
		int temp = 0;
		int j = 1;
		int i;
		for(i = 0; i < ar.length; i = i + 1) {
			System.out.print((i + 1) + "번째 숫자를 입력하세요 : ");
			ar[i] = sc.nextInt();
		}
		for(i = 0; i < ar.length; i = i + 1) {
			if(temp < ar[i]) {
				temp = ar[i];
			}
		}
		for(i = 0; i < ar.length; i = i + 1) {
			if(ar[i] == temp) { 
				j = i + 1;
			}
		}
		
		System.out.println("제일 큰 수는 " + temp + "이고 " + "저장된 위치는 " + j);
		sc.close();
	}

}
