package com.javalec.network;

import java.net.InetAddress;
import java.util.Scanner;

public class InetAddressEx {
	Scanner sc;
	
	public InetAddressEx() {
		System.out.println("Host이름을 입력하세요!");
		
		sc = new Scanner(System.in);
		
		try {
			InetAddress inetAddress = InetAddress.getByName(sc.next());
			
			System.out.println("Computer NAME :"+inetAddress.getHostName());
			System.out.println("Compute IP : "+inetAddress.getHostAddress());
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
