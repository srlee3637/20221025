package naver.srlee3637.serializable;

import java.io.Serializable;
import java.util.Date;

//인스턴스 단위로 읽고 쓰기가 가능한 클래스 - Serializable 인터페이스 때문
public class MenuDTO implements Serializable{
	private int num;
	private String name;
	private Date day;
	
 	public MenuDTO() {
 		super();
 	}
	public MenuDTO(int num, String name, Date day) {
		super();
		this.num = num;
		this.name = name;
		this.day = day;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDay() {
		return day;
	}
	public void setDay(Date day) {
		this.day = day;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	//toString 
	@Override
	public String toString() {
		return "MenuDTO [num=" + num + ", name=" + name + ", day=" + day + "]";
	}
}
