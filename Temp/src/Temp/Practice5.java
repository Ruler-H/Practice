package Temp;

import java.util.Scanner;

public class Practice5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("물건 가격을 입력하세요 : ");
		int money = sc.nextInt();
		
		int hundred = (1000 - money) / 100;
		int fifty = (1000 - money - (hundred * 100)) / 50;
		int ten = (1000 - money - (hundred * 100) - (fifty * 50)) / 10;
		System.out.println("100원 : " + hundred);
		System.out.println("50원 : " + fifty);
		System.out.println("10원 : " + ten);
		sc.close();
		

	}

}
