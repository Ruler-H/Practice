package javaapp0407;

public class Practice {

	public static void main(String[] args) {
		double d1 = 10.776;
		//���� ���ڸ� �Ҽ� ù° �ڸ����� �ݿø��ؼ� ����
		int result = (int)(d1 + 0.5);
		System.out.println("result : " + result);
		
		//�Ҽ� ù° �ڸ� �ø�
		//�������絥���Ͱ���-1 / �������絥���Ͱ���
		int count = 111;
		int pageCnt = 20;
		result = (count+(pageCnt-1))/pageCnt;
		System.out.println("result : " + result);
		
		//short�� -32768 ~ 32767���� ���� ����
		//Overflow �߻� - -32768
		short s1 = (short)-32769;
		System.out.println("s1 : " + s1);
		
		int a = 10;
		int b = 10;
		int c = 20;
		System.out.println("a : " + 
				System.identityHashCode(a));
		System.out.println("b : " + 
				System.identityHashCode(b));
		System.out.println("c : " + 
				System.identityHashCode(c));
		double z = 0.1+0.1;
		System.out.println(z);
	}

}