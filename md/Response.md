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
PrintWriter writer=response.getWriter();
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
