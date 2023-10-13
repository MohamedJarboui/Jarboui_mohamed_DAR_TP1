package ClientPackage;

import java.net.*;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Client {
	public static void main(String[] args) {
		try {
		 Socket socket=new Socket("localhost",1234);
		 System.out.println("je suis connecte");
		 InputStream is=socket.getInputStream();
		 OutputStream os=socket.getOutputStream();	
		}
		catch(IOException e) {
			e.printStackTrace();
			
		}
	}

}
