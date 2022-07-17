import java.io.OutputStream;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
public class Server{
	public static void main(String[] args) throws Exception{
		ServerSocket ss=new ServerSocket(10000);
		Socket accept=ss.accept();
		InputStream is=accept.getInputStream();
		/*
		int b;
		byte[] c=new byte[100];
		int i=0;
		while((b=is.read())!=-1){
			c[i]=(byte)b;
			i++;
		}
		String d=new String(c,"utf-8");
		System.out.print(d);
		*/
		BufferedWriter bw =new BufferedWriter(new OutputStreamWriter(accept.getOutputStream()));
		bw.write("你好");
		bw.newLine();
		bw.flush();
		OutputStream os=accept.getOutputStream();
		os.write("宝塔镇河妖".getBytes());
		//os.write("hello".getBytes());
		accept.shutdownOutput();
		os.close();
		is.close();
		accept.close();
		ss.close();
	}
}