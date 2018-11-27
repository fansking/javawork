package com.jacky;

import java.util.Scanner;

//判断是否为闰年
public class KY2_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
		System.out.println("请输入年份：");
		int year=sc.nextInt();
		if(IsLeap(year)) {
			System.out.println(year+"是闰年");
		}else {
			System.out.println(year+"不是闰年");
		}
		sc.close();
	}
	public static  boolean IsLeap(int year) {
		if(year%400==0) {
			return true;
		}else if(year%4==0 && year %100 !=0) {
			return true;
		}else {
			return false;
		}
	}

}
