package naver.srlee3637.bytefileprocessing;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.UUID;

public class Main {

	public static void main(String[] args) {
		//바이트 단위로 파일에 기록하기
		try {
			//오늘 날짜 문자열로 만들기
			Date date = new Date();
			//SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일");
			String file = UUID.randomUUID().toString();
			//기록할 파일 만들기, 이렇게 상대경로로 할 경우에는 맥이든 window든 상관없이 적용이된다. 
			FileOutputStream fos = new FileOutputStream("./"+/*sdf.format(date)*/file+".txt", true);
			//true를 쓰면 있는 파일에 추가로 내용 더해짐 아닌 경우는 기존 내용 사라지고 변경됨
			
			//기록할 메세지 생성, 한글 쓰면 깨지는지 안깨지는지 확인 
			String msg = "파일에 덮어쓰기";
			
			//파일에 기록
			fos.write(msg.getBytes());
			
			//파일 종료
			fos.close();
			fos.flush();
			
		} catch (Exception e) {
			System.out.println("파일 기록 실패");
			System.out.println(e.getLocalizedMessage());
		}
		
		
		//앞에서 작성한 파일 읽기
		try {
			//읽기 위한 파일 생성
			//FileInputStream fis = new FileInputStream("./2022년 10월 27일.txt");
			FileInputStream fis = new FileInputStream("C:\\Users\\user\\git\\20221025\\java_1025\\2022년 10월 27일.txt");
			//읽어서 저장할 바이트 배열 생성
			byte[] b = new byte[fis.available()];
			//읽기
			fis.read(b);
			//읽은 내용 확인
			System.out.println(new String(b));
			System.out.println(Arrays.toString(b));
			
			fis.close();
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
		
	}

}
