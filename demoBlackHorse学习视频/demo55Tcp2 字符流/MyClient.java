import java.io.OutputStream;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
public class MyClient{
	public static void main(String[] args) throws Exception{
		Socket socket=new Socket("127.0.0.1",10000);
		OutputStream os=socket.getOutputStream();
		os.write("天王盖地虎".getBytes());
		socket.shutdownOutput();
		InputStream is=socket.getInputStream();
		int b;
		byte[] c=new byte[100];
		int i=0;
		while((b=is.read())!=-1){
			c[i]=(byte)b;
			i++;
		}
		String d=new String(c,"utf-8");
		System.out.print(d);
		is.close();
		os.close();
		socket.close();
	}
}