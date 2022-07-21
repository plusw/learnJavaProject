## IO流
IO流分为字节流和字符流，字节流可以操作所有文件，字符流只能操作文本文件
#### 创建字节输出流对象,写数据
FileOutputStream fos =new FileOutputStream("D:\\a.txt");//参数以路径创建;如果文件不存在会自动创建

FileOutputStream fos =new FileOutputStream(new File("D:\\a.txt"));//参数以文件创建;

fos.write(97);

fos.close();

#### 写数据的3种方式
byte[] a= {97,98,99};

for.write(a);//参数是byte数组

for.write(97);//参数是int

for.write(a,1,2);//参数有数组，写入的数组起始索引，写入的数组长度

#### 字节流写数据换行
windows换行符:\r\n

linux:\n

mac:\r

fos.write("\r\n".getBytes());//换行

#### 追加写入
FileOutputStream fos =new FileOutputStream("D:\\a.txt"，true);//第二个参数为true表示打开续写开关

#### 创建字节输入流对象
FileInputStream fis =new FileInputStream("D:\\a.txt");//参数以路径

FileInputStream fis =new FileInputStream(new File("D:\\a.txt"));//参数以File

int a=fis.read();//运行一次，往下读取一个字节,a为编码表中的int值

#### 文件拷贝
int read;
while((read=fis.read())!=-1){
  fos.write(read); //一个一个读取写入比较慢
}

#### 文件拷贝，利用字节数组提升拷贝速度
byte[] bys=new Byte[1024];

int len;

while((len=fis.read(bys))!=-1){//len返回读到有效字节的个数,同时改变bys数组里的值

  fos.write(bys,0,len);
  
}

#### 缓冲流拷贝文件
BufferedInputStream bis = new BufferedInputStream(new FileInputStream("F:\\a.txt"));//创建字节缓冲输入流  
BufferedOutputStream bos = new BufferedOutputStream(new FileInputStream("F:\\b.txt")); //创建字节缓冲输出流  
int c;   
while((c=bis.read())!=-1){    
  bos.write(b);  
}  

#### 缓冲流+数组拷贝文件
BufferedInputStream bis = new BufferedInputStream(new FileInputStream("F:\\a.txt"));//创建字节缓冲输入流  
BufferedOutputStream bos = new BufferedOutputStream(new FileInputStream("F:\\b.txt")); //创建字节缓冲输出流  
byte[] bys=new byte[1024];   
int len;  
while((len=bis.read(bys))!=-1){    
  bos.write(bys,0,len);    
}   
