package b_operator;

import java.util.Scanner;

/**
 * 두 정수를 입력받아 사칙연산과 나머지 연산을 수행한 결과를 출력한다
 */

public class Ex03_Arithmetic {

	public static void main(String[] args) {

		// (1) 정수형 변수 su 선언
		int su = 0; // 정수인지 확인하기 위해 =0을 입력해야 함

		// (2) Scanner 선언
		Scanner input = new Scanner(System.in);

		// (3) 화면에 "정수를 입력하세요" 출력
		System.out.println("정수를 입력하세요");

		// (4) 입력받은 정수를 su 변수에 저장
		su = input.nextInt();

		// (5) 나머지 연산자 활용 - 홀/짝수 구하기, 변수%2 == 0 2로 나눠서 0과 같다면
		if (su % 2 == 0) {
			System.out.println("짝수에용");
		} else {
			System.out.println("홀수에용");
		}

		// (6) 입력받은 수가 3의 배수인지 아닌지 확인

		if (su % 3 == 0) {
			System.out.println("배수에용");
		} else {
			System.out.println("아니에용");
		}

//		int a; 
//		int b;	
//		
//		Scanner input = new Scanner(System.in);
//		
//		System.out.println("a 입력 ->");
//		a = input.nextInt();
//		System.out.println("b 입력 ->");
//		b = input.nextInt();
//		
//		int 더하기 = a + b;
//		System.out.println("더하기 값은" + 더하기 );
//		int 빼기 = a - b;
//		System.out.println("빼기 값은" + 빼기 );
//		int 곱하기 = a * b;
//		System.out.println("곱하기 값은" + 곱하기 );
//		double 나누기 = (double) a / b; // 형변환으로 인해 소수점이 값이 0.0 나온것을 (double) 입력하니 소수점이 제대로 나옴
//		System.out.println("나누기 값은" + 나누기 );

	}

}
