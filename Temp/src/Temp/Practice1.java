package Temp;

public class Practice1 {

	public static void main(String[] args) {
		int coke = 1000;
		int cider = 800;
		int temp = coke;
		coke = cider;
		cider = temp;
		
		System.out.println("콜라는 " + coke + "원 사이다는 " + cider + "원");

	}

}
