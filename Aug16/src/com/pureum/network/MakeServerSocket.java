package com.pureum.network;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class MakeServerSocket{
	public MakeServerSocket() {
		// TODO Auto-generated constructor stub
		ServerSocket serverSocket = null;
		Socket socket = null;
		PrintWriter writer = null;
		BufferedReader reader = null;
		String lineStr;
		
		try {
			serverSocket = new ServerSocket(2000);
			System.out.println("Client 요청");
			
			writer = new PrintWriter(socket.getOutputStream(),true);
		} catch (Exception e) {}
	}
}
