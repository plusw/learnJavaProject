/*某银行推出了整存整取定期储蓄业务，其存期分为一年、两年、三年、五年，到期凭存单支取本息。存款年利率表如下：

    存期        年利率（%）

    一年        2.25

    两年        2.7

    三年        3.25

    五年        3.6

请存入一定金额（1000起存），存一定年限（四选一），计算到期后得到的本息总额。

提示：

    存入金额和存入年限均由键盘录入

    本息计算方式：本金+本金×年利率×年限

 训练提示

1. 使用什么方式让用户输入内容？
2. 使用哪种if语句的格式对信息作出判断？

 解题方案

1. 使用Scanner和if..else...的嵌套操作。

 操作步骤

1. 键盘录入金额和年份。
2. 使用多条件if...else判断年份，计算本息金额。
3. 输出结果。
*/
import java.util.Scanner;
public class Test{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("欢迎来到本银行存钱，您想存多少钱呢?");
		double money=sc.nextInt();
		if(money<1000){
			System.out.println("抱歉，您的钱太少，1000元起存");
		}
		else{
			System.out.println("我们提供4种存款年限，分别是1年，2年，3年，5年，您想存多少年呢?");
			int year=sc.nextInt();
			double total=0;
			if(year==1){
				total=money+money*2.25*0.01*1;
				System.out.println("到期后，您的本金加利息一共有"+total+"元。");
			}
			else if(year==2){
				total=money+money*2.7*0.01*2;
				System.out.println("到期后，您的本金加利息一共有"+total+"元。");
			}
			else if(year==3){
				total=money+money*3.25*0.01*3;
				System.out.println("到期后，您的本金加利息一共有"+total+"元。");
			}
			else if(year==5){
				total=money+money*3.6*0.01*5;
				System.out.println("到期后，您的本金加利息一共有"+total+"元。");
			}
			else{
				System.out.println("抱歉，您想存的年限不在我们业务范围内。");
			}
		}
		
	}
}
