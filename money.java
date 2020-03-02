package pocketmoney;
/*
There is one 50 yuan, one 20 yuan, one 10 yuan, two 5 yuan bills and three 1 yuan coins in your pocket.

50
20
10
5,5
1,1,1

Write a program to find out whether you can take out a given number (x) yuan. 
 */
public class money {
	int [] pocMoney ; 
	money(){
		pocMoney = new int [5];
		pocMoney[0] = 50;
		pocMoney[1] = 20;
		pocMoney[2] = 10;
		pocMoney[3] = 5;
		pocMoney[4] = 1;
	}
	int func( int total ) {
		for( int i0 = 0 ; i0 < 2 ; i0 ++ ) {
			for( int i1= 0 ; i1 < 2; i1 ++ ) {
				for( int i2 = 0; i2 < 2 ; i2 ++ ) {
					for( int i3 = 0 ; i3 < 3 ; i3 ++ ) {
						for( int i4 = 0 ; i4 < 4 ; i4 ++ ) {
							if( i0 * pocMoney[0] + i1 * pocMoney[1] + i2 * pocMoney[2] +
									i3 * pocMoney[3] + i4 * pocMoney[4] == total )
								return 1;
						}
					}
				}
			}
		}
		return 0;
	}
}
