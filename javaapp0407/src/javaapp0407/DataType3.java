package javaapp0407;

public class DataType3 {

	public static void main(String[] args) {
		// byte ���� 2�� ����
		byte b1 = 10;
		byte b2 = 13;
		
		//�� ������ ���� -> int���� ���� �����ʹ� int�� ��ȯ�ؼ� ����
		//b1�� b2�� int�� ��ȯ�ؼ� �����߱� ������ ����� int�� �ȴ�.
		//int�� byte�� ���� ���Ѵ�.
		//byte result = b1 + b2;
		
		int result = b1 + b2;
		//int / int = int
		result = 10 / 3;
		System.out.println("result : " + result);
		//double / int �� int�� double�� �����ؼ� ���� -> ����� 3.33333...
		//�ڵ����� double������ �ٲ� ���� �ڵ� �� ��ȯ
		System.out.println("result : " + (10.0/3));
		
		int x = (int)20.7;
		System.out.println("x : " + x);
		
		byte b5 = 10;
		byte b6 = 13;
		//������ ����� byte�� ����
		//���� �� ��ȯ�� �̿��ؼ� �ذ�
		//���� �߿��� int�� �� ��ȯ�Ǳ� ������ ������ ���� �� byte ������ ���� �� ��ȯ�� ��Ŵ
		byte b7 = (byte)(b5 + b6);
		System.out.println("b5 + b6 = " + b7);
		
		double d = (double)10/3;
		System.out.println("d : " + d);
	}

}
