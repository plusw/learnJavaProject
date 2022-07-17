import java.io.File;
public class Test{
	public static void main(String[] args) throws Exception{
		
		String path="F:\\ccc\\bbb\\aaa";
		File file=new File(path);
		boolean a=file.mkdirs();
		System.out.println(a);
	}	
}