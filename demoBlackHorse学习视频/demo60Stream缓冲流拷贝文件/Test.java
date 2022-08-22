import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedInputStream;
public class Test{
	public static void main(String[] args) throws Exception{
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("a.mp3"));//创建字节缓冲输入流
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("b.mp3")); //创建字节缓冲输出流
		int c;
		while((c=bis.read())!=-1){
			bos.write(c);
		}
	}
}