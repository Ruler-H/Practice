package javaapp0409;

public class Hwang3 {

	public static void main(String[] args) {
		//Ű���� �Է� ��ü �����
		java.util.Scanner sc =
				new java. util.Scanner(System.in);
		//���� �Է¹ޱ�
		System.out.print("���� : ");
		int score = sc.nextInt();
		
		sc.nextLine();
		System.out.print("�̸� : ");
		String name = sc.nextLine();
		
		System.out.println(name + "�� ������ " + score + "�� �Դϴ�.");
		
		//������� - ��������
		sc.close();

	}

}
