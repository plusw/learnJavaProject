#### 请求数据分为三部分：  
1.请求行  
GET /request-demo/req1?username=zhangsan HTTP/1.1  
```java
String getMethod();//获取请求方式GET  
String getContextPath();//获取项目访问路径/demo1    
StringBuffer getRequestURL();//获取URl  http://localhost:8080/demo1/requ1   
String getRequestURI();//获取URI  /demo1/requ1  
String getQueryString();//获取请求参数 username=wj&password=123  
```
2.请求头  
User_Agent:Mozilla/5.0 Chrome/91.0.4472.106   
```java
//User_Agent表示浏览器信息  
String getHeader(String name):根据请求头名称获取值  
```
3.请求体(只有post才有请求体)  
username=superbaby&&password=123  
```java
ServletInputStream getInputStream();//获取字节输入流  
BuufferedReader getReader();//获取字符输入流
```

#### Request通用方式获取请求参数
```java
Map<String,String[]> getParameterMap();//获取装有所有参数的map集合
String[] getParameterValues(String name);//根据键值获取值(数组)
String getParameter(String name);//根据键值获取单个值
```
#### 请求转发:服务器资源跳转
```java
 req.getRequestDispatcher("资源B路径").forward(req,resp);
 ```
