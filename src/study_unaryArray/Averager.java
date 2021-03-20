package study_unaryArray;

import java.util.Scanner;

public class Averager {
	/**
	 * 5명의 성적을 입력받아 평균을 구하는 프로그램 구현
	 * @param args
	 */
	public static void main(String[] args) {
		myNewTypeForArray();
	}

	private static void basicForArray() {
		//상수 및 변수 정의
		final int STUDENT = 5;
		int total = 0, i = 0, average = total / STUDENT;
		Scanner input = new Scanner(System.in);
		
		//배열 정의
		int[] score = new int [STUDENT];
		
		//반복문 작성
		for(i = 0; i < score.length; i++) {
			System.out.println((i + 1) + " 번째 학생의 점수를 입력하시오.");
			score[i] = input.nextInt();
		}
		
		for(i = 0; i < score.length; i++) {
			total += score[i];
		}
		System.out.println("전체 학생의 평균 점수는 " + total / STUDENT + "입니다.");
	}
	
	
	/**내 방식으로 바꾸기
	 */
	private static void myNewTypeForArray() {
		//상수 및 변수 정의
		final int STUDENT_COUNT = 5;
		int total = 0, i = 0, average = total / STUDENT_COUNT;
		Scanner input = new Scanner(System.in);
		
		//배열 정의
		int[] arrScore = new int [STUDENT_COUNT];
		
		//반복문 작성
		for(i = 0; i < arrScore.length; i++) {
			System.out.println((i + 1) + " 번째 학생의 점수를 입력하시오.");
			arrScore[i] = input.nextInt();  // 점수를 입력 받고 arrScore에 저장한다.
		}
		
		//int[] score = [50, 40, 30, 20, 10];
		//int total = 0;
		for(int score : arrScore) {
			total += score;
		}
		// for (int var : arr) -> for-each 구문은 이미 정해진 배열로 사용해야한다. 배열 값을 변경,역순,일부 등 안됨.
		
		System.out.println("전체 학생의 평균 점수는 " + average + "입니다.");
	}
	

}
