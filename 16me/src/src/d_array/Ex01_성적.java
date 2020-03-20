package d_array;

public class Ex01_성적 {
	public static void main(String[] args) {
//		int [] kor;
//		kor = new int [5];
//		int [] kor = new int [5];
//		kor [0] = 90;
//		kor [1] = 88;
//		kor [2] = 89;
//		kor [3] = 70;
//		kor [4] = 77;
//		kor [5] = 99;

		// 배열 초기화
		//int [] kor = new int [] {90, 88, 89, 70,77}; // 메모리를 넣자마자 원래 문법
		int [] kor = {90, 88, 89, 70,77}; // new int 를 마니 생략함
		
		int sum = 0;  
		for (int i=0 ; i< kor.length ; i++) { // kor 배열이 갯수 생각안하고 알아서 돌릴때
			System.out.println(kor[i]);
			// 총점구하기
			sum += kor[i];  
		} System.out.printf("총점은 %d", sum);
	}

	}

