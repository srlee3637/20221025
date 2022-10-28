package naver.srlee3637.nestedclass;

import java.util.Arrays;
import java.util.Comparator;

//메서드가 1개인 인터페이스
interface Sample{
	//추상 메서드 선언
	public void display();
}

class SampleImpl implements Sample{
	public void display() {
		System.out.println("클래스 만들어서 사용");
	}
}

public class AnonymousMain {

	public static void main(String[] args) {
		//인터페이스를 구현한 클래스의 인스턴스를 생성해서 메서드 호출
		//인스턴스를 여러 개 만들어야 한다면 클래스를 만드는 것이 효율적
		Sample sample = new SampleImpl();
		sample.display();
		
		//인터페이스 있고, 사용하기 위해서 클래스 만들고
		//Sample 인스턴스를 Anonymous로 사용
		//인스턴스가 1개만 필요하다면 클래스를 만들지 않는 것이 효율적
		new Sample() {
			public void display() {
				System.out.println("클래스 생성하지 않고 사용");
			}
		}.display();
		
		//배열의 정렬
		String[] ar = {"아담" , "강진축구", "프리스톤테일", "카카오택시"};
		
		//배열의 내림차순 정렬
		//Arrays.sort(배열, 비교를 위한 Comparator<T> 인터페이스를 구현한 클래스의 객체)
		//를 호출해야 합니다.
		Arrays.sort(ar, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return o2.compareTo(o1);
			}
			
		});
		
		//배열의 요소를 빠르게 확인
		System.out.println(Arrays.toString(ar));
		
		//하나씩 확인
		for(String app : ar) {
			System.out.println(app);
		}
	}

}
