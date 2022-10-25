package java_1025;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateCreate {

	private static final String DEPRECATION = "deprecation";

	@SuppressWarnings(DEPRECATION)
	public static void main(String[] args) {
		//현재 시간을 갖는 Date 인스턴스 생성
		Date currentTime = new Date();
		//출력
		System.out.println(currentTime);
		
		//원하는 날짜를 가지고 생성 : 1995년 5월 5일 13:00:00 로 설정
		Date firstMeetingTime = new Date((1995-1900), (12-1), 26, 9, 30, 0);
		Date today = new Date((2022-1900), (10-1), 25, 10, 30, 0);
		Date today1 = new Date((2022-1900), (10-1), 25, 10, 58, 0);
		Date yesterday = new Date((2022-1900), (10-1), 24, 10, 30, 0);
		Date tomorrow = new Date((2022-1900), (10-1), 26, 10, 30, 0);
		//출력
		System.out.println(firstMeetingTime);
		
		//년도만 추출해서 출력
		System.out.println(firstMeetingTime.getYear() + 1900 + "년");
		
		//원하는 포멧으로 출력
		//1995년 12월 26일 화요일 이라고 출력
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 M월 d일 E요일");
		System.out.println(sdf.format(firstMeetingTime));
		
		//연습 해볼만한 과제 - 년월일을 비교해서 년월일이 같으면 시간과 분을 그렇지 않으면 년월일을 출력
		
		
	}

}
