package javaapp0409;

public class if4 {

	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.print("������ �Է� �Ͻʽÿ�(0~100) : ");
		int score = sc.nextInt();
		//80~100�̸� ���
		if(80 <= score && 100 >= score) {
			System.out.print("���");
		//60~79�̸� ����
		}else if(60 <= score && 79 >= score) {
			System.out.print("����");
		//0~59�̸� ���
		}else if(0 <= score && 59 >= score) {
			System.out.print("���");
		//�� �̿��� ���� �߸��� ����
		}else {
			System.out.print("�߸��� ���� �Է�");
		}
		sc.close();

	}

}
