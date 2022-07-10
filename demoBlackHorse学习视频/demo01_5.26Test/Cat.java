import java.io.File;
import java.io.IOException;
public class Cat{
	public static void main(String[] args) throws IOException{
		File file=new File("D:\\");
		File[] files=file.listFiles();
		for(File path:files){
			System.out.println(path);
		}
		
	}	
}