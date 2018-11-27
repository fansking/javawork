package com.jacky;

import java.util.Scanner;

//不同温度显示不同的信息
public class KY2_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
		System.out.println("请输入温度：");
		int tem=sc.nextInt();
		switch(tem) {
		case 10:System.out.println("当前温度是10摄氏度，有点冷");break;
		case 20:System.out.println("当前温度是20摄氏度，舒适");break;
		case 30:System.out.println("当前温度是30摄氏度，您应该传短袖了");break;
		case 40:System.out.println("当前温度是40摄氏度，热的要死");break;
		default: System.out.println("人家不知道现在的温度，输入10，20，30，40试试嘛~");break;
		}
		sc.close();
	}

}
