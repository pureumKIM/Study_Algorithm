package com.pureum.midas;

import java.util.Scanner;

	public class Num03 {
			  public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				int num = sc.nextInt();
				int cnt = 0;
			    int[][] input = new int[num+1][num+1];
			    for (int i = 0; i < input.length; i++) {
				      for (int j = 0; j < input[i].length; j++) {
				        input[i][j] = 0;
				      }
				    }

			    for (int i = 0; i < num; i++) {
					for (int j = 0; j < num; j++) {
						input[i][j] = sc.nextInt();
					}
				}
			    
			    for (int i = 0; i < input.length; i++) {
					for (int j = 0; j < input.length; j++) {
						if(input[i][j] == 1){
							cnt++;
							if(i<=num-1 && j<=num-1){
								int sum = input[i][j+1]+input[i+1][j]+input[i+1][j+1];
								if(sum==3){
									input[i][j+1]=0;
									input[i+1][j]=0;
									input[i][j]=0;
									cnt--;
								}	
								if(input[i][j]==input[i][j+1]){//오른쪽
									input[i][j+1]=0;
									for(int k=i; k<input.length;k++){
										if(input[i][k]==1) input[i][k]=0;
									}
								}
								if(input[i][j]==input[i+1][j]){//아래쪽
									input[i+1][j]=0;
									for(int k=i+1; k<input.length;k++){
										if(input[k][j]==1) input[k][j]=0;
									}
								}		
							}
						}else if(input[i][j] == 0){
							if(i<=num-1 && j<=num-1){
								int sum = input[i][j+1]+input[i+1][j]+input[i+1][j+1];
								if(sum==3){
											input[i][j+1]=0;
											input[i+1][j]=0;
											input[i+1][j+1]=0;
											cnt++;
								}	
							}		
						}
					}
				}	
			    System.out.println(cnt);
			  }
	}

