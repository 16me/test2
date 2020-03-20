package d_array;

public class Ex05_lotto2 {

	public static void main(String[] args) {
		// 변수명은 로또, 변수확보
		int temp = 0;

		int[][] lotto = new int[5][6]; // 2차원 배열 선언, 행,열 순서

		for (int a = 0; a < lotto.length; a++) {
			for (int b = 0; b < lotto[a].length ; b++){
				lotto[a][b] = (int) (Math.random() * 45) + 1; // 랜덤 (int)(Math.random( ) *10)
				System.out.print(lotto[a][b] + "/");
			}	System.out.println();
		}
		for(int c =0; c<lotto.length ; c++) {
		for (int d = lotto[c].length - 1; d > 0; d--) {
			for (int e = 0; e < d; e++) {
				if (lotto[c][e] > lotto[c][e + 1]) {
					temp = lotto[c][e + 1];
					lotto[c][e + 1] = lotto[c][e];
					lotto[c][e] = temp;
				}
			}
			}
		}
		for(int a =0 ; a <=lotto.length ; a++) {
		for (int b = 0; b <= lotto.length; b++) {
			System.out.print(lotto[a][b] + "/");
		}
		System.out.println();
	}
}
}
