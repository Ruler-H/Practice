package Chapter4;

import java.util.Scanner;

public class LoginTest1 {

	public static void main(String[] args) {
		String id = null;
		String pw = null;
		Scanner input = new Scanner(System.in);
		System.out.print("아이디를 입력하세요 : ");
		id = input.nextLine();
		System.out.print("비밀번호를를 입력하세요 : ");
		pw = input.nextLine();
		
		if(id.equals("root") && pw.equals("system")) {
			System.out.println("로그인 성공");
		}else {
			System.out.println("로그인 실패");
		}
		input.close();

	}

}
