package javaapp0409;

public class if5 {

	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.print("���̵� : ");
		String id = sc.nextLine();
		System.out.print("��й�ȣ : ");
		String pw = sc.nextLine();
		if(!id.equals("root")) {
			System.out.print("���̵� ���� ���̵�");
		}else if(pw.equals("system")){
			System.out.print("�α��� ����");
		}else {
			System.out.print("�߸��� ��й�ȣ");
		}

	}

}
