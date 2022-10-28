package naver.srlee3637.nestedclass;

public class Outer {
	//내포 클래스 - 다른 클래스 안에 만들어진 클래스
	class Inner{
		public int num;
	}
	
	//내포 클래스 안에 static 멤버가 있으면 인스턴스 생성 없이 사용할 수 있도로 static을 추가
	//static이 있는 변수는 그냥 사용할 수 있지만, static이 없는 경우는 instance를 생성해서 사용해야함
	static class StaticInner{
		public int num;
		public static int share; 
	}
	
	public void method() {
		//메서드 안에 만들어진 클래스 - Local Inner
		//메서드 안에서만 사용이 가능한 클래스
		//만약 이 Inner를 다른 메서드도 사용한다면 그냥 Inner로 바깥으로 빼서 사용하면 된다.
		class LocalInner{
			public int num;
			public void method() {
				
			}
		}
	}

}
