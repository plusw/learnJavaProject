import java.io.File;
public class Test{
	public static void main(String[] args) throws Exception{
		
		
		
		String path="F:\\aaa";
		File file=new File(path);
		boolean isFile=file.isFile();
		if(isFile){
			System.out.println("是文件");
		}
		else{
			System.out.println("不是文件");
		}
		boolean isDir=file.isDirectory();
		if(isDir){
			System.out.println("是文件夹");
		}
		else{
			System.out.println("不是文件夹");
		}
	}	
}