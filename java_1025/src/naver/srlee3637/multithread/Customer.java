package naver.srlee3637.multithread;

public class Customer extends Thread {
	private Product myList;

	//생성자
	public Customer(Product myList) {
		this.myList = myList;
	}
	
	@Override
	public void run() {
		for(int i = 0; i < 26; i++) {
			myList.get();
		}
	}
}
