/*
已知2019年是猪年，请在控制台输出从1949年到2019年中所有是猪年的年份。

 训练提示

1. 1949到2019有很多年？逐个判断这么多年份肯定要用循环。
2. 用什么条件来判断是否是猪年？

 解题方案

1. 使用for循环逐年判断，根据2019是猪年这个条件，使用if来判断其他是猪年的年份。

 操作步骤

1. 定义for循环，1949到2019的年份是循环次数。
2. 对每个年份逐个判断，如果年份和2019的差值是12的倍数，说明这年是猪年
3. 打印符合条件的年份
*/
public  class PigYear{
	public static void main(String args[]){
		for(int i=1949;i<=2019;i++){
			if(i%12==2019%12){
				System.out.println(i);
			}
		}
	}
}
		