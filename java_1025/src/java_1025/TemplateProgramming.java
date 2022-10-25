package java_1025;




/*
 * 로직은 같은데 매개 변수의 자료형이 달라서 Overloading을 이용해서 구현한 클래스
class Algorithm{
	
	//애플 같은 경우에는 이름을 길게 만들어준다 따라서 오버로딩을 별로 사용하지 않음
	//항상 오버로딩이 좋은 것만은 아니다
	//함축적인 의미가 좋을지 아니면 이해하기 좋은게 좋을지 잘 사용해보자
	public static int integerAddWithInteger(int n1, int n2) {
		return n1 + n2;
	}
	//정수 2개를 더해서 결과를 리턴하는 메서드
	public static int add(int n1, int n2) {
		return n1 + n2;
	}
	
	//실수 2개를 더해서 결과를 리턴하는 메서드
	public static double add(double n1, double n2) {//메서드 오버로딩
		return n1 + n2;
	}
}*/

//자료 형의 이름을 임시로 만들어두고 내부에서 임시로 만든 자료형을 사용한 후
//인스턴스를 생성할 때 자료형을 결정하는 방식을 이용
//단, 인스턴스를 만들 때 또는 메서드를 호출할 때 실제 자료형을 기재해야한다
//이 때 사용되는 자료형은 Object로 부터 상속받은 클래스의 자료형만 가능하다
//int와 같은 primitive type의 경우는 Integer와 같은 Wrapper 클래스를 이용해야한다.
//미지정 자료형의 개수는 제한이 없다
//인스턴스를 만들 때 자료형을 설정하지 않으면 경고가 발생한다
class Algorithm<T>{
	//두개의 데이터를 받아서 내용을 변경하는 메서드
	public void swap(T n1 , T n2) {
		T imsi = n1;
		n1 = n2;
		n2 = imsi;
	}
	
}

//어떤 종류의 데이터든지 생성자에서 개수에 상관없이 받아서 처리하는 제너릭스
class Generics <T>{//보통 한글자 대문자로 
	private T[] data;
	
	//...은 variable args로 개수에 상관없이 매개변수를 받고자 할 때 사용
	//받은 매개변수들은 배열로 만들어 진다. 
	public Generics(T...n) {
		this.data = n;
	}
	
	//배열의 데이터를 순차적으로 접근해서 출력하는 메서드
	public void display() {
		for(T temp: data) {
			System.out.println(temp);
		}
	}
}





public class TemplateProgramming {

	public static void main(String[] args) {
//		double result = Algorithm.add(10.7,20.4);
//		System.out.println(result);
//		
//		
//		int result1 = Algorithm.integerAddWithInteger(2, 3);
//		System.out.println(result1);
//		
//		int result2 = Algorithm.add(2, 3);
//		System.out.println(result2);
		
		//제너릭이 적용된 클래스의 인스턴스를 만들 때는 자료형을 기재해야한다
		//자료형을 기재하지 않으면 경고가 발생하고 Object타입으로 간주
		Algorithm<Integer> algorithm = new Algorithm<>();
		Integer n1 = 20;
		Integer n2 = 30;
		algorithm.swap(n1,n2);
		System.out.println(n1);
		System.out.println(n2);
		
		Generics <String> g1 = new Generics<String>("Karina", "Suzi", "IU");
		g1.display();
		Generics <Integer> g2 = new Generics<>(100, 200, 300, 400);
		g2.display();
		
	}

}
