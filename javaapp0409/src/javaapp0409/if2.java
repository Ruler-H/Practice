package javaapp0409;

public class if2 {

	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.print("���� �Է� : ");
		int intnumber = sc.nextInt();
		sc.close();
		if(intnumber % 2 == 0) {
			System.out.println("¦��");
		}else {
			System.out.println("Ȧ��");
		}
		

	}

}
