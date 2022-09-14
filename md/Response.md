```java
String contextPath=request.getContextPath();//动态获取项目目录
```
#### 设置响应数据
```java
//设置响应状态码
void setStatus(int sc);
//设置响应头键值对
void setHeader(String name,String value)
//设置响应体
PrintWriter getWriter();//获取字符输出流
ServletOutputSteam getOutputStream();//获取字节输出流
//设置字符数据的响应体
//response.setHeader("content-type","text/html");
response.setContentType("text/html;charset=utf-8");
PrintWriter writer=response.getWriter();
writer.write("aaa");
writer.write("<h1>你好</h1>");
```
#### 重定向
```java
//重定向响应状态码是302
//实现重定向,重定向会使地址栏发生变化
resp.setStatus(302);
resp.setHeader("location","资源B的路径");
//通过简化方式实现重定向
response.sendRedirect()"资源B的路径");
```
#### 通过字节输出流设置响应体
```java
//方法1，使用流输出
FileInputStream fis=new FileInputStream("d://a.jpg");//读取文件
ServletOutputStream os  =response.getOutputStream();//获取字节输出流，赋值给ServletOutputStream
byte[] buff=new byte[1024];
int len=0;
while((len=fis.read(buff)!=-1){
  os.write(buff,0,len);  
}
fis.close();
//方法2,用流的copy
FileInputStream fis=new FileInputStream("d://a.jpg");//读取文件
ServletOutputStream os  =response.getOutputStream();//获取字节输出流，赋值给ServletOutputStream
IOUtils.copy(fis,os);
fis.close();
```
#### IOUtils工具类的使用
1.导入坐标
```xml
<dependency>
  <groupld>commons-io</groupld>
  <artifactld>commons-io</artifactld>
  <version>2.6</version2.6>
 </dependency> 
```
2.使用IOUtils.copy(输入流,输出流);
