package Chapter4;

import java.util.Scanner;

public class TestIfElse {

	public static void main(String[] args) {
		int jumsu = 0;
		Scanner input = new Scanner(System.in);
		System.out.print("점수를 입력하세요 : ");
		jumsu = input.nextInt();
		if(jumsu >= 60) {
			System.out.println("당신은 합격입니다.");
		}else {
			System.out.println("당신은 불합격입니다.");
		}
		System.out.println("당신의 점수는 " + jumsu + "입니다");
		input.close();

	}

}
