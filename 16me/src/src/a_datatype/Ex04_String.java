package a_datatype;

/* [주의] 클래스명을 절대로 String 이라고 하면 안된다 */
/* 
 * String은 기본 데이타 타입이 아닌 참조형 데이타 타입이다.
 * 참조형은 new를 이용하여 객체를 생성해야 한다.
 */
public class Ex04_String {

	public static void main(String[] args) {

//		String a = "홍길동";
//		String b = "홍길동";

		
		String a = new String("홍길동");
		String b = new String("홍길동");

		if (a == b) {
			System.out.println("동일");
		} else {
			System.out.println("다름"); // a와 b 기본형에 저장된 위치(a, b 위치)가 같니?
		}
		if (a.equals(b)) {
			System.out.println("동일2");
		} else {
			System.out.println("다름2"); // a와 b 참조형에 있는 문자열(홍길동)이 같니?
		}
	}

}
