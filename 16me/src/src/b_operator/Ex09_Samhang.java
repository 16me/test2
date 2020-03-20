package b_operator;

import java.util.Scanner;

public class Ex09_Samhang {

	public static void main(String[] args) {
		
		// a, b를 입력받아 두 수 중 큰 수를 출력
		Scanner input = new Scanner(System.in);
		System.out.print("첫번째 수를 입력->");
		int a = input.nextInt(); // 입력한 수를 a에 저장
		System.out.print("두번째 수를 입력->");
		int b = input.nextInt(); // 입력한 수를 b에 저장
		
		// 만일 a가 b보다 크다면 "a가 큰수"
		// 만일 b가 a보다 크다면 "b가 큰수:
//		if( a>b)  {
//			System.out.println("a가 큰수");
//		} else {
//			System.out.println("b가 큰수");
//		}
//		
//		
		
		int max = (a > b) ? a:b;
		System.out.println(max + "가 큰 수");
		
	}

}
