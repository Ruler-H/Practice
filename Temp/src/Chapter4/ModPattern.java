package Chapter4;

public class ModPattern {
	public static void main(String[] args) {
		int i = 0;
		for(;;) {
			try {
				i = i % 4;
				if(i==0)
					System.out.println("라투");
				else if(i==1)
					System.out.println("오미크론");
				else if(i==2)
					System.out.println("다크스펙터");
				else 
					System.out.println("오미크론");
				Thread.sleep(1000);
				i++;
					
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
