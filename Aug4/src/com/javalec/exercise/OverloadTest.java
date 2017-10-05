package com.javalec.exercise;

import java.util.Scanner;

class Over{
	void cal(){
		System.out.println("값없음");
	}
	
	void cal(int width){
		System.out.println("정사각형의 넓이 :"+(width*width));
	}
	void cal(int width, int height){
		System.out.println("직사각형의 넓이 :"+(width*height));
	}
	void cal(int width, int height, int depth){
		System.out.println("직사면체의 부피 :"+(width*height*depth));
	}
}

public class OverloadTest {
	public static void main(String[] args) {
		Over a = new Over();
		Scanner sc = new Scanner(System.in);
		int[] input = {2,3};
		for(int i=0; i<input.length;i++){
			
			input[i]=sc.nextInt();
		}
		switch(input.length){
		case 0:
			a.cal();
			break;
		case 1:
			a.cal(input[0]);
			break;
		case 2:
			a.cal(input[0],input[1]);
			break;
		case 3:
			a.cal(input[0],input[1],input[2]);
			break;
		}
		}
	}

