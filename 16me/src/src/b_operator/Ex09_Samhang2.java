package b_operator;

import java.util.Scanner;

public class Ex09_Samhang2 {

	public static void main(String[] args) {
		// [1] 학생 점수를 입력받아 80점 이상이면 "합격" 출력, 그렇지 않으면"불합격"출력, 삼항연산자 이용
		Scanner input = new Scanner(System.in);
		
		System.out.println("학생 점수를 입력하시오.");
	    int a = input.nextInt();
		
	    String b = new String();
	    String c = new String();
	    b = "합격";
	    c = "불합격"; 
	    
	    String pass = (a >= 80) ? b : c;
		System.out.println( pass + "입니다.");
		
		//[2]
//		Scanner input = new Scanner(System.in);
//		
//		System.out.println("학생 점수를 입력하시오.");
//		int score = input.nextInt();
//		
//		String result = (score >=80) ? "합격" : "불합격";
//		System.out.println( result + "입니다.");
	}

}
