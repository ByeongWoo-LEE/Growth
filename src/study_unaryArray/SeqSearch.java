package study_unaryArray;

import java.util.Scanner;

public class SeqSearch {
	/**
	 * ���� �Է¹޾� �迭�� ���ҵ��� �ϳ��� ���ؼ� ���ϴ� ���� ����Ѵ�. 
	 * @param args
	 */
	public static void main(String[] args) {
		//�迭�� �����.
		final int NOT_FOUND = -1;
		int[] s = {0, 10, 20, 30, 40, 0, 10, 20, 30, 40, 0, 10, 20, 30, 40};
		//���ϴ� ���� �񱳿����� ���� -1�� ��ã�������
		int value = 0, idx = NOT_FOUND;
		Scanner input = new Scanner(System.in);
		//���ϴ°� �Է� �ޱ�
		System.out.print("Ž���� ���� �Է��Ͻÿ�: ");
		value = input.nextInt();
		//���ϴ� ���� �񱳿����� ���ϴ� �ݺ��� ����
		for (int i = 0; i < s.length; i++) {
			if (value == s[i]) {
				idx = i;
				break; //���� ����� ���Ͽ� for ������ ���� ã���� for ���� �ߴ��Ѵ�.
			}
		}
		if (idx != NOT_FOUND) {
		System.out.println(value +"�� ���� " + idx + "�� ����Ǿ� �ֽ��ϴ�.");
		} else {
			System.out.println("�Է��� ���� �����ϴ�.");
		}
	}

}
