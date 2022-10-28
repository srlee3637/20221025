package naver.srlee3637.thread;

class ThreadEx1 extends Thread{
	public void run() {
		for(int i = 0; i < 10; i++) {

			try {
				Thread.sleep(1000);
				System.out.println(i);

			}catch(Exception e) {}
		}
	}
}

public class ThreadMain {

	public static void main(String[] args) {
		new ThreadEx().start();
		new ThreadEx().start();
		
		
	}

}
