## javaSE基础

[String](https://github.com/plusw/learnJavaProject/blob/main/md/String.md)

[StringBuilder](https://github.com/plusw/learnJavaProject/blob/main/md/StringBuilder.md)

[ArrayList](https://github.com/plusw/learnJavaProject/blob/main/md/ArrayList.md)

## javaSE进阶

------------------------------------------------
### 零散知识点


int num = (int) 100L

int类型最大约 21个亿

int num=(int) 6000000000 不会报错，会数据溢出

int num=(int) 2.5 不会报错，会精度损失 num=2

char aaa='A'
System.out.println(aaa+1) 值为66

byte+byte 值会自动转为int

asc码 'A'为65，'a'为97  '0'为48

Unicode码表 万国表

System.out.println("JAVA"+20)    为"JAVA20"


int a=10;
++a;
System.out.println(a);/*a为11*/
a++先用后加；++a先加后用

a%=2 为 a=a%2

byte a=2;   a+=1    a还是为byte类型，a=(byte) int+int 会自动转换

!(2>1) 值为false

(a>10&&a++>12)  &&有短路效果，后半部分可能不会执行，&不会短路，左右两边都会运行

键盘输入  next()以空格和tab为结束标志 nextLine() 以回车为结束标志

nextInt()和nextLine()连续使用时 nextLine()不会录入，一开始会被回车结束

![屏幕截图 2022-06-03 080027](https://user-images.githubusercontent.com/58543246/171759592-92796cf8-8141-48ca-8403-b2435f0104eb.png)

键盘输入

![image](https://user-images.githubusercontent.com/58543246/171765891-aebfd043-6b3d-4280-9add-e20c06ee196e.png)

标识符可以有数字，字母，美元符号$，下划线_ 组成

java存在常量优化机制，byte=10 不需要强制转换

a+=1 a为byte类型，会有自动强制转换

System.out.println(true ^ fasle)  ^为异或，左右两边不一样为true,一样为false

System.out.println("hello");          //打印后会自动换行    System.out.print("hello");          //打印后不会自动换行

do{i++;}while(i<10);            //do{}while()语句循环体至少执行一次，先执行一次循环体，再进行判断

for(;;){System.out.println("停不下来了")}        //for语句死循环

continue会跳过本次循环，break会跳过整个循环结构

st1:while(true){while(true){break st1;}}      //break和continue想要跳出上上个循环，可以给循环做个标记再跳出 

![image](https://user-images.githubusercontent.com/58543246/172050084-07c23d9d-1553-4eff-bac6-4bc6cdf75501.png)

int[] arr=new int[5]; System.out.println(arr); //打印[I@10f87f48   为数组的内存地址

int[] arr=new int[2]; int[] arr2=arr; //arr和arr2指向同一个数组int地址

int[] arr=new int[2];   arr=null;   //会发生空指针异常

System.out.println(arr.length)    //获取数组长度

方法是否重载跟返回值无关，只与方法名和参数有关

二进制，数值以0b开头，b大小写都可以;8进制数值以0开头;16进制数值前面以0x开头，x大小写都可以

二维数组储存一维数组的时候是储存其地址

String的值创建后不可改变，变的是指向的地址

System.out.println("asd"); //打印String类不会打印其地址

以""创建的字符串，会先在字符串常量池中寻找,没有则会创建（有且仅有一个）

System.out.println("abc"=="ab" +"c")//为false 因为生成的字符串是在堆内存中，不在堆中的常量池里

System.out.println("abc"=="a"+"b" +"c"); //为true，java有常量优化机制,三个常量加会自动拼接成"abc"

a.equals(b)//equals比较的是内容,==比较的是地址

a.equalsIgnoreCase(b)//忽略大小写

a.charAt(5);//返回字符串索引5处的字符

a.toCharArray();//返回字符数组

a.subString(2);//字符串截取2到末尾

a.subString(2,4);//字符串截取2到4

a.replace("old","new");//字符串替换

a.split(',');//以","切割字符串为字符串数组

StringBulider是可变的，可以提供字符串操作效率

System.currentTimeMillis();//获取1970年1月1日0时0分0秒以来的毫秒数

StringBuilder sb=new StringBuilder();
sb.append("abc");//字符串拼接

StringBuilder常用方法:

sb.append(a);

sb.reverse()//字符串倒过来（取反）

sb.length()；

sb.toString();

sb.replace(1,2,"a");//根据索引替换


StringBuilder("abc");//String转StringBuilder

String a="asdf"; a.equals("aaa");//"aaa".equals(a)这种方法比较好，常量在前，不会发生空指针异常

System.out.println("hello\tworld");
