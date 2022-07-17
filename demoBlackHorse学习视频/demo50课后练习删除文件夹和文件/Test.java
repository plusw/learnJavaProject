import java.io.File;
public class Test{
	public static void main(String[] args) throws Exception{
		
		String path="F:\\aaa";
		File file=new File(path);
		file.delete();
		
		String path2="F:\\a.txt";
		File file2=new File(path2);
		file2.delete();
	}	
}