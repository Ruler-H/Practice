package Temp;

public class Shift {

	public static void main(String[] args) {
		//Inteeger.toBinaryString
		
		int temp;	//계산 결과를 담기 위한 변수
		
		System.out.println(8);
		System.out.println(Integer.toBinaryString(8));
		//2번 왼쪽으로 Shift하면 4배가 되서 32
		temp = 8 << 2;
		System.out.println("8 << 2 = " + temp);
		System.out.println(Integer.toBinaryString(temp));
		
		//28번을 밀면 1이 맨 앞으로 이동을 하게 되서 음수
		temp = 8 << 28;
		System.out.println("8 << 28 = " + temp);
		System.out.println(Integer.toBinaryString(temp));
		
		System.out.println(-8);
		System.out.println(Integer.toBinaryString(-8));
		
		temp = -8 << 2;
		System.out.println("-8 << 2 = " + temp);
		System.out.println(Integer.toBinaryString(temp));
		
		System.out.println(-8);
		System.out.println(Integer.toBinaryString(-8));
		
		//오른쪽으로 shift하면 첫번째 비트가 맨 앞에 추가
		temp = -8 >> 2;
		System.out.println("-8 >> 2 = " + temp);
		System.out.println(Integer.toBinaryString(temp));
		
		System.out.println(-8);
		System.out.println(Integer.toBinaryString(-8));
		
		//>>>은 무조건 0이 맨 앞에 추가되므로 음수를 가지고 하게 되면 양수로 변경
		temp = -8 >>> 2;
		System.out.println("-8 >>> 2 = " + temp);
		System.out.println(Integer.toBinaryString(temp));
		
		//33번 shift인 경우 34가 32보다 크거나 같으므로 32로 나눈 나머지인 2번만 수행
		temp = 4 << 34;
		System.out.println("4 << 34 = " + temp);
		System.out.println(Integer.toBinaryString(temp));

	}

}
