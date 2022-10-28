package naver.srlee3637.lambda;

import java.util.Arrays;
import java.util.Collections;
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

public class LambdaMain {

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
		//Comparator는 메서드가 1개만 존재
		Arrays.sort(ar, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return o2.compareTo(o1);
			}
			
		});
		
//		Collections.sort(ar, (o1,o2) -> {
//			o2.compareTo(o1);
//		});
		
		//두개 다 같은 거임, 위에 anonymous보다 가독성이 떨어짐
		//Comparator 인터페이스는 메서드가 1개 밖에 없으므로 람다로 표현하는 것이 가능
		//람다를 만들 때는 인터페이스 이름과 메서드 이름은 중요하지 않음
		//매개변수의 개수와 리턴 타입만 확인하면 됨
		//매개변수는 2개이고 리턴 타입은 정수
		//매개변수가 1개면 ( ) 생략 가능
		//return 하는 문장만 존재한다면 { } 와 return 생략 가능
		//메서드의 매개변수로 코드(함수)를 대입한 것 처럼 보이도록 함
		//메서드의 매개변수로 코드(함수)를 대입할 수 있는 방식을 함수형 프로그래밍이라고 함 - 
		//java는 함수형 프로그래밍을 지원하지는 않고, 보이는 것을 그렇게 한다. 
		Arrays.sort(ar, (o1,o2) -> {return o2.compareTo(o1);});
		System.out.println(Arrays.toString(ar));
		Arrays.sort(ar, (o1,o2) -> o1.compareTo(o2));
		
		
		//배열의 요소를 빠르게 확인
		System.out.println(Arrays.toString(ar));
		
		//하나씩 확인
		for(String app : ar) {
			System.out.println(app);
		}
	}

}
