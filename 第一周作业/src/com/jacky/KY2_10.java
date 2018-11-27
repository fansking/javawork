package com.jacky;

public class KY2_10 {
//计算1-100的和
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
		int sum=0;
		do {
			sum+=i;
			i++;
		}while(i<=100);
		System.out.println("1-100的和为："+sum);
	}

}
