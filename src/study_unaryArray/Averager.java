package study_unaryArray;

import java.util.Scanner;

public class Averager {
	/**
	 * 5���� ������ �Է¹޾� ����� ���ϴ� ���α׷� ����
	 * @param args
	 */
	public static void main(String[] args) {
		myNewTypeForArray();
	}

	private static void basicForArray() {
		//��� �� ���� ����
		final int STUDENT = 5;
		int total = 0, i = 0, average = total / STUDENT;
		Scanner input = new Scanner(System.in);
		
		//�迭 ����
		int[] score = new int [STUDENT];
		
		//�ݺ��� �ۼ�
		for(i = 0; i < score.length; i++) {
			System.out.println((i + 1) + " ��° �л��� ������ �Է��Ͻÿ�.");
			score[i] = input.nextInt();
		}
		
		for(i = 0; i < score.length; i++) {
			total += score[i];
		}
		System.out.println("��ü �л��� ��� ������ " + total / STUDENT + "�Դϴ�.");
	}
	
	
	/**�� ������� �ٲٱ�
	 */
	private static void myNewTypeForArray() {
		//��� �� ���� ����
		final int STUDENT_COUNT = 5;
		int total = 0, i = 0, average = total / STUDENT_COUNT;
		Scanner input = new Scanner(System.in);
		
		//�迭 ����
		int[] arrScore = new int [STUDENT_COUNT];
		
		//�ݺ��� �ۼ�
		for(i = 0; i < arrScore.length; i++) {
			System.out.println((i + 1) + " ��° �л��� ������ �Է��Ͻÿ�.");
			arrScore[i] = input.nextInt();  // ������ �Է� �ް� arrScore�� �����Ѵ�.
		}
		
		//int[] score = [50, 40, 30, 20, 10];
		//int total = 0;
		for(int score : arrScore) {
			total += score;
		}
		// for (int var : arr) -> for-each ������ �̹� ������ �迭�� ����ؾ��Ѵ�. �迭 ���� ����,����,�Ϻ� �� �ȵ�.
		
		System.out.println("��ü �л��� ��� ������ " + average + "�Դϴ�.");
	}
	

}
