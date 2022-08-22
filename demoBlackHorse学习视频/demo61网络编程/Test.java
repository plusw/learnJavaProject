import java.net.InetAddress;
public class Test{
	public static void main(String[] args) throws Exception{
		InetAddress address=InetAddress.getByName("DESKTOP-5FBHP9J");
		String hostName=address.getHostName();
		System.out.println("主机名为"+hostName);
		
		String ip=address.getHostAddress();
		System.out.println("IP为"+ip);
	}
}