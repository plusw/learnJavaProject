public class Test{
	public static void main(String[] args){
		String a="abc";
		String x="ab";
		String b="ab"+"c";
		String c=x+"c";
		System.out.println(a==b);//true   如果是常量相加，有常量优化机制，在编译时会转换为"abc",为true
		System.out.println(c==a);//false  如果是变量，为false
		System.out.println(a.length());//字符串长度3
		//字符串的值不能被更改，更改的是地址
		
		//String常见构造方法
		//public String();
		//public String(char[] chs);
		//public String(String original);
		//String a="12asd";
		System.out.println("String常见构造方法:没有参数");
		String a1=new String();//在堆中
		String b1=new String();//在堆中
		String aa1="";//存在于常量池中
		System.out.println(a1);
		System.out.println(a1==aa1);
		System.out.println("b1==a1:"+(b1==a1));//a1,b1分别对应不同地址
		System.out.println("String常见构造方法:char字符数组作为参数");
		char[] chr={'q','w','e','r'};
		String a2=new String(chr);
		System.out.println(a2);
		System.out.println("String常见构造方法:String作为参数");
		String a3=new String("qwer");
		System.out.println(a3);
		System.out.println("a2==a3:"+(a2==a3));
	}
}