package b_operator;

/**
 * not : 결과를 반대로 하는 연산자 - 일반논리 not : ! true - > false, false -> true - 이진논리 not
 * : ~ 각 비트의 값이 0->1, 1-> 0
 */
public class Ex02_Not {

	public static void main(String[] args) {

		boolean result = 3 > 4;
		System.out.println(result); // false
		System.out.println(!result); // true 반대로 나올수 있게 앞쪽에 ! 를 붙임

		int a = 15;
		System.out.println(~a);
		// a 15 : 00000000 000000000 000000000 00001111
		// ~a : 11111111 111111111 111111111 11110000

	}

}
