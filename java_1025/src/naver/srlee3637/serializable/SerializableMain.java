package naver.srlee3637.serializable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Date;

public class SerializableMain {

	public static void main(String[] args) {
		
		try(//인스턴스 단위에 파일에 기록할 수 있는 객체를 생성
				ObjectOutputStream oos = new ObjectOutputStream(
						new FileOutputStream("./multiobject.txt"));) {
			
			//인스턴스 단위에 파일에 기록할 수 있는 객체를 생성
//			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("./multiobject.txt"));
			
			//기록할 인스턴스 생성
			MenuDTO dto1 = new MenuDTO(1,"짜장면", new Date());
			MenuDTO dto2 = new MenuDTO(2,"짬뽕", new Date());
			//이렇게 생성하면 안된다 - 데이터는 하나로 만들어야 하기 때문 
			
			//기록
//			oos.writeObject(dto1);
//			oos.writeObject(dto2);
			
			//기록할 인스턴스가 여러개 이므로 하나의 List로 묶어준다
			ArrayList<MenuDTO> list = new ArrayList<>(); 
			list.add(dto1);
			list.add(dto2);
			
			//기록
			oos.writeObject(list);
			
			
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
		
		//인스턴스 단위에 파일에 읽어낼 수 있는 객체 생성
		try(ObjectInputStream ois = new ObjectInputStream(
				new FileInputStream("multiobject.txt"));) {
			
			//인스턴스 단위에 파일에 읽어낼 수 있는 객체 생성
			//ObjectInputStream ois = new ObjectInputStream(new FileInputStream("multiobject.txt"));
			//하나의 데이터 읽어오기
//			MenuDTO dto = (MenuDTO)ois.readObject();
//			System.out.println(dto);			
			//기록을 할 때 List를 사용했으므로 읽어올 때 List로 읽어야 함
			ArrayList list = (ArrayList)ois.readObject();
			
			for(Object obj: list) {
				System.out.println(obj);
			}
			
			
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
	}

}
