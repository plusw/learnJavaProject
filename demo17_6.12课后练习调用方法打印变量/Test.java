/*
在主方法中通过键盘录入三个整数。定义一个方法，方法接收三个整数变量，在方法中从大到小依次打印三个变量。执行效果如下：

```
请输入第一个整数：10
请输入第二个整数：30
请输入第三个整数：20
从大到小的顺序是： 30 20 10
```

 训练提示

1. 方法需要接受三个整数，那么方法的形式参数如何定义？
2. 方法没有返回值的需求，返回值类型是什么？

 解题方案

 操作步骤

1. 使用键盘录入分别录入三个整数。

2. 定义method方法，方法的参数是三个int类型，方法的返回值类型是void。

   2.1. 定义整数变量max用于存储最大值，定义min变量用于存储最小值。

   2.2. 使用if..else..多分支判断语句计算三个整数中的最大值并赋值给max。

   2.3. 使用if..else..多分支判断语句计算三个整数中的最小值并赋值给min。

   2.4. 定义变量mid代表中间数,三个整数的和减去max,再减去min,就是中间数的值。

   2.5. 依次打印最大值，中间值和最小值。

3. 在主方法中调用method方法，传入参数。
*/
import java.util.Scanner;
public  class Test{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		String[] arr=new String[3];
		System.out.println("需要输入3个整数");
		for(int i=0;i<3;i++){
			System.out.println("请输入第"+(i+1)+"个整数");
			arr[i] =sc.nextLine();
			while(judgeInt(arr[i])==false){
				System.out.println("您输入的不是整数，请重新输入:");
				arr[i]=sc.nextLine();
			}
		}
		judgeValue(arr);		
		
	}
	public static void judgeValue(String[] a){
		int[] arr={0,0,0};
		for(int i=0;i<arr.length;i++){
			arr[i]=Integer.parseInt(a[i]);
		}
		int max=0;
		//Integer.toString(
		//Integer.parseInt() 
		if(arr[1]>arr[max]){
			max=1;
		}
		if(arr[2]>arr[max]){
			max=2;
		}
		int min=0;
		if(arr[1]<arr[min]){
			min=1;
		}
		if(arr[2]<arr[min]){
			min=2;
		}
		int middle=0;
		for(int i=0;i<arr.length;i++){
			if(i!=max&&i!=min){
				middle=i;
			}
		}
		System.out.println("从大到小的顺序是："+arr[max]+" "+arr[middle]+" "+arr[min]);
	}
	public  static boolean judgeInt(String str){//用ASCII,判断变量是否为整数
		for(int i=str.length()-1;i>=0;i--){  
			int chr=str.charAt(i);
			if(i==0){
				if(chr=='-'){
					return true;
				}
			}					
			if(chr<48 || chr>57){  
				return false; 
			}	
		}  
		return true;  
	}
		
	
		
}
		