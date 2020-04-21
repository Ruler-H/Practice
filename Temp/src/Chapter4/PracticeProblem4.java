package Chapter4;

public class PracticeProblem4 {

	public static void main(String[] args) {
		for(int i = 0; i <= 4; i = i + 1) {
			if(i<3) {
				for(int j = 0; j <= 4; j = j + 1) {
					if(i<j) {
						break;
					}
					System.out.print("*");
				}
			}else {
				for(int j = 0; j <= (4 - i); j = j + 1) {
				System.out.print("*");
				}
			}
			System.out.println(" ");
		}

	}

}
