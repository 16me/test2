package c_control;

public class Ex04_for_중첩 {

	public static void main(String[] args) {

//		//***** 
//		for(int i = 0 ; i<5 ; i++) {
//		System.out.print("*");
//		}
//		System.out.println();
//		//***** 반복5줄
//		for(int i = 0 ; i<5 ; i++) {
//			for(int j = 0 ; j<5 ; j++) {
//		
//			System.out.print("*");
//			}
//			System.out.println();
//		} 
//		//*****
//		//****
//		//***
//		//**
//		//* 처음 입력한 숫자에서 한개씩 줄어서 반복되게 출력
		
				for(int i = 0 ; i<5 ; i++) { // 변수 5개가 들어가게 하는 조건
					for(int c = 0 ; c < i ; c++) { // 변수가 들어가서 뜨어쓰기가 늘어나는 조건
						System.out.print(" ");
					}
					for(int j = 0 ; j<5-i; j++) {  // 변수가 들어가서 나오는 숫자 조건
					System.out.print("*");
					}
					System.out.println();
				} 

		// 1. A~Z 한줄에 출력 (26줄)
//		A
//		AB
//		ABC
//		ABCD
//		:
//		ABCDEFGHIJKLMNOPQRSTUVW
//		ABCDEFGHIJKLMNOPQRSTUVWX
//		ABCDEFGHIJKLMNOPQRSTUVWXY
//		ABCDEFGHIJKLMNOPQRSTUVWXYZ
		
		
		for (int i = 0; i < 26; i++) { 
			for (char ch = 'A'; ch <= 'A'+i ; ch++) { 
				System.out.printf("%c", ch);
			}
			System.out.println();
		}

		// 2. A~Z 한줄에 출력 (26줄)
//		ABCDEFGHIJKLMNOPQRSTUVWXYZ
//		ABCDEFGHIJKLMNOPQRSTUVWXY
//		ABCDEFGHIJKLMNOPQRSTUVWX
//		ABCDEFGHIJKLMNOPQRSTUVW
//		ABCDEFGHIJKLMNOPQRSTUV
//		:
//		ABC
//		AB
//		A
		
		for (int i = 0; i < 26; i++) { 
			for (char ch = 'A'; ch <= 'Z'-i ; ch++) { 
				System.out.printf("%c", ch);
			}
			System.out.println();
		}
		
		// 3. A~Z 한줄에 출력 (26줄)
//		ABCDEFGHIJKLMNOPQRSTUVWXYZ
//		BCDEFGHIJKLMNOPQRSTUVWXYZ
//		CDEFGHIJKLMNOPQRSTUVWXYZ
//		DEFGHIJKLMNOPQRSTUVWXYZ
//		:
//		XYZ
//		YZ
//		Z
		
		for (int i = 0; i <26; i++) { 
				for (char ch = (char) ('A'+i); ch <='Z' ; ch++) { // A에 캐스트를 하고 점점 값이 하나씩 늘어나게
				System.out.printf("%c", ch);
				} 
			System.out.println();
		}
		
		// 4. A~Z 한줄에 출력 (26줄)
//		   Z
//		   ZY
//		   ZYX
//		   :
//		   ZYXWVUTSRQPONMLKJIHGFEDC
//		   ZYXWVUTSRQPONMLKJIHGFEDCB
//		   ZYXWVUTSRQPONMLKJIHGFEDCBA
		
		for (int i = 0; i <26; i++) { 
			for (char ch = 'Z' ; ch >='Z'-i ; ch--) { // A에 캐스트를 하고 점점 값이 하나씩 늘어나게
			System.out.printf("%c", ch);
			} 
		System.out.println();
	}
		
		// 5. A~Z 한줄에 출력 (26줄)		
//		ABCDEFGHIJKLMNOPQRSTUVWXYZ
//		  BCDEFGHIJKLMNOPQRSTUVWXYZ
//		    CDEFGHIJKLMNOPQRSTUVWXYZ
//		      DEFGHIJKLMNOPQRSTUVWXYZ
//		       :
//		       
//		                                         WXYZ
//		                                            XYZ
//		                                              YZ
//		                                                Z
//		
		for (int i = 0; i <26; i++) {
			for(int c = 0 ; c < i ; c++) { // 변수가 들어가서 뜨어쓰기가 늘어나는 조건
			System.out.print("  ");
		}	
			for (char ch = (char) ('A'+i); ch <='Z' ; ch++) { // A에 캐스트를 하고 점점 값이 하나씩 늘어나게
			System.out.printf("%c", ch);
			} 
		System.out.println();
	}
	
	}

}