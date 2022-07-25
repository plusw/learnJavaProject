## UDP
udp是面向无连接的协议，速度快，有大小限制，最大64kb，但易丢失数据
#### upd发送数据
```java
DatagramSocket ds=new DatagramSocket();//找码头,用于发送数据
//DatagramPacket (byte[] buf,int length,InetAddress address,int port)//打包数据的格式
String s="你好，我是007";
byte[] bytes=s.getBytes();
InetAddress address=InetAddress.getByName("127.0.0.1");
int port =10000;
DatagramPacket dp=new DatagramPacket (bytes,bytes.length,address,port);
ds.send(dp);
ds.close();
```
#### udp接收数据
```java
DatagramSocket ds=new DatagramSocket(10000);//找码头，表示从10000端口接收数据
//创建一个新的箱子
byte[] bytes=new byte[1024];
DatagramPacket dp=new DatagramPacket(bytes,bytes.length);
//接收数据，并把数据放到新的箱子里
ds.receive(dp);
//从箱子里拿出数据
byte[] data=dp.getData();
System.out.println(new String(data));
//释放资源
ds.close();
```
#### udp三种通信方式
##### 单播
一个发送端发送给一个接收端   
##### 组播
一个发送端发送给多个接收端
组播地址  
224.0.0.0~239.255.255.255  
其中224.0.0.0~224.0.0.255为系统预留的组播地址  

组播代码实现
```

##### 广播
一个发送端发送给所有接收端
