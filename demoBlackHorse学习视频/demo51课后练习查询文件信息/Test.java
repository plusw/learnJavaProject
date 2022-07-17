import java.io.File;
public class Test{
	public static void main(String[] args) throws Exception{
		
		
		
		String path="F:\\aaa\\b.txt";
		File file=new File(path);
		System.out.println(file);
		System.out.println(file.getParent());
		System.out.println(file.length());
		System.out.println(file.getName());
	}	
}