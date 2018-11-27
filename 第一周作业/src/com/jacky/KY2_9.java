package com.jacky;

import java.util.Scanner;

//抽奖品
public class KY2_9 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
		while(true) {
			System.out.println("请输入数字：");
			String num=sc.nextLine();
			switch(num) {
			case "1":System.out.println("恭喜你抽到一个背包");break;
			case "2":System.out.println("恭喜你抽到一个羽毛球");break;
			case "3":System.out.println("恭喜你抽到一个苹果");break;
			default:System.out.println("没有奖品给你!");break;
			}
		}
		
		
		
	}
}
