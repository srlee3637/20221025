package naver.srlee3637.network;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class TCPClient {

	public static void main(String[] args) {
		try( Scanner sc = new Scanner(System.in);) {
			
			
			while(true) {
				Socket socket = new Socket(InetAddress.getByName("172.30.1.97"),9999);
				System.out.print("보낼 메세지:");
				String message = sc.nextLine();
				
				//메시지 보내기
				PrintWriter pw = new PrintWriter(socket.getOutputStream(), true);
				pw.println(message + "\n");
				pw.flush();
				
				
				//메시지 받기 
				BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				String response = br.readLine();
				System.out.println(response);
				br.close();
				pw.close();
			}
			
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}

	}

}
