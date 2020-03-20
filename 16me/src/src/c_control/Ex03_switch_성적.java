package c_control;

import java.util.*;

public class Ex03_switch_성적 {

	public static void main(String[] args) {
		// 0. 국, 영, 수 점수 입력받아서 총점, 평균 입력
		Scanner input = new Scanner(System.in);

		System.out.println("국어/영어/수학 점수를 입력하시오.");
		int kor = input.nextInt();
		int eng = input.nextInt();
		int math = input.nextInt();

		int sum;
		sum = kor + eng + math;
		
		double avg =  (double)sum / 3;

		// 4. 출력 
		System.out.println("국어 :" + kor + ", 영어 : " + eng + ", 수학 : " + math + ", 총점 : " + sum + ", 평균 : "+ avg);
		
			
		int result = (int)avg/10; 
		System.out.println(result);
		
		String 학점 = "";
		
		switch(result) { // switch(  ) <- 문자, 정수, 변수, 문자열(String)만 삽입 가능
		case 10 :  // 동일하면 값과 break 안걸고 그대로 입력
		case 9 : 학점 = "a";
		break;
		case 8 :학점 = "b";
		break;
		case 7 : 학점 = "c";
		break;
		case 6 : 학점 = "d";
		break;
		case 5 : 학점 = "e";
		break;
		default : 학점 = "f";
		break;
		}
		System.out.println("학점은 " + 학점);
	}
}


