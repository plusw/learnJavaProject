## javaSE基础
[int](https://github.com/plusw/learnJavaProject/blob/main/md/int.md)

[String](https://github.com/plusw/learnJavaProject/blob/main/md/String.md)

[StringBuilder](https://github.com/plusw/learnJavaProject/blob/main/md/StringBuilder.md)

[ArrayList](https://github.com/plusw/learnJavaProject/blob/main/md/ArrayList.md)

## javaSE面向对象
[继承](https://github.com/plusw/learnJavaProject/blob/main/md/继承.md)

## 零散知识点

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
