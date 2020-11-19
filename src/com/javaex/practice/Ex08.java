package com.javaex.practice;

public class Ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] lotto_num = new int[6];
		int[] test = new int[6];
		
		for(int i=0;i<test.length;i++) {
			test[i] = (int)(Math.random()*6)+1;
			for(int j=0;j<i;j++) {
				if(test[j]==test[i]) {
					test[i] = (int)(Math.random()*6)+1;
					j=-1;
				}
			}
		}
		
		System.out.println("1~6까지 넣어서 중복 안되는지 확인");
		for(int i=0;i<test.length;i++) {
			System.out.print(test[i]+" ");
		}
		//1~6까지 넣어서 중복 안되는 것 확인
		System.out.println();
		System.out.println("===================================");
		System.out.println("중복 안되는 로또 번호");
		for(int i=0;i<lotto_num.length;i++) {
			lotto_num[i] = (int)(Math.random()*45)+1;
			for(int j=0;j<i;j++) {
				if(lotto_num[j]==lotto_num[i]) {
					lotto_num[i] = (int)(Math.random()*45)+1;
					j=-1;
				}
			}
		}
		for(int i=0;i<lotto_num.length;i++) {
			System.out.print(lotto_num[i]+" ");
		}
		
	}

}
