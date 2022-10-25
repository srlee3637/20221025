package java_1025;

import java.util.ArrayList;
import java.util.LinkedList;

public class CollectionTest3 {

	public static void main(String[] args) {

		//100000개의 데이터를 가진 ArrayList와 LinkedList 생성

		ArrayList<Integer> al = new ArrayList<>();
		for(int i = 0; i < 100000; i++) {
			al.add(i);
		}

		LinkedList<Integer> li = new LinkedList<>();
		for(int i = 0; i < 100000; i++) {
			li.add(i);
		}


		//ArrayList에서 100000 개의 데이터를 읽는데 걸리는 시간
		//데이터를 가져오는 메서드는 get(인덱스)
		//실행해서 가장 마지막에 나오는 숫자를 확인을 한후 al을 li로 변경해서 실행하고 숫자는 확인
		long start = System.currentTimeMillis();
		for(int i=0; i<100000; i++) {
			al.get(i);
		}
		long end = System.currentTimeMillis();

		System.out.println("ArrayList 조회 시간 " + (end - start) * 0.001 + "초");

		start = System.currentTimeMillis();
		for(int i=0; i<100000; i++) {
			li.get(i);
		}
		end = System.currentTimeMillis();

		System.out.println("LinkedList 조회 시간 " + (end - start) * 0.001 + "초");
		
	
	}

}
