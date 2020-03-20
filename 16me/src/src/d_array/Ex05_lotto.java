package d_array;

public class Ex05_lotto {

	public static void main(String[] args) {
		// 변수명은 로또, 변수확보
		int[] lotto = new int[6];
		int temp = 0;

		for (int j = 0; j < 6; j++) {
			lotto[j] = (int) (Math.random() * 45) + 1;
			for (int k = 0; k < j; k++) {
				if (lotto[k] == lotto[j]) {
					j--;
				}
			}
		}

//		for (int j = 0; j < 6; j++) {
//			temp = (int) (Math.random() * 45) + 1; // 랜덤 (int)(Math.random( ) *10)
//			boolean check = false;
//			for (int k=0; k <j ; k++ ) {
//				if( lotto [k] == lotto [j] ) {
//					check = true;
//					break;
//				}
//			}
//			if(!check) {
//				lotto[j] = temp;
//			}
//		}

		for (int i = lotto.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (lotto[j] > lotto[j + 1]) {
					temp = lotto[j + 1];
					lotto[j + 1] = lotto[j];
					lotto[j] = temp;
				}

			}

		}
		for (int j = 0; j < lotto.length - 1; j++) {
			System.out.print(lotto[j] + "/");
		}

	}
}