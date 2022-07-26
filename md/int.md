## int

int num = (int) 100L

int类型最大约 21个亿

int num=(int) 6000000000 不会报错，会数据溢出

int num=(int) 2.5 不会报错，会精度损失 num=2

int a=Integer.parseInt(string);//String转int
