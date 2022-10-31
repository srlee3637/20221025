package naver.srlee3637.multithread;

import java.util.concurrent.Semaphore;

public class SemaphoreMain {

	public static void main(String[] args) {
		//2개씩 실행할 수 있는 세마포어
		Semaphore semaphore = new Semaphore(2);
		Thread th1 = new Thread(new SemaphoreThread("카리나", semaphore));
		Thread th2 = new Thread(new SemaphoreThread("지젤", semaphore));
		Thread th3 = new Thread(new SemaphoreThread("윈터", semaphore));
		Thread th4 = new Thread(new SemaphoreThread("닝닝", semaphore));
		
		th1.start();
		th2.start();
		th3.start();
		th4.start();
	}

}
