package d_array;

import java.util.*;

public class Ex07_성적2 {

	public static void main(String[] args) {
		// 1. 학생수 입력받기
		Scanner input = new Scanner(System.in); // 스캐너 input은 시스템에 입력한 값으로 저장
		System.out.println("학생수를 입력하세요 (예)90"); // 입력하는 화면에 나타날 문장 출력
		int n = input.nextInt(); // input에 입력한 스캐너를 int n에 저장
		input.nextLine();
		/*
		 * 2. 점수를 저장할 변수(score)를 학생수만큼 선언하기 - 한 학생당 과목 수 3 개씩 공간 만들기
		 */
		int[][] score = new int[n][3];
		int[] sum = new int[score.length];
		int total = 0;
		double avg = 0.0;

		// 3. 입력
		for (int i = 0; i < n; i++) {
			Scanner in = new Scanner(System.in);
			System.out.println((i + 1) + "번째 학생의 성적을 입력하세요.");
			String jumsu = in.nextLine();

			StringTokenizer st = new StringTokenizer(jumsu, "/"); // 토큰이 몇개인지 모를때는 while문을 사용
			int tokensu = st.countTokens();
			for (int j = 0; j < tokensu; j++) // 문장()에 토큰이 있는 동안만 와일문 반복하겟음
			{
				String temp = st.nextToken(); // 다음 토큰을 가지고 와서 temp에 저장
				score[i][j] = Integer.parseInt(temp); // temp에 저장된 string -> int 변환
				
			}

		}
		// 4. 출력
		for (int c = 0; c < sum.length; c++) {
			int j = 0;
			for (; j < score[c].length; j++) {
					
				} total+= score[c][j]; 
				avg = ((double)total / (score.length+1));
					System.out.println((c + 1) + "번째 학생의 총점은 " + total + "평균은" + avg + "입니다.");
				} 
			}
			
		}

	

