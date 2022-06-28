/*
两个数字交换，不用创建第三个变量
*/

public  class Test{
	public static void main(String args[]){
		int a=20;
		int b=10;
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println("a:"+a);
		System.out.println("b:"+b);
		
		// 1011011 二进制异或 1111011
		// 1111011
		// 0100000
		int x=0b10110110111001;
		int y=0b11110111110000;
		//      01000001001001
		String s=Integer.toBinaryString(x^y);
		System.out.println(s);
		
		
		
		
	}
}

		