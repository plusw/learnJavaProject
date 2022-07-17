import java.net.Socket;
import java.io.OutputStream;
public class Client{
	public static void main(String[] args) throws Exception{
		Socket socket=new Socket("127.0.0.1",10000);
		OutputStream os=socket.getOutputStream();
		os.write("hello".getBytes());
		os.close();
		socket.close();
	}
}