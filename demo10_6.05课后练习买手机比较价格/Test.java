/*李雷想买一个价值7988元的新手机，她的旧手机在二手市场能卖1500元，而手机专卖店推出以旧换新的优惠，把她的旧手机交给店家，新手机就能够打8折优惠。
为了更省钱，李雷要不要以旧换新？请在控制台输出。

 训练提示

1. 用什么知识点能够对不同购买方式的价格做判断？

 解题方案

1. 使用if...else语句判断

操作步骤

1. 计算不使用以旧换新时的花费。
2. 计算使用以旧换新时的花费。
3. 使用if..else语句判断哪种方式更省钱，并输出结果
*/

public class Test{
	public static void main(String args[]){
		double price1,price2;
		price1=7988-1500;
		price2=7988*0.8;
		if(price1<price2){
			System.out.println("卖旧手机更便宜，需花费"+price1+"元。");
		}
		else if(price1>price2){
			System.out.println("以旧换新更便宜，需花费"+price2+"元。");
		}
		else{
			System.out.println("两种方式花费相等");
		}
	}
}