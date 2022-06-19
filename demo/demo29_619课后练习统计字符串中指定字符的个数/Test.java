/*

##[题目二]
请编写程序，由键盘录入一个字符串，统计字符串中英文字母和数字分别有多少个。比如：Hello12345World中字母：10个，数字：5个。
##【训练目标】：
字符串遍历
##【思路分析】：
1、键盘录入一个字符串，用 Scanner 实现
2、要统计两种类型的字符个数，需定义两个统计变量，初始值都为0
3、遍历字符串，得到每一个字符
4、判断该字符属于哪种类型，然后对应类型的统计变量+1，判断字母时需要考虑大小写，条件比较复杂，怎样做才能使判断更简单呢？
##【参考方案】：
为方便判断并统计，可将字符串中的字符都转为大写或者都转为小写。
##【参考步骤】：
1、创建键盘录入Scanner对象，使用nextLine方法接收输入的字符串。
2、为方便后续判断，使用String的toLowerCase方法，将字符串中的字符都转为小写。
3、需定义两个统计变量，初始值都为0
4、遍历字符串，得到每一个字符
5、判断该字符属于哪种类型，然后对应类型的统计变量+1，次数判断英文字母时只需判断小写即可。
 
*/
import java.util.Scanner;
public class Test{
	public static void main(String[] args){
		
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入一个字符串:");
		String a=sc.nextLine();
		
		StringBuilder b=new StringBuilder(a);
		for(int i=0;i<b.length();i++){
			if(b.charAt(i)>='a'&&b.charAt(i)<='z'){
				b.replace(i,i+1,String.valueOf((char)(b.charAt(i)-32)));
			}
		}
		System.out.println(b);
		a=b.toString();
		
		int numCout=0;
		int charCout=0;
		for(int i=0;i<a.length();i++){
			if(a.charAt(i)>='0'&&a.charAt(i)<'9'){
				numCout++;
			}
			else if(a.charAt(i)>='A'&&a.charAt(i)<'Z'){
				charCout++;
			}
		}
		System.out.println("数字有"+numCout+"个");
		System.out.println("字母有"+charCout+"个");
		
	}
}
