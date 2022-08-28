## jdbc连接并操作数据库
```java
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
public class Test{
	public static void main(String[] args) throws Exception{
		//注册驱动
		Class.forName("com.mysql.jdbc.Driver");
		//获取连接
		String url="jdbc:mysql://127.0.0.1:3306/db1";
		String username="root";
		String password="1234";
		Connection conn=DriverManager.getConnection(url,username,password);
		//定义sql
		String sql="update tb_user set age = 2000 where id = 1";
		//创建执行sql的对象Statement
		Statement stmt=conn.createStatement();
		//执行sql
		int count=stmt.executeUpdate(sql);//受影响的行数
		
		
		System.out.println(count);
		stmt.close();
		conn.close();
	}
}
```
