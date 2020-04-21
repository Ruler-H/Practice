package Chapter4;

public class Gugudan {

	public static void main(String[] args) {
		for(int dan = 2; dan <= 9; dan = dan + 1) {
			System.out.println("[" + dan + "]단");
			for(int i = 1; i <= 9; i = i + 1) {
				int result = dan * i;
				System.out.print(dan + "*" + i + "=" + result + "\t");
			}
			System.out.println(" ");
		}

	}

}
