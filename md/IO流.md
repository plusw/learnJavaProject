## IO流
IO流分为字节流和字符流，字节流可以操作所有文件，字符流只能操作文本文件
##### 创建字节输出流对象
FileOutputStream fos =new FileOutputStream("D:\\a.txt")//参数以路径创建;
FileOutputStream fos =new FileOutputStream(new File("D:\\a.txt"))//参数以文件创建;
