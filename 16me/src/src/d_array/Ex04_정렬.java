package d_array;

public class Ex04_정렬 {

	public static void main(String[] args) {
		int temp =0;
		int[] score = new int[] { 88, 61, 72, 92, 56 };
		for( int i = score.length-1 ; i>0 ; i--) {
			for(int j = 0 ; j < i ;j++) {
				if(score[j] > score[j+1] ) {
					// swapping
					temp = score[j+1];
					score[j+1] = score[j];
					score[j] = temp;

					
				}
			}
		}
		for(int a = 0 ; a <score.length ; a++) {
		System.out.print(score[a] + "/");
		}
	}

}
