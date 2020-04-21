package Temp;

import java.util.Scanner;

public class Practice3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("변환하고자 하는 섭씨 온도를 정수로 입력하세요 : ");
		int celsius = sc.nextInt();
		double hwassi = 9.0/5*celsius+32;
		System.out.println("입력한 섭씨 " + celsius + "도의 화씨 온도는 " + hwassi + "도");
		sc.close();
	}

}
