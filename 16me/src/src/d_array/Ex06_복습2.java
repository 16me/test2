package d_array;

public class Ex06_복습2 {

	public static void main(String[] args) {
		// 1. 3행 4열 배열 char 선언
		char[][] ch = new char[3][4];

		// 2. 값입력
		char al = 'A' ;
		for (int i = 0;  i < ch.length; i++) { // ch.length =3
			for (int j = 0; j < ch[i].length; j++, al++) { // ch[i].length=4
				ch[i][j] = al;
			}
		}
		// 3. 출력
		for (int a = 0; a < ch.length; a++) {
			for (int b = 0; b < ch[a].length; b++) {
				System.out.print(ch[a][b] + "/");
			}
			System.out.println();
		}
	}
}