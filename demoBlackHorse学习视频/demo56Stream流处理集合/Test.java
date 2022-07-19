import java.util.ArrayList;
import java.util.List;
public class Test{
	public static void main(String[] args) throws Exception{
		ArrayList<String> list=new ArrayList<String>(List.of("王嘉","李昌钰","周慧妹","周慧敏"));
		list.stream().filter(s->s.startsWith("周"))
					 .filter(s->s.length()==3)
					 .filter(s->s=="周慧妹")
					 .forEach(s->System.out.println(s));
	}
}