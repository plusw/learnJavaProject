import java.util.ArrayList;
@SuppressWarnings("unchecked")
public class Test{
	public static void main(String[] args){
		ArrayList list=new ArrayList();
		list.add(123);
		list.add("hello");
		list.add(true);
		System.out.println(list);
		
		ArrayList<String> list2=new ArrayList();
		list2.add("123");
		list2.add("223");
		list2.add("1009");
		list2.add(2,"hello world");
		System.out.println(list2);
		
		ArrayList<String> list3=new ArrayList();
		list3.add("他们");
		list3.add("说");
		list3.add("不只");
		list3.add("站在光里的");
		list3.add("才是英雄");
		System.out.println(list3);
		//boolean a=list3.remove("不只");
		
		System.out.println("getIndex"+getIndex(list3,"说"));
		
		System.out.println("移除:"+list3.remove(2));
		System.out.println(list3);
		
		list3.set(0,"他");
		System.out.println(list3); 
		
		System.out.println(list3.get(3));
		
		System.out.println("size是："+list3.size());
		
	}
}