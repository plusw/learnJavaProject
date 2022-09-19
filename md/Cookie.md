## Cookie
#### 发送Cookie
1.创建Cookie对象,发送Cookie
```java
Cookie cookie = new Cookie("username","lisi	");
```
2.设置Cookie存活时间
```java
cookie.setMaxAge(10*60*24*60); //10天
```
3.Cookie中文乱码问题
```
String value="李四";
value=URLEncoder.encode(value,"UTF-8");//将中文转换为utf-8编码,再传入Cookie
System.out.println(value);
Cookie cookie = new Cookie("username",value);
```
#### 请求Cookie
1. 获取Cookie数组  
```java
Cookie[] cookies= request.getCookies();
```
2.遍历Cookie数组，找到想要的键值  
```java
for(Cookie cookie:cookies){
			String name=cookie.getName();
			if("username".equals(name)){
				String value=cookie.getValue();
				System.out.println(name+"___"+value);
				break;
			}
		}
```
3.解码value是中文  
```java
String value=cookie.getValue();
value=URLDecoder.decode(value,"UTF-8");
```
