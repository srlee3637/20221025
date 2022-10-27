package naver.srlee3637.bufferstream;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class ByteBufferStream {

	public static void main(String[] args) {

		try {
			PrintStream ps = new PrintStream(new FileOutputStream("./buffer.txt"));
			ps.print("문자열을 버퍼를 이용해서 출력");
			ps.flush();
			ps.close();
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
	}

}
