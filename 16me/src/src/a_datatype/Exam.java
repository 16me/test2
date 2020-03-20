package a_datatype;

import java.util.Scanner;

public class Exam {public static void main(String[] args) {

	// 스캐너 기능은 출력화면에서 직접 입력하는 기능
	Scanner input = new Scanner(System.in);

	// 나이와 키를 입력받아서 출력
	int 나이;
	double 키;	
	System.out.println("나이 입력 ->");
	나이 = input.nextInt();
	
	System.out.println("키 입력 ->");
	키 = input.nextDouble();

	// 이름 입력받으려면??
	System.out.println("이름 입력 : ->");
//	String 이름 = input.next();
	// 띄어쓰기 된 이름은 인식이 안되고 붙여쓴 글자만 인식
	input.nextLine();
	String 이름 = input.nextLine();
	// nextline은 그 전 항목의 값을 치고 엔터키를 누를 경우 유효성으로 값을 입력한걸로 인식하므로 input.nextline() 입력
	
	System.out.println("나이:" + 나이 + ",키:" + 키 + ",이름" + 이름 );
}

}
