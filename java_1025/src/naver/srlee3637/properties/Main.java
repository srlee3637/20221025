package naver.srlee3637.properties;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Main {

	public static void main(String[] args)  {
		//프로퍼티스 인스턴스 생성
		Properties properties = new Properties();
		//없는 키를 사용하면 null이 리턴
		System.out.println(properties.getProperty("name"));
		
		//프로퍼티스에 프로퍼티를 저장
		properties.setProperty("아담", "한국 최초의 사이버 가수");
		properties.setProperty("강진축구", "세계 최초의 온라인 축구 게임");
		properties.setProperty("프리스톤테일", "한국 최초의 자체 3D 엔진 MMOR");
		
		//텍스트 파일로 저장
		try {
			properties.store(new FileOutputStream("./myproject.properties"), "텍스트로 저장");
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		//예외처리를 해야함 - 자바가 만든게 아닌거를 사용할 때는 예외처리 
		//(file handling, 외부 서버와 네트워크 작업할 때, 데이터베이스 작업할 때) 이 3가지는 무조건 예외처리를 해야함
		System.out.println(properties);
	}

}
