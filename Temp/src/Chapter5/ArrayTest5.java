package Chapter5;

import java.util.Scanner;

public class ArrayTest5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("년도를 입력하세요 : ");
		int year = sc.nextInt();
		System.out.print("월을 입력하세요 : ");
		int month = sc.nextInt();
		System.out.print("일을 입력하세요 : ");
		int day = sc.nextInt();
		int sum = 0;
		for (int i = 1; i < year; i = i + 1) {
			if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
				sum = sum + 366;
			}else {
				sum = sum + 365;
			}
		}
		for (int i = 1; i < month; i = i + 1) {
			switch(month) {
			case 1, 3, 5, 7, 8, 10, 12:
				sum = sum + 31;
			case 2:
				if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
					sum = sum + 29;
				}else {
					sum = sum + 28;
				}
			case 4, 6, 9, 11:
				sum = sum + 30;
			}
			
		}
		sum = sum + day;
		String temp;
		switch(sum%7) {
		case 0 : 
			temp = "일요일";
		case 1 : 
			temp = "월요일";
		case 2 : 
			temp = "화요일";
		case 3 : 
			temp = "수요일";
		case 4 : 
			temp = "목요일";
		case 5 : 
			temp = "금요일";
		case 6 : 
			temp = "토요일";
		}
		System.out.println(year + "년" + month + "월" + day + "일은 " temp);
		sc.close();
	}

}
