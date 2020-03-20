package c_control;

import java.util.Scanner;

public class Ex04_for_중첩_연습 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("자연수 n을 입력하세요");
		int n = input.nextInt();

		/*
		 * [1] 입력 : 3 출력 : 1 12 123
		 */

//		for (int i = 1; i <= n; i++) { // 입력한 자연수 n만큼 반복해라
//			for (int c = n; c - i > 0; c--) { // 띄어쓰기는 n-i해줘라
//				System.out.print("  ");
//			}
//			for (int c = 1; c <= i; c++) { // 값이 1부터 하나씩 증가하여 n까지 반복되게 하라
//				System.out.print(c);
//			}
//			System.out.println();
//
//		}

		/*
		 * [2] 입력 : 3 출력 : 123
		 *                               45
		 *                                 6
		 */
		int d = 1; // 출력 저장용
		for (int i = 0; i < n; i++) {  // i는 입력값보다 작을때까지 증가반복
			
			for (int j = 0 ; j <i ; j++) {  // j는 i값보다 작을때까지 띄어쓰기 증가 반복
				System.out.print(" "); // 공백을 j만큼 줘라
			}

			for (int j = 1+ i ; j <= n; j++) { // j는 n-i 보다 작을때까지 증가 반복
				System.out.print(d);
				d++;

			}

			System.out.println();
		}	
	}
}
