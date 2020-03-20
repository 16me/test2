package a_datatype;

public class Ex02_Caution {

	public static void main(String[] args) {

		// (1) 문자형에 정수를 대입하면?
		char ch = 97;
		System.out.println("ch 값 : " + ch);
		
		// (2) 정수형에 문자를 대입하면?
		int su = 'i';
		System.out.println("su 값 : " + su);
		// 아스키코드 값에 의해서 B가 66이 나옴, A가 65엿으므로.

		// (3) 실수형 float에 실수를 대입하면?
		float f = 3.6F;
		System.out.println("f 값 : " + f);
		
		// (4) 실수형에 정수를 대입하면?
		double d = 100;
		System.out.println("d 값 : " + d);
		
		// (5) 정수형에 실수를 대입하면?
		int i = (int) 3.6;
		System.out.println("i 값 : " + i);
		// (int)실수 넣은 것은 casting(형변환)이라고 하며 정수까지만, 표출
		
		// (6) 정수형에 100억 숫자를 대입하면?
		long m = 10000000000L;
		System.out.println("m 값 : " + m);
	}

}
