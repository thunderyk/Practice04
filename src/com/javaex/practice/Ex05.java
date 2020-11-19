package com.javaex.practice;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input_num = new int[5];
		double sum=0, average;
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < input_num.length; i++) {
			input_num[i]=sc.nextInt();
			sum+=input_num[i];
		}
		average = sum/input_num.length;
		System.out.println("평균은 "+average+" 입니다.");
		sc.close();
	}

}
