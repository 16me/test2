package d_array;

public class Ex06_복습3 {

	public static void main(String[] args) {
		// 1. a 선언
		int[][] a = new int[][] { { 3, -5, 12 }, { -2, 11, 2, -7 }, { 21, -21, -35, -93, -11 }, { 9, 14, 39, -98 } };

		// 2. 합계더하기
		int[] sum = new int[a.length]; // [a.length]

		int max = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				sum[i] += a[i][j];
			}
			// System.out.print(sum[i]);
		}

		// 3. 최댓값 비교
		for (int c = 0; c < sum.length; c++) { // 반복문(for) 배열의 갯수만큼
			if (sum[c] > max) {
				max = sum[c];
			}

			// 4. 출력
		}
		System.out.print(max + "");

	}
}
