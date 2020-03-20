package c_control;

import java.util.*;

public class Ex05_for_복습문제 {

//	public static void main(String[] args) {
//		// 1부터 3까지 출력
//		
////		for(int i =1  ; i <= 3 ; i++  ) {
////			System.out.print(i);
////		}
//			
//		// 3행 2열 가상하고 번호 붙이기
//		
//		for(int i =0 ; i  < 3 ; i++ ) {
//			for( int j= 0 ;  j < 2 ;  j++ ) {
//				System.out.printf("<%d, %d>" , i ,  j); // 좌표를 보는 출력문
//			} 	System.out.println();
//		
//				} 
//	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("정수 n을 입력하세요");
		int n = input.nextInt();
		System.out.printf("한변의 길이(n)는 %d", n);
		System.out.println();

		int d = 0;
		for (int i = 1; i <= n; i++) {
			d = i - n;
			for (int j = 1; j <= n; j++) {
				d += n;//d=d+n
				System.out.print(d + " ");

			}
			System.out.println();
		}
	}
	
		Scanner input = new Scanner(System.in);
		System.out.println("높이 n 과 너비 m을 입력하세요");
		int n = input.nextInt();
		int m = input.nextInt();
	
		System.out.printf("높이(n)는 %d, 너비(m)d은 %d", n, m);
		System.out.println();

		int d = 1;
		int s = 1;
		for (int i = 1; i <= n; i++) {
			d = (i-1) *m;
			s = i *m+1;
			if(i%2!=0) {
			for (int j = 1; j <= m; j++) {
				d++;
				System.out.print(d + " ");
			}
			System.out.println();
			} else {
				for (int j = 1; j <= m; j++) {
					s--;
					System.out.print(s + " ");
				}
				System.out.println();	
				
			}
		
	}
}
