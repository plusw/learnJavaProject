import java.io.File;
public class Test{
	public static void main(String[] args) throws Exception{
		
		String path="F:\\hello";
		File file=new File(path);
		boolean a=file.mkdir();
		System.out.println(a);
	}	
}