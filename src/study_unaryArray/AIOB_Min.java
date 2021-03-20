package study_unaryArray;

import java.util.Arrays;

public class AIOB_Min {

	public static void main(String[] args) {
		//sequentialSearch();
		findMinbyArrays();
	}
	
	//�����Ͽ� �ּҰ��� ���ϴ� ���
	private static void findMinbyArrays() {
		int[] s = {3, 6, 1, 7, 4, 2};
		Arrays.sort(s);
		System.out.println("�ּҰ��� " + s[0]);
	}
	
	
	private static void sequentialSearch() {
		int[] s = {3, 6, 1, 7, 4, 2};
		
		//int min = s[0];�� �Ѵٸ� ���� s �迭�� �ƹ��� ��(Empty Array)�� ������ ArrayIndexOutOfBounds ������ ��
		int min = Integer.MAX_VALUE; //�ʱⰪ�� int�� MAX_VALUE�� �شٸ� �� ������ ū ���� ���� ������ �������� �������̳� ���� ���� ����ϰ� �ȴ�.
		for (int i = 0; i < s.length; i++) {
			if (min > s[i]) {
				min = s[i];
			}
		}
		System.out.println("�ּҰ��� " + min);
	}

}
