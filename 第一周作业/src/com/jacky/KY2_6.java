package com.jacky;

import java.util.Scanner;

//�ж��Ƿ�Ϊ����
public class KY2_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
		System.out.println("��������ݣ�");
		int year=sc.nextInt();
		if(IsLeap(year)) {
			System.out.println(year+"������");
		}else {
			System.out.println(year+"��������");
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
