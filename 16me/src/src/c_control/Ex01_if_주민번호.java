package c_control;

import java.util.*;

public class Ex01_if_주민번호 {

	public static void main(String[] args) {

		String id = new String();
		Scanner input = new Scanner(System.in);

		System.out.println("(-) 포함하여 주민번호를 입력하세요");
		id = input.next();

		char sung = id.charAt(7);
		// 성 변수에 값이 1이면 "남자" 출력, 2이면 "여자" 출력
		// char 문자이기 때문에 '' 넣어줘야 함

		if (sung == '1' || sung == '3' || sung == '9') {
			System.out.println("멋진 남자입니다");
		} else if (sung == '2' || sung == '4' || sung == '0') {
			System.out.println("귀여운 여자입니다");
		}
		// 문자중에 몇개 추출하기
		String nai = id.substring(0, 2); // start 번째부터 end번째 앞까지 가져오기
		// nai = "80"
		
		int nai2 = Integer.parseInt(nai); // 문자열을 정수로 변환
		// nai2 = 80

		// 올해 년도 구하기
		Calendar c = Calendar.getInstance(); // 자바의 캘린더 기능 중 하나의 인스턴스를 가져와라 
		int year = c.get(Calendar.YEAR); // 년도를 정수로 가져와라(YEAR은 무조건 대문자)

		// 위 성별이 1,2 이면 1900 더하고, 3,4 이면 2000 더하기
		int age = 0;

		if (sung == '1' || sung == '2') {
			age = year - (1900 + nai2) + 1;
		} else if (sung == '3' || sung == '4') {
			age = year - (2000 + nai2) + 1;
		} else if (sung == '9' || sung == '0') {
			age = year - (1800 + nai2) + 1;
		}
		System.out.println(age + "세 입니다.");
	}
}
