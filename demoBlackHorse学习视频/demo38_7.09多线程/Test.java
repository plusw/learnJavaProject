import java.util.Arrays;
import java.io.UnsupportedEncodingException; 
public class Test{
	public static void main(String[] args) {
		MyTread a=new MyTread();
		a.setName("第一个线程");
		MyTread b=new MyTread();
		b.setName("第二个线程");
		a.start();
		b.start();
	}		
	
	
}