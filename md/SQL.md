## SQL
#### SQL语法
SQL注释 --或# 进行单行注释   
#### DDL操作数据库,表等
show databases;//查询数据库名称   

create database db1;//创建一个数据库,名字是db1  

create database if not exists db1;//如果数据库不存在就创建  

drop database db2;//删除db2数据库  

drop database if exists db1;//如果db1存在就删除  

use db1;//使用db1数据库  

select database();//查询当前正在使用的数据库

