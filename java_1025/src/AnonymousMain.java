
//인터페이스: 상속하는게 아니고 구현하는 것이다. implements
interface Starcraft{
	public void attack();
}

//인터페이스를 구현한 클래스를 생성
class Protoss implements Starcraft{
	@Override
	//implements라고 해야함 
	//overriding(확장) 은 기존에 내용이 있는 경우에 추가를 하는 것이다
	public void attack() {
		System.out.println("질럿의 공격");
	}
}

public class AnonymousMain {

	public static void main(String[] args) {
		//인터페이스를 implements한 클래스를 만들고 인스턴스를 만든 후 메서드를 호출 
		Starcraft star = new Protoss();
		star.attack();
		
		//인터페이스를 implements한 클래스를 만들지 않고 인스턴스를 생성해서 호출
		//인터페이스를 인스턴스 생성하듯 생성해주고 { } 를 넣어서 인터페이스를 implements한다. 한번만 사용할 때 유용하다. 
		//아닌경우는 class를 생성하여 implements해준다. class - static 정적, instance - dynamic 동적 
		star = new Starcraft() { //위에도 star을 사용하고, 아래도 star를 사용한다 다형성 생성자를 다른 거로 만들어줘서 다른 값이 나온다

			@Override
			public void attack() {
				System.out.println("저글링의 공격");
				
			}};
		star.attack();
		//동일한 코드가 대입된 인스턴스에 따라서 다르게 호출되는 것: 다형성(polymorphism)
		
		//변수를 만들지 않고 인스턴스만 생성해서 메서드 호출
		new Starcraft() {

			@Override
			public void attack() {
				System.out.println("테란의 공격");
			}
			
		}.attack();
	}
		

}
