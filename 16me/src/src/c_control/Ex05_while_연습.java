package c_control;

import java.util.*;

public class Ex05_while_연습 {
	public static void main(String[] args) {
//		Scanner input = new Scanner(System.in);
//		System.out.println("정수를 입력하세요");
//		String line = input.nextLine();
//		StringTokenizer st = new StringTokenizer(line); //문장에 있는 덩어리를 토큰으로 나눔
//
//		int i = 0; // 갯수 세는 짝수, 홀수는 while 바깥쪽에 선언, 초기값 선언
//		int j = 0;
//		while (st.hasMoreTokens()) {  //문장에 토큰이 있는지 없는지 확인하는 논리문
//			String temp = st.nextToken(); // 다음 토큰을 가지고 와서 temp로 저장, String은 문장이였기 때문에 선언
//			int n = Integer.parseInt(temp); // string 형으로 temp에 -> int 로 변환
//			if( n%2==0) {
//				i++;
//			}else {
//				j++;
//			}  
//		}   System.out.printf("짝수는 %d\n" , i ); // while문이 끝나고 갯수를 나타내라해야함
//			System.out.printf("홀수는 %d\n" , j );

		// 3 6 9 게임
		// 반복되는 갯수가 고정되면 if문 갯수가 변동될 경우 while문

//		for (int i = 1; i <= 50; i++) {  //1 2 3
//			int su = i;
//			boolean su369 = false; // su369는 false값으로 선언
//
//			while (su != 0) {
//				int na = su % 10;
//				if (na == 3 || na == 6 || na == 9) { // i가 3 또는 6 또는 9 라면
//					System.out.print("짝"); // 그 수에서는 짝으로 출력
//					su369 = true; // su369는 true값으로 입력
//				}
//					su = su / 10;
//			}
//			if (su369) { // su369라면 짝이 나오고, 아니면 숫자로 나와라
//				System.out.println();
//			} else {
//				System.out.println(i);
//			}
//			

		int n8 = 0; 
		for (int i = 1; i <= 10000; i++) {
			int j = i;

			while (j != 0) {
				int na = j % 10;
				if (na == 8) {
					n8++;
				}
				j /= 10;
			}

		}
		System.out.println(n8);

	}
}
