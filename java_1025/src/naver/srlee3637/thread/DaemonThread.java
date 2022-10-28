package naver.srlee3637.thread;

public class DaemonThread {

	public static void main(String[] args) {
		//1부터 10까지를 1초씩 딜레이하면서 출력해주는 Thread
		Thread th = new Thread(() ->  {
			for(int i = 0; i < 10; i++) {
				try {
					Thread.sleep(1000);
					System.out.println(i);
				} catch (InterruptedException e) {
					System.out.println(e.getLocalizedMessage());
				}
			}		
		});
		//Daemon Thread 설정 - 
		th.setDaemon(true); 
		th.start();
		
		try {
			Thread.sleep(3000);
			System.out.println("메인 종료");
		} catch (Exception e) {}
		
	}

}
