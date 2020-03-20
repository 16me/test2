package c_control;

import java.util.*;

public class Ex03_if_성적 {
	public static void main(String[] args) {
		// 0. 국, 영, 수 점수 입력받아서 총점, 평균 입력
		Scanner input = new Scanner(System.in);

		System.out.println("국어/영어/수학 점수를 입력하시오.");
		int kor = input.nextInt();
		int eng = input.nextInt();
		int math = input.nextInt();

		int sum;
		sum = kor + eng + math;
		
		double evg;
		evg =  sum / 3;

		// 4. 출력
		System.out.printf("국어 : %d, 영어 : %d, 수학 : %d, 총점 : %d, 평균 : %.1f", kor, eng, math, sum, evg);
		
		
		// 1. 평균에 따른 학점(A~F) 출력
		if ( evg >= 90) {
			System.out.println('a');
		} else if( evg >= 80) {
			System.out.println('b');
		} else if( evg >= 70) {
			System.out.println('c');
		} else if( evg >= 60) {
			System.out.println('d');
		} else if( evg >= 50) {
			System.out.println('e');
		}else if( evg < 40) {
			System.out.println('f');
		} 
	
	}
}
		//*** if 문 이용
	
