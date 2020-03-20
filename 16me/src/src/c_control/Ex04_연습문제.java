package c_control;

import java.util.*;

public class Ex04_연습문제 {

	public static void main(String[] args) {
		// 세 정수 A, B, C가 주어진다. 이 때, 두번째로 큰 정수를 출력하는 프로그램을 작성하시오. (1 <= a,b,c<=100)
		Scanner input = new Scanner(System.in);
		System.out.println("1과 100 사이의 정수 세 개를 입력하시오.");
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();

		if((a>=b)&&(a>=c)) {
			System.out.println(b>=c?b:c);
		} else if((b>=a)&&(b>=c)) {
			System.out.println(c>=a?c:a);
		} else if((c>=a)&&(c>=b)) {
			System.out.println(b>=a?b:a);
		}
	}	

}
