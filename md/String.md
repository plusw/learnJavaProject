## String 常用方法：

String的toLowerCase方法，将字符串中的字符都转为小写。

String的值创建后不可改变，变的是指向的地址

System.out.println("asd"); //打印String类不会打印其地址

以""创建的字符串，会先在字符串常量池中寻找,没有则会创建（有且仅有一个）

String x="ab";
System.out.println("abc"==x +"c")//为false 因为生成的字符串是在堆内存中，不在堆中的常量池里

System.out.println("abc"=="a"+"b" +"c"); //为true，java有常量优化机制,三个常量加会自动拼接成"abc"

a.equals(b)//equals比较的是内容,==比较的是地址

a.equalsIgnoreCase(b)//忽略大小写

a.charAt(5);//返回字符串索引5处的字符

a.toCharArray();//返回字符数组

a.subString(2);//字符串截取2到末尾

a.subString(2,4);//字符串截取2到4

a.replace("old","new");//字符串替换

a.split(',');//以","切割字符串为字符串数组

String a="asdf"; a.equals("aaa");//"aaa".equals(a)这种方法比较好，常量在前，不会发生空指针异常
