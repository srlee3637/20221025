package naver.srlee3637.set;

import java.util.ArrayList;
import java.util.Random;
import java.util.TreeSet;

public class Lotto {

	public static void main(String[] args) {
		//랜덤한 숫자를 추출하기 위한 인스턴스 생성
		Random r = new Random();
		//ArrayList 활용
		//ArrayList의 size가 6보다 작을 때 까지
		
		ArrayList<Integer> al = new ArrayList<>();
		while(al.size() < 6) {
			//1 - 45까지의 숫자를 랜덤하게 추출
			int su = r.nextInt(45) + 1;
			if(al.contains(su)) {
				continue;
			}
			al.add(su);
		}
		
		al.sort(null);
		//출력하기 전에 정렬
		System.out.println(al);
		
		//TreeSet: 중복된 데이터를 저장하지 않고 저장된 순서를 기억합니다
		TreeSet<Integer> ts = new TreeSet<>();
		
		while(ts.size() < 6) {
			//1 - 45까지의 숫자를 랜덤하게 추출
			int su = r.nextInt(45) + 1;
			//TreeSet은 중복된 데이터를 저장하지 않기 때문에 검사할 필요가 없음
			ts.add(su);
		}
		System.out.println(ts);
//		for(Integer i : ts) {
//			System.out.printf(i + "\t");
//		}
	}

}
