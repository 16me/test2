package d_array;

public class Ex02_최댓값찾기 {

	public static void main(String[] args) {

		int[] score = new int[] { 88, 61, 72, 92 };
		// max 변수선언
		int max = score[0];
		// score의 i번째 값과 max 비교
		// max 값이 더 작다면 max 에 저장
		for (int i = 0; i < score.length; i++) { // 반복문(for) 배열의 갯수만큼
			if (score[i] > max) {
				max = score[i];
			}
		}
		System.out.println("최댓값은 " + max);
	}

}
