import java.io.File;
public class Test{
	public static void main(String[] args) {
		String path="F:\\java_project\\demoBlackHorse学习视频\\demo45创建文件\\1.txt";
		File file=new File(path);
		System.out.println(file);
		
		String path2=".\\2.txt";
		File file2=new File(path2);
		System.out.println(file2);
		
		String path3="3.txt";
		File file3=new File(path3);
		System.out.println(file3);
		
	}	
}