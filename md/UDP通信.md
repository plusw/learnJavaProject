## UDP
udp是面向无连接的协议，速度快，有大小限制，最大64kb，但易丢失数据
#### upd发送数据
```java
DatagramSocket ds=new DatagramSocket();//找码头
//DatagramPacket (byte[] buf,int length,InetAddress address,int port)//打包数据的格式
String s="你好，我是007";
byte[] bytes=s.getBytes();
InetAddress address=InetAddress.getByName("127.0.0.1");
int port =10000;
DatagramPacket dp=new DatagramPacket (bytes,bytes.length,address,port);
ds.send(dp);
ds.close();
```
