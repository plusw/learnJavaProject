## SQL
#### SQL语法
SQL注释 --或# 进行单行注释   
#### DDL操作数据库
```mysql
show databases;#查询数据库名称   

create database db1;#创建一个数据库,名字是db1  

create database if not exists db1;#如果数据库不存在就创建  

drop database db2;#删除db2数据库  

drop database if exists db1;#如果db1存在就删除  

use db1;#使用db1数据库  

select database();#查询当前正在使用的数据库
```
#### DDL操作数据库中的表
```
show tables;#显示该数据库下的表  

desc myTable;#查询myTable表的结构  
```
```mysql
create table tb_user(#创建表tb_user  
    -> name varchar(20), #创建表头;字符串类型是varchar(),20表示最大长度,varchar()长度存储长度可变  
    -> id char(8),#char(8)存储长度为定值  
    -> age int,  
    -> score double(5,2),#5表示整体长度，2表示保留2位小数  
    -> birthday data,  
    -> status tinyint # tinyint表示从 0 到 255 的整型数据。存储大小为 1 字节。  
    -> );  
```

