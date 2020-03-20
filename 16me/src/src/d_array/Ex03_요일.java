package d_array;

import java.util.*;

public class Ex03_요일 {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		int y = cal.get(Calendar.YEAR);
		int m= cal.get(Calendar.MONTH);
		int w = cal.get(Calendar.DAY_OF_WEEK_IN_MONTH);
		int d = cal.get(Calendar.DATE);
		System.out.println(y + "년 " +( m+1)+"월 "+  w + "째주 "+ d +"일 " ); // m+1 1월을 인덱스처럼 0부터 세기때문에

		int hour = cal.get(Calendar.HOUR_OF_DAY);
		int min = cal.get(Calendar.MINUTE);
		int sec = cal.get(Calendar.SECOND);
		System.out.println( hour + "시 " + min + "분 "+ sec + "초");
		
		// 요일 : 일요일(1)~ 토요일(7)
		String [] yoil = { "일", "월", "화", "수","목","금", "토"};
		
		System.out.println( yoil[cal.get(Calendar.DAY_OF_WEEK)-1] + "요일"); //-1은 "일"이 카운트 1값이므로 인덱스값은 0을 가져가게 해야함
		
	}

}
