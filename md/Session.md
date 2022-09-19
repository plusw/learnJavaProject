## Session
1.设置Session
```java
HttpSession session =request.getSession();
session.setAttribute("username","zs");
session.removeAttribute("username");//移除Session中的"username"
```
2.获取Session
```java
HttpSession session=request.getSession();
Object username=session.getAttribute("username");
System.out.println(username);
```
3.session活化钝化  
服务器关闭时，session会以文件形式保存在服务器上，服务器开启后，session重新加载进服务器，并删除文件  
4.session销毁
默认情况下，session30分钟自动销毁 
设置session销毁时间
```java
<session-config>
  <session-timeout>100</session-timeout>  
</session-config>
```
