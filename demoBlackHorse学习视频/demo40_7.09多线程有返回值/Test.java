import java.util.concurrent.FutureTask;
public class Test{
	public static void main(String[] args) throws Exception{
		MyCallable a=new MyCallable();
		FutureTask<String>  ft=new FutureTask<>(a);
		
		Thread t1=new Thread(ft);
		t1.start();
		String s=ft.get();
		System.out.println(s);
		
		
		
	}		
	
	
}