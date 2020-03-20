package c_control;

import java.util.*;

public class Ex05_while_개념 {

	public static void main(String[] args) {
		// 1부터 10까지 합을 출력

//		int sum = 0; // for 문 안 선언하면 반복하면서 끝나기 때문에 for문 밖에 선언
//		int i = 1;
//		// for ( ; i <= 10; ) {
//		while ( i <=10 )  { // for문에서 초기치 위로 빼고, 증가치 아래로 빼고 조건문만 넣은 것
//			sum += i; // sum= sum+i
//			i++;
//		}
//		System.out.println("합은 " + sum);

		// 숫자 하나 입력받기 -> 구구단 출력
//		Scanner input = new Scanner(System.in);
//		System.out.println("숫자 n을 입력하세요");
//		int n = input.nextInt();
//		int i = 1;
//		while ( i <= 9) {
//			System.out.printf( "%d * %d = %d \n", n , i, n *i );
//			i++;
//		} // while은 몇 번 돌려야하는지

		// 문장을 입력받아 단어로 나눠서 출력
		// "코로나 아웃"
		// 스트링토큰 나누는 것
		Scanner input = new Scanner(System.in);
		System.out.println("점수를 입력하세요 (예)90/80/75");
		String line = input.nextLine();
		StringTokenizer st = new StringTokenizer(line, " / "); //
		while (st.hasMoreTokens()) {
			String temp = st.nextToken();
			int n = Integer.parseInt(temp); // string -> int
			System.out.println(temp);
		}

	}

}
