 import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;
import java.util.stream.Collectors;
//import java.util.Collectors;
import java.lang.Integer;
public class Test{
	public static void main(String[] args) throws Exception{
		ArrayList<String> list1=new ArrayList<String>(List.of("王嘉","周慧妹","李昌钰","周慧敏"));
		long a=list1.stream().count();
		System.out.println(a);
		
		ArrayList<Integer> list=new ArrayList<>(List.of(1,2,3,4,5,77,56,56));
		List<Integer> list2=list.stream().filter(number->number%2==0)
					 .collect(Collectors.toList());
					 
		System.out.println(list2);
		
		Set<Integer> list3=list.stream().filter(number->number%2==0)
					 .collect(Collectors.toSet());
					 
		System.out.println(list3);
	}
}