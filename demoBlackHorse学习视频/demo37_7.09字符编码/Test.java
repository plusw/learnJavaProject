import java.util.Arrays;
import java.io.UnsupportedEncodingException; 
public class Test{
	public static void main(String[] args) throws UnsupportedEncodingException{
		//将字符转为2进制字节
		String s="王嘉";
		byte[] bytes=s.getBytes();
		byte[] bytes2=s.getBytes("GBK");
		String a=Arrays.toString(bytes);
		String a2=Arrays.toString(bytes2);
		System.out.println(a);
		System.out.println(a2);
		//将2进制字节转换为字符，解码
		
		byte[] bytes3={-25, -114, -117, -27, -104, -119};
		byte[] bytes4={-51, -11, -68, -50};
		String b=new String(bytes4,"GBK");
		System.out.println(b);
	}		
	
	
}