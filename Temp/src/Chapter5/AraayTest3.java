package Chapter5;

public class AraayTest3 {

	public static void main(String[] args) {
		int[] ar = { 2, 5, 3, 9, 1, 4 };
		int[] br = new int[ar.length];
		for (int i = 0; i < ar.length; i = i + 1) {
			if (i == 0) {
				br[0] = ar[0];
			} else {
				br[i] = ar[i];
				for (int j = 0; j < i; j = j + 1) {
					if (br[i - 1 - j] > br[i - j]) {
						int temp = br[i - 1 - j];
						br[i - 1 - j] = br[i - j];
						br[i - j] = temp;
					} else {
						break;
					}
					if(i - 1 - j == 0) {
						break;
					}
				}
				
			}
		}
		for (int temp : br) {
			System.out.print(temp);
		}
	}
}