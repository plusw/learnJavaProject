import java.util.ArrayList;
import java.util.List;
public class Test{
 public static void main(String[] args){
	ArrayList<String> list=new ArrayList<String>(List.of("张亮","赵丽颖","胡歌"));
	list.stream().filter(a->a.startsWith("张"))
				 .filter(a->a.length()==2)
				 .forEach(a->System.out.println(a));
 }
}