package naver.srlee3637.multithread;

public class Producer extends Thread {
	//공유자원 속성
	private Product myList;
	
	//생성자
	public Producer(Product myList) {
		this.myList = myList;
	}
	
	@Override
	public void run() {
		//삽입 작업을 26번 수행
		for(char ch = 'A'; ch <= 'Z'; ch++) {
			myList.put(ch);
		}
	}

}
