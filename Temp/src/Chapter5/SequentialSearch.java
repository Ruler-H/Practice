package Chapter5;

import java.util.Scanner;

public class SequentialSearch {

	public static void main(String[] args) {
		int ar[] = {23, 45, 19, 63, 57, 26, 75, 73, 82, 89, 47, 11};
		int i, num;
		int key = 0, index = 0;
		num = ar.length;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("찾고자 하는 숫자를 2자리로 입력하세요 : ");
		key = sc.nextInt();
		
		for(i = 0; i < num; i = i + 1) {
			if(ar[i] == key) {
				index = i + 1;
			}
		}
		if(index == 0) {
			System.out.println("찾고자 하는 값이 없습니다.");
		}else {
			System.out.println("찾는 값은 " + index + "번째에 있습니다.");
		}
		sc.close();

	}

}
