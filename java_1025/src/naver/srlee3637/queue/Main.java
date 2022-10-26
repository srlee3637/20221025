package naver.srlee3637.queue;

import java.util.Comparator;
import java.util.Date;
import java.util.PriorityQueue;

import naver.srlee3637.stack.PersonVO;

public class Main {

	public static void main(String[] args) {
		//PriorityQueue는 데이터를 정렬된 순서대로 꺼낼 수 있도록 해주는 클래스
		//PriorityQueue 실제로는 Tree구조이다
		//검색: 순차검색, 제어 검색, 해싱검색
		
		//정수를 저장하는 PriorityQueue를 만들어서 출력
		PriorityQueue<Integer> intQueue = 
				new PriorityQueue<>();
		
		//데이터 저장
		intQueue.offer(100);
		intQueue.offer(70);
		intQueue.offer(90);
		
		System.out.println(intQueue);
		//데이터 꺼내기 - 크기 순서대로 나온다
		System.out.println(intQueue.poll());
		System.out.println(intQueue.poll());
		System.out.println(intQueue.poll());
		System.out.println(intQueue.poll());
		
		//PersonVO 클래스를 저장하는 우선순위 큐
		//이 상태에서 만들면 PersonVO의 크기 비교를 할 수 없기 때문에 예외 발생
		//PriorityQueue<PersonVO> persons = new PriorityQueue<>();
		
		//PersonVO 클래스에 Comparable 인터페이스를 implements하고 
		//compareTo라는 메서드를 재정의해서 해결할 수 있고,
		
		//Comparator 인터페이스를 대입받을 수 있는 경우에는 Comparator인터페이스를 
		//구현한 클래스의 인스턴스를 이용해서 생성해도 됩니다.(이 방법을 더 권장함) 
		//기존의 것들을 손대는 건 위험하기 때문에 이걸 건들여야한다.
		//★★★★★★★★★★★★★★★★정렬을 할 때는 무조건 크기 비교를 할 수 있어야 한다★★★★★★★★★★★★★★★★★
		PriorityQueue<PersonVO> persons = new PriorityQueue<>(new Comparator<PersonVO>() {

			@Override
			public int compare(PersonVO o1, PersonVO o2) {
				return o1.getBirthday().compareTo(o2.getBirthday());
			}
			
		});
		
		persons.offer(new PersonVO(
				1, "강진축구", new Date(100, 9, 10), "01011112222"));
		persons.offer(new PersonVO(
				2, "프리스톤테일", new Date(102, 5, 1), "01033334444"));
		persons.offer(new PersonVO(
				3, "아담", new Date(97, 1, 3), "01055556666"));
		
		System.out.println(persons.poll());
		System.out.println(persons.poll());
		System.out.println(persons.poll());
		System.out.println(persons.poll());
		//tree 구조 이기 때문에 tree는 마지막에 nil을 저장해서 끝인 걸 표현해줌
		//따라서 값이 없을 경우에 Underflow가 나는 것이 아니라 null을 반환
	}

}
