package Chapter5;

public class OneArray {

	public static void main(String[] args) {
		int [] ar = {10, 20, 30};
		int cnt = ar.length;
		for(int i = 0; i < cnt; i = i + 1) {
			System.out.println("ar[" + i + "] = " + ar[i]);
		}

	}

}
