package javaapp0409;

public class ifpractice {

	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.print("���� : ");
		int score = sc.nextInt();
		sc.close();
		if (score >= 60) {
			System.out.println("�հ�");
		}
		System.out.println("����");
	}

}
