package javaapp0409;

public class if3 {

	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.print("���̵� : ");
		String id = sc.nextLine();
		System.out.print("��й�ȣ : ");
		String password = sc.nextLine();
		if(id.equals("ghkd") && password.equals("qudgjs")) {
			System.out.print("�����ڴ�, ȯ���մϴ�.");
		}else {
			System.out.print("���� ���̵��̰ų� �߸��� ��й�ȣ �Դϴ�.");
		}
		
		sc.close();

	}

}
