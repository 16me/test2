package b_operator;

/**
 * 증가(++)/감소(--) 연산자
 */
public class Ex01_IncDec {

	public static void main(String[] args) {

		int a = 5;
		int b = 7;

		// [4]
		System.out.println("a = " + ++a + ", b = " + --b); // 6, 6
		System.out.println("a = " + a++ + ", b = " + b--); // 6, 6
		System.out.println("a = " + a + ", b = " + b); // 7, 5

		/*
		 * // [1] System.out.println("a = " + a + ", b = " + b);
		 * System.out.println("a = " + a+1 + ", b = " + b+1); // +1은 문자 1을 합쳐서 보여주는 것
		 * System.out.println("a = " + (a+1) + ", b = " + (b+1) ); // ( ) 괄호를 넣으면 계산을
		 * 먼저하고 그 결과값을 보여즘
		 * 
		 * // [2] a++; //a = a +1 ; 후자(주석에 넣은 내용을 축약한 것) b--; //b = b -1 ;
		 * 
		 * ++a; //a = a +1 ; 전자(주석에 넣은 내용을 축약한 것) --b; //b = b -1 ;
		 * System.out.println("a = " + a + ", b = "+ b); // a를 계산한 값을 다시 a로, b를 계산한 값을
		 * 다시 b로
		 */

//		// [3] 증가감소 연산자는 전자 후자 위치가 매우 중요 
//		int result = ++a;
//		System.out.println("결과: " + result); // 전자에 연산자가 있는경우, 먼저 계산한 a값을 넣어서 a&result 모두 6
//		
//		int result2 = b--;
//		System.out.println("결과: " + result2); // 후자에 연산자가 있는 경우, 값을 넣고 계산하기 때문에 result2 는 7, b는 6
//		System.out.println("결과: " + b); b는 넣고 계산해서 6
//		
	}

}
