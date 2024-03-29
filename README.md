## javaSE  :apple:
[int](https://github.com/plusw/learnJavaProject/blob/main/md/int.md)&emsp;&emsp;&emsp;&emsp;[String](https://github.com/plusw/learnJavaProject/blob/main/md/String.md)&emsp;&emsp;&emsp;&emsp;[StringBuilder](https://github.com/plusw/learnJavaProject/blob/main/md/StringBuilder.md)&emsp;&emsp;&emsp;&emsp;[ArrayList](https://github.com/plusw/learnJavaProject/blob/main/md/ArrayList集合.md)&emsp;&emsp;&emsp;&emsp;[for循环](https://github.com/plusw/learnJavaProject/blob/main/md/for循环.md)&emsp;&emsp;&emsp;[数组](https://github.com/plusw/learnJavaProject/blob/main/md/数组.md)

## javaSE  :whale:
[继承](https://github.com/plusw/learnJavaProject/blob/main/md/继承.md)&emsp;&emsp;&emsp;&emsp;[static关键字](https://github.com/plusw/learnJavaProject/blob/main/md/static.md)&emsp;&emsp;&emsp;&emsp;[IO流](https://github.com/plusw/learnJavaProject/blob/main/md/IO流.md)&emsp;&emsp;&emsp;&emsp;[HashMap](https://github.com/plusw/learnJavaProject/blob/main/md/HashMap.md)&emsp;&emsp;&emsp;&emsp;[File](https://github.com/plusw/learnJavaProject/blob/main/md/File.md)&emsp;&emsp;&emsp;&emsp;[Properties集合](https://github.com/plusw/learnJavaProject/blob/main/md/Properties集合.md)&emsp;&emsp;&emsp;&emsp;[Stream流](https://github.com/plusw/learnJavaProject/blob/main/md/Stream流.md)&emsp;&emsp;&emsp;&emsp;&emsp;[字符流和编码格式](https://github.com/plusw/learnJavaProject/blob/main/md/字符和编码格式.md)&emsp;&emsp;&emsp;&emsp;[字符缓冲流](https://github.com/plusw/learnJavaProject/blob/main/md/字符缓冲流.md)&emsp;&emsp;&emsp;&emsp;[对象操作流](https://github.com/plusw/learnJavaProject/blob/main/md/对象操作流.md)&emsp;&emsp;&emsp;&emsp;[转换流](https://github.com/plusw/learnJavaProject/blob/main/md/转换流.md)&emsp;&emsp;&emsp;&emsp;[创建多线程](https://github.com/plusw/learnJavaProject/blob/main/md/创建多线程.md)&emsp;&emsp;&emsp;[多线程常用方法](https://github.com/plusw/learnJavaProject/blob/main/md/多线程的常用方法.md)&emsp;&emsp;&emsp;

## javaWeb :dolphin:
 [MYSQL](https://github.com/plusw/learnJavaProject/blob/main/md/MYSQL.md)&emsp;&emsp;&emsp;
 [MAVEN](https://github.com/plusw/learnJavaProject/blob/main/md/MAVEN.md)&emsp;&emsp;&emsp;
 [SQL](https://github.com/plusw/learnJavaProject/blob/main/md/SQL.md)&emsp;&emsp;&emsp;
 [JDBC](https://github.com/plusw/learnJavaProject/blob/main/md/JDBC.md)&emsp;&emsp;&emsp;
 [Servlet](https://github.com/plusw/learnJavaProject/blob/main/md/Servlet.md)&emsp;&emsp;&emsp;
 [Request](https://github.com/plusw/learnJavaProject/blob/main/md/Request.md)&emsp;&emsp;&emsp;
 [Response](https://github.com/plusw/learnJavaProject/blob/main/md/Response.md)&emsp;&emsp;&emsp;
 [MyBatis](https://github.com/plusw/learnJavaProject/blob/main/md/MyBatis.md)&emsp;&emsp;&emsp;
 [Cookie](https://github.com/plusw/learnJavaProject/blob/main/md/Cookie.md)&emsp;&emsp;&emsp;
 [Session](https://github.com/plusw/learnJavaProject/blob/main/md/Session.md)&emsp;&emsp;&emsp;
 [MyBatis实例](https://github.com/plusw/learnJavaProject/blob/main/md/MyBatis实例.md)&emsp;&emsp;&emsp;
 [Web综合案例](https://github.com/plusw/learnJavaProject/blob/main/md/Web综合案例.md)&emsp;&emsp;&emsp;
 [AJAX](https://github.com/plusw/learnJavaProject/blob/main/md/AJAX.md)&emsp;&emsp;&emsp;
## QUESTION  :bug:
[QUESTION](https://github.com/plusw/learnJavaProject/blob/main/md/question.md)

## 零散知识点 

端口号取值为0-65535,0~1023用于常用的网络服务

类有个隐藏的序列号，serialVerSionUID,是虚拟机根据类的信息自动计算出来的,如果类中的信息有所改变，序列号也会改变
对象的序列号可以自己手动给出:  
private static final long serialVersionUID=1L;//可以保证序列号不被改变

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

System.currentTimeMillis();//获取1970年1月1日0时0分0秒以来的毫秒数

System.out.println("hello\tworld");

final修饰的变量只能赋值一次。

final 修饰的方法不能被重写

常量命名规范：所有字母大写

System.err.peintln("hello");//显示红色字符串

GBK是中国的码表，包含中文，一个中文以两个字节进行存储，但不包括世界上大多数语言

unicode是万国码，以utf-8编码后以3个字节进行存储
