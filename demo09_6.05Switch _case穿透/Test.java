import java.util.Scanner;
public class Test{
	public  static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入一个1-7的数字");
		int a=sc.nextInt();
		switch(a){
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
				System.out.println("今天工作");
				break;
			case 6:
			case 7:
				System.out.println("今天休息");
				break;
			default:
				System.out.println("Error");
				break;
		}
	}
}
		