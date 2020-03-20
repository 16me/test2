package c_control;

public class Ex07_break_continue {
	public static void main(String[] args) {
		
//		HERE: // 라벨은 눈에뜨라고 대문자  j가 1이 되는순간 블록 완전 벗어나서 here로 감(:)
//		for (int i = 0; i < 2; i++) {
//			for (int j = 0; j < 3; j++) {
//				 if(j ==1) break HERE; // 블록 벗어나는 문자 (반복 벗어나기)
//				//if( j==1 ) continue; // 블록 끝으로 가기 (반복 수행)
//				System.out.printf("<%d, %d> \n", i, j); // 좌표를 보는 출력문
//			} 
//			System.out.println("데이타");
//
//		}
		  int n = 1;
		  int sum = 0;
		  while( true ){
		     sum += n;
		     if ( n++ == 10) break;
		  }
		  System.out.println("SUM = " + sum );
	}
}

//
//<0, 0> 
//<0, 1> 
//<0, 2> 
//데이타
//<1, 0> 
//<1, 1> 
//<1, 2> 
//데이타
