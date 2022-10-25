package java_1025;

import java.util.ArrayList;
import java.util.LinkedList;

public class CollectionTest2 {

	public static void main(String[] args) {
		//문자열을 저장하는 ArrayList 생성
		ArrayList <String> al = new ArrayList<>();

		//샘플 데이터 추가
		al.add("One");
		al.add("Three");

		long start = System.currentTimeMillis();
		
		for(int i=0; i<500000; i++) {
			al.add(1, "Two");
		}
		System.out.println(al);
		long end = System.currentTimeMillis();

		System.out.println("ArrayList 데이터 삽입시간 " + (end - start) * 0.001 +"초");

		//문자열을 저장하는 LinkedList 생성
		LinkedList <String> li = new LinkedList<>();

		//샘플 데이터 추가
		li.add("One");
		li.add("Three");

		start = System.currentTimeMillis();
		for(int i=0; i<500000; i++) {
			li.add(1, "Two");
		}
		System.out.println(li);
		end = System.currentTimeMillis();

		System.out.println("LinkedList 데이터 삽입시간 " + (end - start) * 0.001 +"초");

	}

}
