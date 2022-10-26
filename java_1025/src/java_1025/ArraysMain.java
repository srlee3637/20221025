package java_1025;
import java.util.Arrays;

public class ArraysMain {
	//배열을 가지고 작업 
	public static void main(String[] args) {
		//문자열 배열 생성
		String [] singers = {"장원영", "카리나", "지젤", "민지", "태연", "아이유", "수지"};
		
		//이분 검색 수행 - sort를 하지 않아서 잘못된 결과가 리턴됨
		int result = Arrays.binarySearch(singers, "태연");
		System.out.println(result);
		
		//데이터 정렬
		Arrays.sort(singers);
		//정렬한 데이터 확인
		System.out.println(Arrays.toString(singers));
		result  = Arrays.binarySearch(singers, "태연");
		if(result >= 0) {
			System.out.printf("%s 는 %d 번째 존재\n" , singers[result], result + 1);
		}else {
			System.out.printf("%s 는 존재하지 않음\n" , "태연");
		}
		
		
	
	}

}
