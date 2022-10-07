## MyBatis介绍
MyBatis 是一款持久层框架, MyBatis 简化了的JDBC代码, 设置参数和封装结果的工作;  
JDBC缺点：1.硬编码(注册驱动，连接数据库)2.操作繁琐(需要设置参数,手动封装结果);  
MyBatis将硬编码放到配置文件，自动完成操作繁琐的工作;   

## 使用mybatis查询所有
### 1.在数据库中创建表
### 2.根据模块创建项目导入坐标在pom.xml中
### 3.编写mybatis核心配置文件-->替换连接信息，解决硬编码
### 4.编写sql映射文件-->统一管理sql语句,解决硬编码
### 5.测试执行代码
        (1)定义POJO类  
        (2)加载核心配置文件,获取SqlSessionFactory对象  
        (3)获取SqlSession对象，执行SQL语句  
        (4)释放资源  


#### [MyBatis快速入门](https://mybatis.org/mybatis-3/zh/getting-started.html)
1.导入坐标到pom.xml中
```xml
<!-- mybatis -->
        <dependency>
            <groupId>org.mybatis</groupId>
            <artifactId>mybatis</artifactId>
            <version>3.5.5</version>
        </dependency>
<!-- 添加slf4j日志api -->
        <dependency>
            <groupId>org.slf4j</groupId>
            <artifactId>slf4j-api</artifactId>
            <version>1.7.20</version>
        </dependency>
 <!-- 添加logback-classic依赖 -->
        <dependency>
            <groupId>ch.qos.logback</groupId>
            <artifactId>logback-classic</artifactId>
            <version>1.2.3</version>
        </dependency>
  <!-- 添加logback-core依赖 -->
        <dependency>
            <groupId>ch.qos.logback</groupId>
            <artifactId>logback-core</artifactId>
            <version>1.2.3</version>
        </dependency>	
```
2.编写MyBits核心配置文件,用户名，密码等
```xml
<?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE configuration
  PUBLIC "-//mybatis.org//DTD Config 3.0//EN"
  "http://mybatis.org/dtd/mybatis-3-config.dtd">
<configuration>
  <environments default="development">
    <environment id="development">
      <transactionManager type="JDBC"/>
      <dataSource type="POOLED">
        <property name="driver" value="com.mysql.jdbc.Driver"/>
        <property name="url" value="jdbc:mysql:///mybaits?useSSL=false"/>
        <property name="username" value="root"/>
        <property name="password" value="1234"/>
      </dataSource>
    </environment>
  </environments>
  <mappers>
    <!--加载sql映射文件-->
    <mapper resource="org/mybatis/example/BlogMapper.xml"/>
  </mappers>
</configuration>
```
