package study_unaryArray;

public class Dice {
	/**
	 * 주사위를 10000번 던져서 나오는 면의 숫자를 출력하시오. 
	 * @param args
	 */
	public static void main(String[] args) {
		//빈도를 누적할 변수 및 주사위 면수를 정해줄 상수 정의
		final int DICE = 6;
		int i = 0; 
		int[] freq = new int[DICE];
		//주사위를 던져서 랜덤으로 나오는 값을 통해 배열에 각 빈도수를 올린다.
		for (i = 0; i < 10000; i++) {
			freq[(int)(Math.random() * DICE)]++;
		}
		//각 배열에 대한 값 출력
		for (i = 0; i < DICE; i++) {
			System.out.println((i + 1) + "의 값은" + freq[i] + "만큼 나왔다.");
		}
	}

}
