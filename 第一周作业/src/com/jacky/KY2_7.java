package com.jacky;

import java.util.Scanner;

//��ͬ�¶���ʾ��ͬ����Ϣ
public class KY2_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
		System.out.println("�������¶ȣ�");
		int tem=sc.nextInt();
		switch(tem) {
		case 10:System.out.println("��ǰ�¶���10���϶ȣ��е���");break;
		case 20:System.out.println("��ǰ�¶���20���϶ȣ�����");break;
		case 30:System.out.println("��ǰ�¶���30���϶ȣ���Ӧ�ô�������");break;
		case 40:System.out.println("��ǰ�¶���40���϶ȣ��ȵ�Ҫ��");break;
		default: System.out.println("�˼Ҳ�֪�����ڵ��¶ȣ�����10��20��30��40������~");break;
		}
		sc.close();
	}

}
