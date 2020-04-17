package Temp;

public class Error {

	public static void main(String[] args) {
		byte a = 10;
		byte b = 20;
		byte c = a + b;
		
		//이 때 a와 b가 모두 int 형으로 변환되어 연산하고
		//따라서 연산의 결과도 int형이 되므로 대입 불가능
		//byte c = (byte)(a +b);로 수정하던지
		//int c = a + b;로 수정하면 에러가 없어짐
		System.out.println(c);

	}

}
