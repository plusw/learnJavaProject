/*
定义一个字符串"acfhtksud"，使用程序实现在控制台遍历该字符串。


【训练目标】：
字符串的遍历
【思路分析】：
1:定义一个字符串"acfhtksud"
2:遍历字符串，首先要能够获取到字符串中的每一个字符
    public char charAt(int index)：返回指定索引处的char值，字符串的索引也是从0开始的
3:遍历字符串，其次要能够获取到字符串的长度
    public int length()：返回此字符串的长度
    数组的长度：数组名.length
    字符串的长度：字符串对象.length()
4:遍历字符串的通用格式
*/
public class Test{
	public static void main(String[] args){
		String a= "acfhtksud";
		for(int i=0;i<a.length();i++){
			System.out.println(a.charAt(i));
		}
	}
}
