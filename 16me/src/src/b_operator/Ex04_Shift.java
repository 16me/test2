package b_operator;

/**
 * shift : 모든 비트의 값을 이동하는 연산자
 * 
 * [예] 0000 0010 <<1 0000 0100 0000 0010 >>1 0000 0001
 */
public class Ex04_Shift {

	public static void main(String[] args) {

		int su = -4;
		System.out.println(su); // -4 , 맨 앞글자인 0 부호(양수 음수 나타내는 수 뒤부터 시프트)
		System.out.println(su << 2); // -16
		System.out.println(su >> 2); // - 1

		System.out.println(su >>> 1); // 부호비트에 0으로 채우고 모두 양수로 됨 ''연산자 >>> 1'
	}

}
