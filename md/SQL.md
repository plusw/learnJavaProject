## SQL
#### SQL语法
SQL注释 --或# 进行单行注释   
#### DDL操作数据库
```mysql
show databases;#查询数据库名称   

create database db1;#创建一个数据库,名字是db1  

create database dbtest2 character set utf8;#创建一个数据库,以utf8格式进行编码

create database if not exists db1;#如果数据库不存在就创建  

drop database db2;#删除db2数据库  

drop database if exists db1;#如果db1存在就删除  

use db1;#使用db1数据库  

select database();#查询当前正在使用的数据库
```
#### DDL操作数据库中的表
```mysql
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
```mysql
drop table tb_user;#删除表  

drop table if exists tb_users;#如果表存在就删除  

alter table tb_user rename to tb;#将表的名字tb_user修改为tb  

alter table tb add id char(8);#在表中添加新的一列  

alter table tb modify id varchar(8);#修改id的数据类型  

alter table tb change id idcard char(18);#修改id的名字和数据类型  

alter table tb drop name;#删除tb表中的name
```
#### DML操作数据
```mysql
SELECT * FROM tb_user;#查询表中所有数据

INSERT  INTO tb_user(NAME,age,id) VALUES('王佳',23,007);#表中添加数据

INSERT  INTO tb_user VALUES('王嘉佳',23,007);#给所有行添加数据，列名可以省略

INSERT  INTO tb_user VALUES('王嘉佳',23,007),('李昌钰',23,007),('柯文哲',23,007);#批量添加数据

UPDATE tb_user SET id = '119' WHERE NAME='柯文哲';#修改表中数据

ELETE FROM tb_user WHERE NAME='王佳';#删除表中数据
```
#### 约束
```mysql
CREATE TABLE tb2(
id INT PRIMARY KEY auto_increment, --id主键且自增长
NAME VARCHAR(20) NOT NULL UNIQUE, --员工姓名，非空且唯一
bonus DOUBLE(7,2) DEFAULT 0 --奖金默认为0
);

#外键约束
CREATE TABLE dept2(
id INT PRIMARY KEY, 
dep_name VARCHAR(20) 
);

CREATE TABLE emp3(
id INT PRIMARY KEY, 
NAME VARCHAR(20) NOT NULL UNIQUE, 
dept_id INT,
CONSTRAINT fk_emp3_dept FOREIGN KEY(dept_id) REFERENCES dept2(id)#建立两张表之间的外键约束
);

ALTER TABLE emp3 DROP FOREIGN KEY fk_emp3_dept;#删除外键

ALTER TABLE emp add constraint fk_emp_empt foreign key(dept_id) references dept(id);#建完表后,添加外键
```
#### 多表查询
```mysql
select * from emp,dept;#这样查询两个表会产生笛卡尔积:有A,B两张表所有的组合情况

select * from emp,dept where emp.dep_id=dept.did;#这样查询两张表可以过滤一些不合理的情况

select emp.name,emp.gender,dept.dname from emp,dept where emp.dep_id=dept.did;#查询两张表中的特定的值

select * from emp inner join dept on emp.dep_id=dept.did;#显示内连接查询表(查询两张表的交集)

select * from emp join dept on emp.dep_id=dept.did;#显示内连接查询表,inner可以省略
```


