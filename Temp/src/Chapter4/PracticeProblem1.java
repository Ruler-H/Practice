package Chapter4;

public class PracticeProblem1 {

	public static void main(String[] args) {
		for(int i = 0; i <= 4; i = i + 1) {
			for(int j = 0; j <= 4; j = j + 1) {
				if(i < j) {
					break;
				}
				System.out.print("*");
			}
			System.out.println(" ");
		}

	}

}