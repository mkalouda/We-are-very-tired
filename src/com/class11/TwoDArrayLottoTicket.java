package com.class11;

import java.util.Arrays;

public class TwoDArrayLottoTicket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] lotteryCard= { {55, 76, 34},
		                       {4, 22, 33},
		                       {99, 89,56},
		};
		
		int[][] lotteryCard2= new int [3][3];
		lotteryCard2 [0][0]= 55;
		lotteryCard2 [0][1]= 76;
		lotteryCard2 [0][2]= 34;
		lotteryCard2 [1][0]= 4;
		lotteryCard2 [1][1]= 22;
		lotteryCard2 [1][2]= 33;
		lotteryCard2 [2][0]= 99;
		lotteryCard2 [2][1]= 89;
		lotteryCard2 [2][2]= 56;
		
		// [row] [column]
		
		System.out.println(lotteryCard[0][0]);
		System.out.println("--------------------");
		
		for (int i=0;i<3; i++) {
			System.out.println(lotteryCard[i][i]);
		}
		
		System.out.println("--------------------");
		
		for ( int i=0; i<3; i++) {
			for (int j=0; j<3; j++) {
				System.out.print(lotteryCard[i][j]);
			}
		}
		System.out.println();
		System.out.println("--------------------");
		
		System.out.println(Arrays.deepToString(lotteryCard));
		

	}

}
