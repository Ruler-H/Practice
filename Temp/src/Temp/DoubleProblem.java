

/* package Temp;

public class DoubleProblem {

	public static void main(String[] args) {
		//실수 연산 - 연산의 결과가 이상
		double d = 0.3;
		double result = 1 - 3 * d;
		System.out.println("결과 : " + result);
		
		//정수로 변환한 후 연산
		result = (1 * 10 - (d * 10 * 3)) / 10.0;
		System.out.println("결과 : " + result);
		
		int x = 5;
		double y = 0.0;
		//0으로 나누는 것이 에러가 아닐 수도 있음
		double r1 = x / y;
		double r2 = x % y;
		
		//연산의 결과가 Infinity나 NaN
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r1 + 2);

	}

}
*/
public class DoubleProblem {
	
	import java.util.Scanner;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		System.out.println("년도 입력 : ");
		int year = sc.nextInt();
	
		System.out.println("월 입력 : ");
		int month = sc.nextInt();
	
		System.out.println("일 입력 : ");
		int day = sc.nextInt();
	
		//입력받은 년도 이전까지 지나온 날들을 전부 더함
		int tot = 0;
		for(int i=1;i<year; i=i+1) {
			if(i%4==0 && i%100!=0 || i%400==0) {
				tot = tot +366;
			}else {
				tot = tot + 365;
			}
		}
		int [] dayOfMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		//입력한 년도가 윤년이면 2월은 29일까지
		if(year%4==0 && year%100!=0 || year%400==0) {
			dayOfMonth[2] = 29;
		}
		//입력한 월 이전 까지의 날 수를 전두 더한다.
		for(int i=0; i<month; i=i+1) {
			tot = tot + dayOfMonth[i];
		}
		tot = tot + day;
		if(tot%7 == 1) {
			System.out.println(year + "년 " + month + "월 " + day + "일은 " + "월요일");
		}else if(tot%7 == 2) {
			System.out.println(year + "년 " + month + "월 " + day + "일은 " + "화요일");
		}else if(tot%7 == 3) {
			System.out.println(year + "년 " + month + "월 " + day + "일은 " + "수요일");
		}else if(tot%7 == 4) {
			System.out.println(year + "년 " + month + "월 " + day + "일은 " + "목요일");
		}else if(tot%7 == 5) {
			System.out.println(year + "년 " + month + "월 " + day + "일은 " + "금요일");
		}else if(tot%7 == 6) {
			System.out.println(year + "년 " + month + "월 " + day + "일은 " + "토요일");
		}else if(tot%7 == 0) {
			System.out.println(year + "년 " + month + "월 " + day + "일은 " + "일요일");
		}
	}
}
