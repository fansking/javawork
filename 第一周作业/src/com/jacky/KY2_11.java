package com.jacky;

public class KY2_11 {
//�žų˷���
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=1;i<10;i++) {
			for(int j=1;j<10;j++) {
				if(j>i) {
					System.out.print("\n");
					break;
				}else {
					System.out.print(j+"*"+i+"="+i*j+"\t");
				}
			}
		}
	}

}
