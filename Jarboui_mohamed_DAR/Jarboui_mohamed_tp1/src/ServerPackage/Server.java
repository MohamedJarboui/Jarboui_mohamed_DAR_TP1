package ServerPackage;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.*;
public class Server {
	public static void main(String[] args)
	{
		try {
			ServerSocket s=new ServerSocket(1234);	
			System.out.println("je suis un serveur en attente");
			Socket ss=s.accept();
			
			
			InputStream is=ss.getInputStream();
			OutputStream os=ss.getOutputStream();
			System.out.println("le client est connecte ");
			}
			catch(IOException e){
			e.printStackTrace();	
				
			}

	
	}
}
	
