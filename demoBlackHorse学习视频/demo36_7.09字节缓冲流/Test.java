import java.io.*;
public class Test{
	public static void main(String[] args) throws IOException{
		BufferedInputStream bis=new BufferedInputStream(new FileInputStream("hello.txt"));
		BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("1.txt"));
		int b;
		while((b=bis.read())!=-1){
			bos.write(b);
		}
		bis.close();
		bos.close();
	}		
	
	
}