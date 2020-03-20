package c_control;

public class Ex05_복습문제 {

	public static void main(String[] args) {
		int i =2, j=0; // break; 가 없으면 해당하는 케이스부터 계산이 시작
		  switch ( i ) { // 조건문안에 정수형, 스트링형, 문자형, 논리형만 가능
		   case 2 : j += 6;
		   case 4 : j += 1;
		   default : j += 2;  
		   case 0 : j += 4; 
		  }
		  System.out.println( j );

	}

}
