package a_datatype;

public class Ex03_Declaration_200312 {

	public static void main(String[] args) {

//		// 국어 점수 90점 를 저장할 변수 선언 - 값 대입
//		int kor = 90;
//		
//		// 초기화 : 변수 선언시 값 대입
//		int eng = 88;

		// kor와 eng 두개 이상의 변수를 한 번에 선언
		int kor = 90, eng = 88;
		System.out.print("국어 : " + kor + ", 영어 : " + eng + "\n");
		System.out.printf("국어 : %d, 영어 : %d  \n", kor, eng);
		// ---------------------------------------------------
		// 점수바꾸기 - swap

		int temp;
		temp = kor; // 1
		kor = eng; // 2
		eng = temp; // 3

		System.out.printf("국어 : " + kor + ", 영어 : " + eng + "\n");

		if (kor == eng) {
			// == 같다, = 값을 대입할때
			System.out.printf("국어점수 %d와 영어점수 %d는 동일한 점수",kor, eng);
		} else {
			System.out.printf("국어점수 %d와 영어점수 %d는 다른 점수",kor, eng);
		}

	}

}
