## TCP
tcp是面向连接的协议，速度较慢，没有大小限制，数据安全  
通过3次握手协议保证连接  
通过4次挥手协议保证连接终止  
#### tcp客户端
```java
Socket socket=new Socket("127.0.0.1",10000);
OutputStream os=socket.getOutputStream();//socket用流写数据
os.write("hello".getBytes());
os.close();//在关流的时候会往服务器写一个结束标记
socket.close();
```
#### tcp服务器端
```java
ServerSocket s=new ServerSocket(10000);//监听10000端口
Socket accept=s.accept();//一直等待接收，会阻塞线程,accept是Socket对象
InputStream is=accept.getInputStream();
int b;
while((b=is.read())!=-1){//read()也是阻塞的
  System.out.print((char)b );
}
is.close();
s.close();
```
