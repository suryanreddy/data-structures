package com.socket.ex;

import java.io.IOException;

public class SocketEx {
	
	public static void main(String[] args) throws IOException {

		ApplicationClient client1 = new ApplicationClient();
		client1.startConnection("127.0.0.1", 6666);
		String response = client1.sendMessage("hello server1");
		System.out.println(response);
		
		ApplicationClient client2 = new ApplicationClient();
		client2.startConnection("127.0.0.1", 6666);
		String response2 = client2.sendMessage("hello server2");
		System.out.println(response2);
		
		ApplicationClient client3 = new ApplicationClient();
		client3.startConnection("127.0.0.1", 6666);
		String response3 = client3.sendMessage("hello server3");
		System.out.println(response3);
		
		ApplicationClient client4 = new ApplicationClient();
		client4.startConnection("127.0.0.1", 6666);
		String response4 = client4.sendMessage("hello server4");
		System.out.println(response4);
		
		ApplicationClient client5 = new ApplicationClient();
		client5.startConnection("127.0.0.1", 6666);
		String response5 = client5.sendMessage("hello server5");
		System.out.println(response5);
		System.out.println(client5.sendMessage("."));
		
		
		ApplicationClient client6 = new ApplicationClient();
		client6.startConnection("127.0.0.1", 6666);
		String response6 = client6.sendMessage("hello server6");
		System.out.println(response6);
		
//		String s = System.lineSeparator();
//		  
//        for (char c : s.toCharArray()) {
//            System.out.println((int)c);
//        }
//		System.out.print(System.lineSeparator());
//		Pattern intPattern = Pattern.compile("\\d+");
//		boolean isInteger = intPattern.matcher("-333333").matches();
//		System.out.println(isInteger);
	}

}
