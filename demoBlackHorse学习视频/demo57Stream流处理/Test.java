import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
public class Test{
	public static void main(String[] args) throws Exception{
		ArrayList<String> list1=new ArrayList<String>(List.of("王嘉","周慧妹","李昌钰","周慧敏"));
		//list.stream().limit(2)
		/*
		list1.stream().skip(2)
					 .forEach(s->System.out.println(s));
		*/
		ArrayList<String> list2=new ArrayList<String>(List.of("王嘉","李嘉诚"));
		
		ArrayList<String> list3=new ArrayList<String>();
		Stream<String> stream3=Stream.concat(list2.stream(),list1.stream());
		stream3.distinct()
			   .forEach(s->System.out.println(s));
		
		
	}
}