package naver.srlee3637.thread;

//Thread 클래스로 부터 상속받는 클래스 생성
class ThreadEx extends Thread{
	//public void run이라는 오버라이딩
	@Override
	//위의 annotation은 상위 클래스 나 인터페이스에서 제공하는 메서드가 아닌 경우 에러를 발생시켜줌
	public void run() {
		//Thread로 수행할 내용
		//1초마다 Thread 클래스 라는 문장 10번 출력
		for(int i = 0; i < 10; i++) {
			try {
				Thread.sleep(1000);
				System.out.println("Thread Class");
			} catch (InterruptedException e) {
				System.out.println(e.getLocalizedMessage());
			}
		}
	}
}

//Runnable 인터페이스를 구현한 클래스를 생성
class RunnableImpl implements Runnable{

	@Override
	public void run() {
		//Thread로 수행할 내용
		//1초마다 Runnable Interface 라는 문장 10번 출력
		for(int i = 0; i < 10; i++) {
			try {
				Thread.sleep(1000);
				System.out.println("Runnable Interface");
			} catch (InterruptedException e) {
				System.out.println(e.getLocalizedMessage());
			}
		}		
	}

}

public class ThreadCreate {

	public static void main(String[] args) {

		//Thread 클래스로 부터 상속 받은 클래스를 이용해서 Thread를 생성하고 실행
		Thread th1 = new ThreadEx();
		//start를 호출하면 run메서드의 내용을 수행 
		th1.start();

		//Runnable 인터페이스를 implements한 클래스를 이용해서 스레드를 생성하고 실행
		Thread th2 = new Thread(new RunnableImpl());
		th2.start();

//		new ThreadEx().start();
//		new RunnableImpl().run();

		//Runnable 인터페이스를 Anonymous Class를 이용해서 사용
		Thread th3 = new Thread(new Runnable() {
			public void run() {
				for(int i = 0; i < 10; i++) {
					try {
						Thread.sleep(1000);
						System.out.println("Annonymous 활용");
					} catch (InterruptedException e) {
						System.out.println(e.getLocalizedMessage());
					}
				}		

			}
		});
		th3.start();

		//Runnable 인터페이스를 Anonymous Class를 이용해서 사용
		Thread th4 = new Thread(() ->  {
			for(int i = 0; i < 10; i++) {
				try {
					Thread.sleep(1000);
					System.out.println("Lambda 활용");
				} catch (InterruptedException e) {
					System.out.println(e.getLocalizedMessage());
				}
			}		
			
		});
		th4.start();
	}

}
