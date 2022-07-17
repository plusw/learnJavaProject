import java.util.Arrays;
import java.io.UnsupportedEncodingException; 
public class Test{
	public static void main(String[] args) {
		MyCallable a=new MyCallable();
		FutureTask<String>  ft=new FutureTask<>(a);
		
		Thread t1=new Thread(ft);
		t1.start();
		
		
		
	}		
	
	
}