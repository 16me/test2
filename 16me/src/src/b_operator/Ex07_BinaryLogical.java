package b_operator;

public class Ex07_BinaryLogical {

/*
 * 	 이진논리 : & (and)  | (or)   ^(xor)_ 두 값이 동일하면 아무 일이 일어나지 않고, 동일하지 않으면 일이 일어남(하드웨어 컨트롤할 때 많이 쓰이는 조건)
 */
		
	public static void main(String[] args) {
	
		int a = 15;
		int b = 10;
		// 15=1111
		// 10=1010
		System.out.println(a & b); // 10(1010)
		System.out.println(a | b); //  15(1111)
		System.out.println(a ^ b); //  5(0101)

	}

}
