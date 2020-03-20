package a_datatype;

import java.util.Scanner;

public class Ex05_Scanner {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		// 1 .국, 영, 수 점수를 저장할 변수를 선언하고 값을 지정
		System.out.println("국어/영어/수학 점수를 입력하시오.");
		int kor = input.nextInt();
		int eng = input.nextInt();
		int math = input.nextInt();
		
		// 2. 총점 구하기
		int sum;
		sum = kor + eng + math;
		
		// 3. 평균 구하기
		double evg;
		evg = (double) sum / 3;

		// 4. 출력
		System.out.printf("국어 : %d, 영어 : %d, 수학 : %d, 총점 : %d, 평균 : %.1f", kor, eng, math, sum, evg);
	
	}

}

/*
# next() 와 nextLine() 차이점

	next()는 \n \t 같은 문자를 만나면 그 전까지 읽는다
	nextLine()은 \n 개행문자까지 읽어서 한 줄임을 인식한다.
	
	[ 예 ] 오늘도 우리는 행복이 의무다
	
	next()는 4개의 토큰으로 인식하지만
	nextLine()은 한 줄로 인식한다.
*/