package study_unaryArray;

import java.util.Scanner;

public class SeqSearch {
	/**
	 * 값을 입력받아 배열의 원소들을 하나씩 비교해서 원하는 값을 출력한다. 
	 * @param args
	 */
	public static void main(String[] args) {
		//배열을 만든다.
		final int NOT_FOUND = -1;
		int[] s = {0, 10, 20, 30, 40, 0, 10, 20, 30, 40, 0, 10, 20, 30, 40};
		//원하는 값과 비교연산자 생성 -1은 못찾았을경운
		int value = 0, idx = NOT_FOUND;
		Scanner input = new Scanner(System.in);
		//원하는값 입력 받기
		System.out.print("탐색할 값을 입력하시오: ");
		value = input.nextInt();
		//원하는 값과 비교연산자 비교하는 반복문 생성
		for (int i = 0; i < s.length; i++) {
			if (value == s[i]) {
				idx = i;
				break; //성능 향상을 위하여 for 문에서 값을 찾으면 for 문을 중단한다.
			}
		}
		if (idx != NOT_FOUND) {
		System.out.println(value +"의 값은 " + idx + "에 저장되어 있습니다.");
		} else {
			System.out.println("입력한 값이 없습니다.");
		}
	}

}
