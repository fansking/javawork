package com.jacky;

import java.util.Scanner;

//�齱Ʒ
public class KY2_9 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
		while(true) {
			System.out.println("���������֣�");
			String num=sc.nextLine();
			switch(num) {
			case "1":System.out.println("��ϲ��鵽һ������");break;
			case "2":System.out.println("��ϲ��鵽һ����ë��");break;
			case "3":System.out.println("��ϲ��鵽һ��ƻ��");break;
			default:System.out.println("û�н�Ʒ����!");break;
			}
		}
		
		
		
	}
}
