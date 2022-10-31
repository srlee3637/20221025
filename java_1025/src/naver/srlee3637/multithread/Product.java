package naver.srlee3637.multithread;

import java.util.ArrayList;
import java.util.List;

//공유 자원의 역할을 수행할 클래스 - 진열대 역할
public class Product {
	//문자를 저장할 수 있는 List -  공유 자원
	List<Character> list;
	
	//생성자
	public Product() {
		list = new ArrayList<>();
	}
	
	//생산자 메서드
	public synchronized void put(Character ch) {
		list.add(ch);
		System.out.println("창고에 제품 " + ch + "가 입고 되었습니다.");
		
		try {
			Thread.sleep(1000);
			System.out.println("재고 수량:" + list.size());
		} catch (Exception e) {}
		//물건을 생산했다고 알려줌
		notify();
	}
	
	//소비자 메서드
	public synchronized void get() {
		
		try {
			if(list.size() == 0) {
				wait();
			}
		} catch (Exception e) {}
		//첫번째 데이터를 꺼내서 ch에 대입
		Character ch = list.remove(0);
		System.out.println("창고에서 제품 " + ch + "를 출고 하였습니다.");
		
		try {
			Thread.sleep(1000);
			System.out.println("재고 수량:" + list.size());
			
		} catch (Exception e) {}
		//물건을 생산해따고 알려줌
		
	}
	
	


}
