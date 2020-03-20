package c_control;

import java.util.*;

public class Ex06_do_while_개념 {

	public static void main(String[] args) {
//		while (true) { // true넣으면 무조건 돌려라
//			Scanner input = new Scanner(System.in);
//			System.out.println("숫자 n을 입력하세요");
//			int n = input.nextInt();
//			for (int i = 1; i <= 9; i++) {
//				System.out.printf("%d * %d = %d \n", n, i, n * i);
//			}
//			System.out.println("구구단 다시 할까요?");
//			String result = input.next();
//			if (result.equals("N")|result.equals("n")) //N과 동일하면 while 그만
//				break;
	String result ="";			
		do{ // true넣으면 무조건 돌려라
			Scanner input = new Scanner(System.in);
			System.out.println("숫자 n을 입력하세요");
			int n = input.nextInt();
			for (int i = 1; i <= 9; i++) {
				System.out.printf("%d * %d = %d \n", n, i, n * i);
			}
			System.out.println("구구단 다시 할까요?");
			result = input.next();
			// if (result.equals("N")|result.equals("n")) break;
		} while(result.equals("Y")|result.equals("y")); //
	}
}
