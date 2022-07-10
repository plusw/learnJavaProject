import java.util.ArrayList;
import java.util.List;
public class Test{
 public static void main(String[] args){
	ArrayList<String> list=new ArrayList<String>(List.of("张亮","赵丽颖","胡歌"));
	list.add("hello");
	System.out.println(list);
 }
}