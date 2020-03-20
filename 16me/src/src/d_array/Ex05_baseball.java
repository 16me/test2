package d_array;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex05_baseball {

	public static void main(String[] args) {
		// 변수명은 로또, 변수확보
		// 1. 이의의 수 3개를 base에 저장
		// - 중복수 배제
		int[] base = new int[3]; // 베이스볼 배열 3개를 base 에 저장
		int[] answer = new int[3]; // 사용자 입력한 숫자 3개를 answer에 저장
		int strike = 0;
		int ball = 0;
		 
		for (int i = 0; i < 3; i++) {
			base[i] = (int) (Math.random() * 10);
			for (int k = 0; k < i; k++) {
				while (base[i] == base[k]) {
					base[i] = (int) (Math.random() * 10);
					k=0;
				}
			}
			System.out.print(base[i]);
		}

		// 2. 사용자 입력값 받기
		STOP: for (int n = 0; n < 5; n++) {
			Scanner input = new Scanner(System.in);
			System.out.println("숫자를 입력하세요 (예)3/0/7");
			String line = input.nextLine();
			StringTokenizer st = new StringTokenizer(line, "/"); // 토큰이 몇개인지 모를때는 while문을 사용

			for (int a = 0; st.hasMoreTokens(); a++) { // 문장()에 토큰이 있는 동안만 와일문 반복하겟음
				String temp = st.nextToken(); // 다음 토큰을 가지고 와서 temp에 저장
				int m = Integer.parseInt(temp); // temp에 저장된 string -> int 변환
				answer[a] = m;
			}
			// 3. 값비교
			strike = 0;
			ball = 0;
			for (int b = 0; b < 3; b++) {
				for (int j = 0; j < 3; j++) {
					if (base[b] == answer[j]) { // 위치 좌표가 같은지 체크
						if (b == j) { // 수가 같은지 체크
							strike++;
						} else {
							ball++;
						}
					}
				}
			}
			System.out.println("스트라이크는 " + strike + " 볼은" + ball);
			if (strike == 3)
				break STOP;

		}
		System.out.println("게임을 종료합니다.");
	}
}
