package c_control;

import java.util.Scanner;

public class Ex04_for_중첩_연습2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("사각형의 높이 n과 너비 m을 입력하세요");
		int n = input.nextInt();
		int m = input.nextInt();
		System.out.printf("높이(n)는 %d, 너비(m)은 %d", n, m);
 
		System.out.println();	
//  [1] 3조
//		for (int i = 1; i <= n * m; i++) {
//			System.out.printf(i + "  ");
//			if (i % m == 0) { //m의 배수일 경우 개행을 넣어라
//				System.out.println();
//			}
//  [2] 선생님
		int d = 1;
		
		for(int i = 0 ; i  < n ; i++) {
			for(int j=0 ; j < m ; j++) {a	d
				System.out.print(d);
				d++; }
			 System.out.println();

		}
	}
}

//	for(int i = 0 ; i<5 ; i++) { // 변수 5개가 들어가게 하는 조건
//		for(int c = 0 ; c < i ; c++) { // 변수가 들어가서 뜨어쓰기가 늘어나는 조건
//			System.out.print(" ");
//		}
//		for(int j = 0 ; j<5-i; j++) {  // 변수가 들어가서 나오는 숫자 조건
//		System.out.print("*");
//		}
//		System.out.println();
//	} 