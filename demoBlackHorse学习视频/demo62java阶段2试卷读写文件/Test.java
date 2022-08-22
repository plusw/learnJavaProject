import java.io.File;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.TreeSet;
public class Test{
	public static void main(String[] args) throws Exception{
		File file=new File("number1.txt");
		File file2=new File("number2.txt");
		TreeSet<Integer> intMap=new TreeSet<Integer>();
		if(file.isFile()){
			BufferedReader br=new BufferedReader(new FileReader(file));
			String line;
			while((line=br.readLine())!=null){
				int a=Integer.parseInt(line);
				System.out.println(a);
				intMap.add(a);
			}
			br.close();
			BufferedWriter bw=new BufferedWriter(new FileWriter(file2));
			for(int a : intMap){
				System.out.println(a);
				bw.write(Integer.toString(a));
				bw.write("\r\n");
			}
			bw.close();
		}
	}
}