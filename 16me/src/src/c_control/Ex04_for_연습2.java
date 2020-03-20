package c_control;

import java.util.Scanner;

public class Ex04_for_연습2 {
	public static void main(String[] args) {
		
//   문제2)  문자열처리하기 
//	문자 N(a~z, A~Z)를 입력받아 N이 소문자면 a부터 N까지 인쇄하고 
//	N이 대문자이면 문자 N부터  Z까지 출력하라 
//	그 밖의 문자가 입력되면 Error 를 출력하라 
//	입력  출력
//	f       abcdef
//	X       XYZ
//	6       Error 
		

		Scanner input = new Scanner(System.in);
		System.out.println("문자 N을 입력하세요");
		char N = input.next().charAt(0); // 문자열(string) 중에 1개를 가져오세요. 차트화
		
		if(N>='A' && N<='Z') { // 입력한 문자가 대문자라면
		for ( char ch= N ; N<='Z' ; N++ ) {
			System.out.print(N + " ");
		}
		} else if(N>='a' && N<='z') { // 입력한 문자가 소문자라면
		for ( char ch= N ; N<='z' ; N++ ) {
			System.out.print(N + " ");
		} 
		}else{ 										// 그 외라면
			System.out.println("Error"); 
					}
			
		}
		}
    


