package com.socket.ex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.atomic.AtomicInteger;

public class ApplicationServer {

	private ServerSocket serverSocket;
	private AtomicInteger runningClients = new AtomicInteger();
	private static int clients = 5; 
	
	public static void main(String[] args) {

		ApplicationServer applicationServer = new ApplicationServer();
		try {
			int port = 6666;
			if(args != null && args.length > 1) {
				try {
					port = Integer.parseInt(args[0]);
					clients = Integer.parseInt(args[1]);
				} catch(NumberFormatException nfe) {
					// proceed with the default port number.
				}
			}
			
			applicationServer.start(port);
		} catch (IOException e) {
		}
	}

	public void start(int port) throws IOException {
		serverSocket = new ServerSocket(port);
		while (runningClients.addAndGet(1) <= clients) {
			System.out.println("Inside loop : " + runningClients.get());
			new EchoClientHandler(serverSocket.accept()).start();
		}
	}

	public void stop() throws IOException {
		serverSocket.close();
	}

	private class EchoClientHandler extends Thread {
		private Socket clientSocket;
		private PrintWriter out;
		private BufferedReader in;

		public EchoClientHandler(Socket socket) {
			this.clientSocket = socket;
		}

		public void run() {
			int x = 1;
			try {
				out = new PrintWriter(clientSocket.getOutputStream(), true);
				in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

				String inputLine;
				while ((inputLine = in.readLine()) != null) {
					if (".".equals(inputLine)) {
						out.println("bye");
						x = -1;
						break;
					}
					out.println(inputLine);
				}
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				try {
					in.close();
					out.close();
					clientSocket.close();
					if(x == -1) {
						serverSocket.close();
					}
				} catch (IOException e) {
					e.printStackTrace();
				}

			}
		}
	}

}
