package c_control;

import java.util.Scanner;

public class Ex05_주사위합 {

	/*
	 * 철수는 주사위 두개를 가지고 있다. 이 주사위 두 개를 던질때 눈의 합이 어떤 수가 되는가가 궁금하다. 그런데 일일이 따지기 어려워
	 * 컴퓨터를 잘하는 당신에게 도움을요청하였다. 예를 들어, 합이 9 가되는 경우는 3 6 4 5 5 4 6 3 와 같은 경우이다. 입력형식
	 * 입력은 12 이하인 자연수가 주어진다. 출력형식 두 개의 수가 출력된다. 각각 첫번째, 두번째 주사위의눈이다. 출력은 첫 수가 작은 수부터
	 * 먼저 출력한다
	 * 
	 * 입력예 9 
	 * 출력예 
	 * 3 6 
	 * 4 5 
	 * 5 4
	 * 6 3
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("주사위 두개를 던져 나온 수를 입력하세요");
		int n = input.nextInt();

		if (n <= 12) {
			System.out.printf("합이 %d 가 되는 수는", n);
			System.out.println();
			for (int i = 1; i <= 6; i++) {
				for (int j = 1; j <= 6; j++) {
					if (i + j == n) {
						System.out.printf("%d,  %d \n", i, j); // \n을 넣어 개행을 만들어요.
					}
				}
			}
		} else {
			System.out.println("12 이하의 자연수가 아닙니다.");
		}
	}
}
