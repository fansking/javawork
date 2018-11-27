package com.jacky;

public class KY2_8 {
//华氏温度与摄氏温度转换
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int tem=0;tem<100;tem+=5) {
			//c=5/9*(F-32)
			double F=(tem*9/5)+32;
			System.out.println("摄氏度:"+tem+"对应华氏温度为:"+F);
		}
	}

}
