package javaapp0407;

public class Practice2 {

	public static void main(String[] args) {
		double d = 0.7784;
		double resultd = (double)((int)((d * 10) + 0.5))/10;
		System.out.println(resultd);
		
		double a = 0.7784;  //�� �� �Ҽ��� ��°�ڸ����� �ݿø���Ű��
		double resulta = ((int)((a * 10) + 0.5))/10.0;
		System.out.println("result : " + resulta);
	}

}
