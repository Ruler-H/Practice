package Chapter4;

public class PracticeProblem5 {

	public static void main(String[] args) {
		for(int i = 0; i <= 4; i = i + 1) {
			if(i<3) {
				for(int j = 0; j < 2-i; j = j + 1) {
					System.out.print(" ");
				}
			}else {
				for(int j = 0; j < i-2; j = j + 1) {
					System.out.print(" ");
				}
			}
			if(i<3) {
				for(int j = 0; j < ((i * 2) + 1); j = j + 1) {
					System.out.print("*");
				}
			}else {
				for(int j = 0; j < 9 - (i * 2); j = j + 1) {
					System.out.print("*");
				}
			}System.out.println(" ");


	}

}
}
