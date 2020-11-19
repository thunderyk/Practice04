package com.javaex.practice;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int input_num;
		int[] wonArray = {50000,10000,5000,1000,500,100,50,10,5,1};
		int[] wonCount = new int[10];
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("금액: ");
		input_num = sc.nextInt();
		//동전 갯수 count 배열 안의 값을 0으로 초기화
		for(int i=0;i<wonCount.length;i++) {
			wonCount[i]=0;
		}
		
		for(int i=0; i<wonArray.length;i++) {
			while(true)
			{			
				if(input_num-wonArray[i]>=0) {
					input_num-=wonArray[i];
					wonCount[i]+=1;
				}else {
					break;
				}
			}
		}
		for(int i=0;i<wonArray.length;i++) {
			System.out.println(wonArray[i]+"원: "+wonCount[i]+"개");
		}
		sc.close();
		
	}

}
