package Chapter5;

import java.util.Arrays;

public class TeamFight {

	public static void main(String[] args) {
		String[] champion = { "제라스", "에코", "아우렐리온 솔", "쓰레쉬", "미스 포츈", "룰루", "피즈", "케일", "초가스", "징크스", "진" };
		// 데이터 정렬
		Arrays.sort(champion);
		// 이렐리아가 있는지 검색
		System.out.println(Arrays.binarySearch(champion, "쓰레쉬"));
		
		String [] alphabets = {"Ronaldo", "cha", "Park"};
		//영문 배열과 동일한 크기의 배열을 생성, 원본을 변경하면 안되기 때문에 복사본을 저장할 배열을 생성
		String [] imsi = new String[alphabets.length];
		//데이터 복사
		for(int i = 0; i < imsi.length; i = i + 1) {
			//원본의 데이터를 대문자로 변경해서 복사본 배열에 저장
			imsi[i] = alphabets[i].toUpperCase();
		}
		//복사본 배열을 정렬해서 출력
		Arrays.sort(imsi);
		for(String soccer : imsi) {
			System.out.println(soccer);
		}
		
	}

}
