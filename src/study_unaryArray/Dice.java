package study_unaryArray;

public class Dice {
	/**
	 * �ֻ����� 10000�� ������ ������ ���� ���ڸ� ����Ͻÿ�. 
	 * @param args
	 */
	public static void main(String[] args) {
		//�󵵸� ������ ���� �� �ֻ��� ����� ������ ��� ����
		final int DICE = 6;
		int i = 0; 
		int[] freq = new int[DICE];
		//�ֻ����� ������ �������� ������ ���� ���� �迭�� �� �󵵼��� �ø���.
		for (i = 0; i < 10000; i++) {
			freq[(int)(Math.random() * DICE)]++;
		}
		//�� �迭�� ���� �� ���
		for (i = 0; i < DICE; i++) {
			System.out.println((i + 1) + "�� ����" + freq[i] + "��ŭ ���Դ�.");
		}
	}

}
