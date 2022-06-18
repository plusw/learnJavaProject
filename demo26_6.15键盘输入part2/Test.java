import java.util.Scanner;
public class Test{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入一个数字");//会输入数字+回车
		int a=sc.nextInt();//取数字
		System.out.println("请输入你的名字");//
		String name=sc.nextLine();//取回车
		System.out.println(name);//name为空白
		
		System.out.println("请输入你的爱好");
		String hobby=sc.nextLine();//以回车结束
		System.out.println(hobby);
		
		
		System.out.println("请再输入一个数字");//会输入数字+回车
		int a1=sc.nextInt();//取数字
		System.out.println(a1);
		System.out.println("请输入你的手机信息");
		String phone=sc.next();//以空格和tab结束
		System.out.println(phone);
	}
}
		