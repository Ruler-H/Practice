package javaapp0408;

public class DoubleProblem {

	public static void main(String[] args) {
		double sum = 0;
		int idx = 0;
		//�Ǽ��� ������ ��������� �ϸ�
		//�߸��� ������ ������ �� ����
		while(idx<1000) {
			sum = sum + 0.1;
			idx++;
		}
		System.out.println(sum);
		
		System.out.println((1.0-0.8) == 0.2);

	}

}
