package d_useful_class;

public class StringStringbuffer {

	public static void main(String[] args) {

		// 0. 기본형
		int a = 10;
		a += 5;
		System.out.println(a);

		// 1. String. : 참조형
		String b = new String("안녕");
//			String b = "안녕";
		b += "하세요";
		System.out.println(b);

		// 2. StringBuffer
		StringBuffer c = new StringBuffer("happy");
//			StringBuffer d = "happy" ; // 기본형처럼 ="" , += 연산은 안됩니다.
		c.append(" thursday : )"); // c. append ("") -> c+= "" 이것을 뜻함
		System.out.println(c);
	}

}
