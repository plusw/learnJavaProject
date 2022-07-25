## TCP
tcp是面向连接的协议，速度较慢，没有大小限制，数据安全
#### tcp客户端
```java
Socket socket=new Socket("127.0.0.1",10000);
OutputStream os=socket.getOutputStream();//socket用流写数据
os.write("hello".getBytes());
os.close();
socket.close();
```
### tcp服务器端
```java
ServerSocket s=new ServerSocket(10000);//监听10000端口
Socket accept=s.accept();//一直等待接收，会阻塞线程,accept是Socket对象
InputStream is=accept.getInputStream();
int b;
while((b=is.read())!=-1){
  System.out.print((char)b );
}
is.close();
s.close();
```
