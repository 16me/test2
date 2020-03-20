package c_control;

public class Ex04_for_개념 {

	public static void main(String[] args) {
		/*
		  for ( 초깃값 ; 조건식; 증가값 ) { 
		        반복문장;
		    }
		 */
		// 0. 인사말 3번 출력하기
				for ( int i=0 ; i<5 ; i++ ) {
					System.out.println("Hello :)");
				}  
		// 1. 1~10까지 합을 구하기
				int sum=0;
				for ( int i=1 ; i<=100 ; i++ ) {
					sum+=i; // sum= sum+i
		    }
				System.out.println("합은 " + sum);
	
		// 2. 1~100까지 홀수의 합과 짝수의 합을 구하기		
				int even=0, odd=0;
				for ( int i=1 ; i<=100 ; i++ ) {
					if(i%2==1) {
						odd += i; // 숫자 i가 홀수라면 odd 에 합구하기
					} else if(i%2==0) {
						even += i; 	//그렇지 않다면 even 합구하기
					}
		    } 
				System.out.printf("홀수 합은 %d, 짝수 합은 %d\n", odd, even );
				
		// 3. A~Z까지 출력
				for ( char ch='A' ; ch<= 'Z' ; ch++ ) {
					System.out.printf("%c", ch); // ln 삭제하면 한줄에 다 출력
				}  
				System.out.println(); // 한줄 띄어쓰기
				
		// 4. A~Z까지 출력(2개씩 건너뛰기)
				for ( char ch='A' ; ch<= 'Z' ; ch+=2 ) {
					System.out.printf("%c", ch); // ln 삭제하면 한줄에 다 출력
				}
				System.out.println(); // 한줄 띄어쓰기
				
		// 5. Z~A까지 출력
				for ( char ch='Z' ; ch>= 'A' ; ch-- ) {
					System.out.printf("%c", ch); // ln 삭제하면 한줄에 다 출력
				}  						
				
	}

}
