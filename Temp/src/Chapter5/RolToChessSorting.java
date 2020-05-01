package Chapter5;

import java.util.Arrays;
import java.util.Comparator;

public class RolToChessSorting {

	public static void main(String[] args) {
		UserData [] ar = new UserData[10];
		UserData chm1 = new UserData();
		chm1.setName("갱플랭크");
		chm1.setCost(5);
		chm1.setDps(60);
		ar[0] = chm1;
		
		ar[1] = new UserData();
		ar[1].setName("그레이브즈");
		ar[1].setCost(1);
		ar[1].setDps(30);
		
		ar[2] = new UserData();
		ar[2].setName("니코");
		ar[2].setCost(3);
		ar[2].setDps(33);
		
		ar[3] = new UserData();
		ar[3].setName("다리우스");
		ar[3].setCost(2);
		ar[3].setDps(39);
		
		ar[4] = new UserData();
		ar[4].setName("라칸");
		ar[4].setCost(2);
		ar[4].setDps(32);
		
		ar[5] = new UserData();
		ar[5].setName("럭스");
		ar[5].setCost(3);
		ar[5].setDps(28);
		
		ar[6] = new UserData();
		ar[6].setName("럼블");
		ar[6].setCost(3);
		ar[6].setDps(35);
		
		ar[7] = new UserData();
		ar[7].setName("레오나");
		ar[7].setCost(1);
		ar[7].setDps(28);
		
		ar[8] = new UserData();
		ar[8].setName("루시안");
		ar[8].setCost(2);
		ar[8].setDps(35);
		
		ar[9] = new UserData();
		ar[9].setName("룰루");
		ar[9].setCost(5);
		ar[9].setDps(36);
		
		//정렬 - 예외 발생
		//ar은 UserData의 배열이고 UserData는
		//Comparable 인터페이스가 implements되지 않아서
		//Arrays.sort(ar);
		Comparator<UserData> comp1 = new Comparator(){

			@Override
			public int compare(Object o1, Object o2) {
				UserData o3 = (UserData)o1;
				UserData o4 = (UserData)o2;
				return o4.getDps() - o3.getDps();
			}
			
		};
		Arrays.sort(ar, comp1);
		
		//배열의 데이터 전부 출력
		for(UserData temp : ar) {
			System.out.println(temp);
		}
		
		
		

	}

}
