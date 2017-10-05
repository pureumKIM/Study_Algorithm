package com.pureum.midas;
import java.util.List;
import java.util.Scanner;

public class TakeForce{
   public static void main(String[] args){
       Scanner scanner = new Scanner(System.in);
        int n=0;
        int m=0;
        int k=0;
        n=scanner.nextInt();
        m=scanner.nextInt();
        k=scanner.nextInt();
        
        int part = n/2;
        for(int i =1;i>part;i++){
        	if(part<=m) break;
        	part-=i;
        }
        System.out.println(part);
   }
}