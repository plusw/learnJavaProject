## IO流
IO流分为字节流和字符流，字节流可以操作所有文件，字符流只能操作文本文件
##### 创建字节输出流对象,写数据
FileOutputStream fos =new FileOutputStream("D:\\a.txt");//参数以路径创建;如果文件不存在会自动创建

FileOutputStream fos =new FileOutputStream(new File("D:\\a.txt"));//参数以文件创建;

fos.write(97);

fos.close();

##### 写数据的3种方式
byte[] a= {97,98,99};

for.write(a);//参数是byte数组

for.write(97);//参数是int

for.write(a,1,2);//参数有数组，写入的数组起始索引，写入的数组长度


