package Chapter4;

import java.util.Scanner;

public class PracticeGugudan {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("1부터 9까지의 임의의 숫자를 입력하세요 : ");
		int dan = sc.nextInt();
		for(int su = 1; su <= 9; su = su + 1) {
			int result = dan * su;
			System.out.println(dan + " * " + su + " = " + result);
			sc.close();
		}

	}

}
