 package b_operator;

public class Ex08_ShortCircuitLogic {

	public static void main(String[] args) {
		// ShortCircuitLogic : 일반논리에만 발생 
		// 하나의 조건으로 전체 조건이 판명되면 나머지 조건을 실행하지 않습니다.
		// 일반논리 &&, ||에서는 쇼서킷로직이 적용되고, 이진논리 & , | 는 쇼서킷로직이 적용안됨
		
		 int a = 3;
		 
		 // if( 3 & 4) -> 이진논리
		 //
		
		 if( a > 3 & ++a > 3 ) {  // ++a 연산자를 넣으면 true이지만, a=3 으로 출력, 
			 	System.out.println("조건만족");
				 }
		 		System.out.println("A=" + a );
		 		
		 		
		 		if(a > 1 | ++a > 3) {
		 			System.out.println("조건만족2"); // 출력
		 		}
		 		System.out.println("A=" + a); // 4  if 안의 구문의 a>1 앞에꺼만 실행 
	}

}
