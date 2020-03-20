package c_control;

import java.util.*;

public class Ex01_switch_주민번호 {

	public static void main(String[] args) {
		String id = new String();
		Scanner input = new Scanner(System.in); // switch(변수

		System.out.println("(-) 포함하여 주민번호를 입력하세요");
		id = input.next();
		
		char live = id.charAt(8); 
		String home = "";
		
		switch(live) {
		case '0' : home = "su";
		break;
		case '1' : home = "in;";
		break;
		case '2' : home = "gg";
		break;
		case '3' : home = "cn";
		break;
		default : home= "etc";
		break;		
		}
		System.out.println("출신지는 " + home);
	}

}
