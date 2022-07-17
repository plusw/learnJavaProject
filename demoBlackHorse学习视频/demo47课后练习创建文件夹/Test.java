import java.io.File;
public class Test{
	public static void main(String[] args) throws Exception{
		/*
		String path="F:\\";
		File file=new File(path);
		File[] files=file.listFiles();
		for(File a : files){
			if(a.getName()=="a.txt"){
				System.out.println(a);
				System.out.println("有文件");
			}
			else{
				String path2="F:\\a.txt";
				File b=new File(path2);
				System.out.println("没有文件,创建了");
			}
		}
		*/
		String path="F:\\a.txt";
		File file=new File(path);
		boolean a=file.createNewFile();
		System.out.println(a);
	}	
}