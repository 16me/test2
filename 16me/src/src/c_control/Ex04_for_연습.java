package c_control;

import java.util.*;

public class Ex04_for_연습 {
	
	// 1부터 N 까지의 숫자를 다음처럼 출력하라
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("숫자 N값을 입력하세요");
		int n = input.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.print(i + " ");
			if (i % 5 == 0) {
				System.out.println();
			}

		}

	}
	
}

//		for (int i = 1; i <= 15; i++) {
//			System.out.print(i + " ");
//			if (i % 5 == 0) {
//				System.out.println();
//			}
//
//		}
//
//	}
//	
//}