package d_array;

import java.util.*;

public class Ex01_성적입력 {

	public static void main(String[] args) {
		/*
		 * 학생 점수를 입력 받아 평균 및 총점을 출력해라 입력 형식 : 80/88/77 출력 형식 : 총점 : 평균 :
		 */
		int[] score = new int[3]; //score 에 배열 3칸을 넣어주기
		// 1. 입력받아 score 변수에 저장
		Scanner input = new Scanner(System.in); // 스캐너 input은 시스템에 입력한 값으로 저장
		System.out.println("점수를 입력하세요 (예)90/80/75"); // 입력하는 화면에 나타날 문장 출력
		String line = input.nextLine(); // input에 입력한 스캐너를 line에 저장

		int sum = 0;
		double avg = 0;

		StringTokenizer st = new StringTokenizer(line, " / "); //토큰이 몇개인지 모를때는 while문을 사용
		for ( int i =0 ; st.hasMoreTokens() ; i++ ) { // 문장()에 토큰이 있는 동안만 와일문 반복하겟음
			//변수.hasMoreTokens 는 토큰이 잇는지 확인하는 조건문
			String temp = st.nextToken(); // 다음 토큰을 가지고 와서 temp에 저장
			int n = Integer.parseInt(temp); // temp에 저장된 string -> int 변환 
			System.out.println(temp);
			score[i] = n; // i에 증가됨에 따라 n 값을 저장 
			sum += n; 
		}
		avg = sum / 3;
		System.out.println("총점 : "+ sum);

		System.out.printf("평균 : "+ avg);

	}

}
