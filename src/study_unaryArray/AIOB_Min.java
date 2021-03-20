package study_unaryArray;

import java.util.Arrays;

public class AIOB_Min {

	public static void main(String[] args) {
		//sequentialSearch();
		findMinbyArrays();
	}
	
	//정렬하여 최소값을 구하는 방법
	private static void findMinbyArrays() {
		int[] s = {3, 6, 1, 7, 4, 2};
		Arrays.sort(s);
		System.out.println("최소값은 " + s[0]);
	}
	
	
	private static void sequentialSearch() {
		int[] s = {3, 6, 1, 7, 4, 2};
		
		//int min = s[0];로 한다면 만약 s 배열에 아무런 값(Empty Array)이 없으면 ArrayIndexOutOfBounds 오류가 남
		int min = Integer.MAX_VALUE; //초기값을 int에 MAX_VALUE로 준다면 이 값보다 큰 값이 없기 때문에 비교했을때 작은값이나 같은 값만 출력하게 된다.
		for (int i = 0; i < s.length; i++) {
			if (min > s[i]) {
				min = s[i];
			}
		}
		System.out.println("최소값은 " + min);
	}

}
