package Chapter5;

import java.util.Scanner;

public class ArrayTest4 {

	public static void main(String[] args) {
		int [] ar = new int [6];
		Scanner sc = new Scanner(System.in);
		loop:for(int i = 0; i < 6; i = i + 1) {
			
			System.out.print("숫자를 입력하세요 : ");
			ar[i] = sc.nextInt();
			if(ar[i] < 0 || ar[i] > 45) {
				System.out.println("1~45사이의 숫자만 입력하세요");
				--i;
				continue;
			}
			
			for(int j = 1; j < i; j = j + 1) {
				if(ar[i] == ar[i-j]) {
					System.out.println("중복된 숫자입니다");
					--i;
					continue loop;
				}
				if(i-j == 0) {
					--i;
					continue loop;
				}
				
			}
		}
		sc.close();
		for(int i = 0; i < ar.length; i = i + 1) {
			System.out.println(i + ":" + ar[i]);
		}
		
	}

}
