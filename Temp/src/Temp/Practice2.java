package Temp;

import java.util.Scanner;

public class Practice2 {

	public static void main(String[] args) {
		//콘솔로부터 입력받기 위한 객체 생성
		Scanner sc = new Scanner(System.in);
		System.out.println("변환하고자 하는 초를 입력하세요 : ");
		//콘솔에서 정수를 입력하면 input에 저장
		int input = sc.nextInt();
		int hour = input / 3600;
		int minute = (input - (hour*3600)) / 60;
		int second = input - (hour*3600) - (minute*60);
		System.out.println("입력하신 " + input + "초는 " + hour + "시간 " + minute + "분 " + second + "초 입니다.");
		sc.close();

	}

}
