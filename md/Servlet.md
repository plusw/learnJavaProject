## Servlet
#### 导入Servlet依赖坐标
```xml
<dependencies>
        <dependency>
            <groupId>javax.servlet</groupId>
            <artifactId>javax.servlet-api</artifactId>
            <version>3.1.0</version>
            <scope>provided</scope>
        </dependency>
</dependencies>
```
#### 定义一个类继承servlet接口
```java
public class ServletDemo1 implements Servlet {


    @Override//每一次servlet被访问时调用
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.println("servlet hello world~");
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }

    @Override
    public void init(ServletConfig config) throws ServletException {//init 在servlet被创建时会调用一次

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }
}
```
#### servlet生命周期
```java
@WebServlet(urlPatterns="/demo",loadOnStartup=1);//loadOnStartup为负整数：第一次被访问时创建Servlet对象;
0或正整数服务器启动时创建对象，数字越小优先级越高
```
