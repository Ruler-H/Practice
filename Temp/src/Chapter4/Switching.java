package Chapter4;

public class Switching {
	public static void main(String args[]) {
		boolean flag = false;
		for(int i = 1; i <= 10; i = i + 1) {
			if(flag == false) {
				System.out.println("On");
			}else {
				System.out.println("Off");
			}
			flag = !flag;
		}
	}

}
