package c_control;

import java.util.*;

public class Ex04_for_연습3 {

	public static void main(String[] args) {
//		문제3 ) 입력받은 문자열의 뒤집어서 출력하세요
//	  
//	   [예]  입력     출력
//	   
//	     안녕 친구   구친 녕안
//	     CarpeDiem   meiDepraC 
//	     
//	   [힌트] 문자열의 길이 구할 때 length() 이용
		Scanner st = new Scanner(System.in);
		System.out.println("문자열을 입력하세요");
		String 문장 = st.nextLine(); 
		
		System.out.println(문장);
		
		int 길이 = 문장.length();  //문장의 글자 갯수를 길이에 저장
		System.out.println(길이); // 길이를 출력
		
		for (int i = 길이-1 ; 문장.length()>=0 ; i--) {  // 길이는 글자수를 세기때문에 1,2,3,4,5~
			System.out.print(문장.charAt(i)); // chaㄹAt(n) n이 인덱스를 세기때문에 0,1,2,3,4~
		}
						
	}

}
