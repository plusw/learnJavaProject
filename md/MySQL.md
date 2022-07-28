## MYSQL
#### cmd操作MYSQL的命令
mysqld --initialize-insecure//初始化mysql  

mysqld -install//将mysql安装到windows服务里

net start mysql//cmd启动mysql  

net start mysql//cmd停止运行mysql  

mysqladmin -u root password 1234//修改root用户密码为1234  

mysql -uroot -p//登录mysql  

exit或者quit//退出mysql  

mysql -uroot -p1234 -h127.0.0.1 -P3306 //登录不同电脑上的mysql数据库 -P表示端口号  

mysqld -remove mysql //从服务里删除mysql服务  
