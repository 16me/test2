package d_array;

public class Ex06_복습 {
	// 동적 크기배열
	public static void main(String[] args) {
		// 1. 5행 ?열 배열 star 선언
		char[][] star = new char[5][];

		// 2. 입력
		for (int i = 0; i < star.length; i++) {
			star[i] = new char[i + 1]; // 몇개의 동적으로 열 조정
			for (int j = 0; j < i + 1; j++) {
				star[i][j] = '*';
			}
		}
		// 3. 출력
		for (int a = 0; a < star.length; a++) {
			for (int b = 0; b < star[a].length; b++) {
				System.out.print(star[a][b] + " ");
			}
			System.out.println();
		}
	}
}