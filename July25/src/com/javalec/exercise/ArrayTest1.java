package com.javalec.exercise;

public class ArrayTest1 {
	public static void main(String[] args) {
		int[] num = new int[10];
		System.out.println("�迭�� ���̴� "+num.length);
		double hap =0;
		for(int i=0;i<num.length;i++){
			num[i]=i+1;
		}
		for(int j=0;j<num.length;j++){
			hap += num[j];
		}
		System.out.println("�迭�� ��, 1~10������ ����"+hap);
		System.out.println("�����"+(hap/num.length));
	}
}
