package naver.srlee3637.multithread;

public class ProducerConsumerMain {

	public static void main(String[] args) {
		//자원생성
		Product product = new Product();
		//하나의 자원을 이용해서 2개의 스레드를 생성해서 실행
		new Producer(product).start();
		new Customer(product).start();
	}

}
