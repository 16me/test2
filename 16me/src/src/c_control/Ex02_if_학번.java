package c_control;

import java.util.*;

public class Ex02_if_학번 {

	public static void main(String[] args) {
		String id = new String();
		Scanner input = new Scanner(System.in);

		System.out.println("본인의 학번 10자리를 입력하세요");
		id = input.next();

		// 문자중에 몇개 추출하기
		String 입학년도 = id.substring(0, 4); // 앞에서 4자리 추출
		String 단대번호 = id.substring(4, 5); // 5번째 자리 추출
		String 학과번호 = id.substring(5, 7); // 6, 7번째 자리 추출

		String 단대명 = "";
		String 학과명 = "";
		
		
		if (단대번호.equals("1")) {
			단대명 = "공대";
		switch(학과번호) {		
		case "11" : 학과명 = "컴퓨터학과";
		break;
		case "12" : 학과명 = "소프트웨어학과";
		break;
		} 
		} else if (단대번호.equals("2")) {
			단대명 = "사회대";
			switch(학과번호) {
			case "11" : 학과명 = "사회학과";
			break;
			case "12" : 학과명  = "경제학과";
			break;
			}
	
			} 
		System.out.println(id + "는 " + 입학년도 + "년도에 입학한 " + 단대명 + 학과명 + " 학생입니다.");

		}
}

// [1] 추출한 문자를 정수로 변환 후 if문
//int 입학년도1 = Integer.parseInt(입학년도); 
//int 단대번호1 = Integer.parseInt(단대번호);
//int 학과번호1 = Integer.parseInt(학과번호);
//
//String 단대번호2 = "";
//
//if (단대번호1 == 1) {
//	단대번호2 = "공대";
//} else if (단대번호1 == 2) {
//	단대번호2 = "사회대";
//}
//
//String 학과번호2 = "";
//
//if (단대번호1 == 1 && 학과번호1 == 11) {
//	학과번호2 = "컴퓨터학과";
//} else if (단대번호1 == 1 && 학과번호1 == 12) {
//	학과번호2 = "소프트웨어학과";
//} else if (단대번호1 == 1 && 학과번호1 == 13) {
//	학과번호2 = "모바일학과";
//} else if (단대번호1 == 1 && 학과번호1 == 22) {
//	학과번호2 = "자바학과";
//} else if (단대번호1 == 1 && 학과번호1 == 33) {
//	학과번호2 = "서버학과";
//} else if (단대번호1 == 2 && 학과번호1 == 11) {
//	학과번호2 = "사회학과";
//} else if (단대번호1 == 2 && 학과번호1 == 12) {
//	학과번호2 = "경영학과";
//} else if (단대번호1 == 2 && 학과번호1 == 13) {
//	학과번호2 = "경제학과";
//}
//System.out.println(id + "는 " + 입학년도1 + "년도에 입학한 " + 단대번호2 + 학과번호2 + " 학생입니다.");

// [2] 추출한 문자(String)를 그대로 적용 후, if문

//String 단대번호1 = "";
//String 학과번호1 = "";
//
//if (단대번호 == "1") {
//	단대번호1 = "공대";
//	if (학과번호.equals("11")) {
//		학과번호1 = "컴퓨터학과";
//	} else if (학과번호.equals("12")) {
//		학과번호1 = "소프트웨어학과";
//	} else if (학과번호.equals("13")) {
//		학과번호1 = "모바일학과";
//	} else if (학과번호.equals("22")) {
//		학과번호1 = "자바학과";
//	} else if (학과번호.equals("33")) {
//		학과번호1 = "서버학과";
//	} else if (단대번호 == "2") {
//		단대번호1 = "사회대";
//	if (학과번호.equals("11")) {
//			학과번호1 = "사회학과";
//		} else if (학과번호.equals("12")) {
//			학과번호1 = "경영학과";
//		} else if (학과번호.equals("13")) {
//			학과번호1 = "경제학과";
//		}
