package javaapp0409;

public class Hwang2 {

	public static void main(String[] args) {
		String w1 = "�ݶ�";
		String w2 = "���̴�";
		//2���� ���빰�� swap
		//�� ���� ����� �ݶ� ����
		String w3 = w1;
		//�ݶ� ����ִ� �ſ� ���̴ٸ� ����
		w1 = w2;
		//���̴ٰ� ����ִ� �ſ� �ݶ� ����
		w2 = w3;
		
		System.out.println("w1 : " + w1);
		System.out.println("w2 : " + w2);

	}

}
