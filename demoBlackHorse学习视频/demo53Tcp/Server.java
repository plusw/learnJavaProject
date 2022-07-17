import java.net.Socket;
import java.net.ServerSocket;
import java.io.InputStream;
public class Server{
	public static void main(String[] args) throws Exception{
		ServerSocket s=new ServerSocket(10000);
		Socket accept=s.accept();
		InputStream is=accept.getInputStream();
		int b;
		while((b=is.read())!=-1){
			System.out.print((char)b );
		}
		is.close();
		s.close();
		
	}
}