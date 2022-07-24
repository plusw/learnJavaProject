#### 创建Properties集合
Properties prop = new Properties();
#### 添加元素
prop.put("迪迦","奥特曼");//前面是键，后面是值，键不能重复  
prop.put("赛文","奥特曼");  
prop.put("哥斯拉","怪兽");//如果键不存在就添加元素,如果键存在，就覆盖
prop.setProperty("泰罗","奥特曼");//setProperty()也可以添加元素  
System.out.println(prop);  
#### 删除元素
prop.remove("赛文");//删除元素
#### 根据key获得value
System.out.println(prop.get("迪迦"));//打印奥特曼
System.out.println(prop.getProperty("迪迦"));//另一种根据key获取value的方法
#### 获取所有键值
##### keySet()获得键值
Set<Object> keys=prop.keySet();    
for(Object key:keys){  
   Object value=prop.get(key);  //获取value  
   System.out.println(key);  
};
##### stringPropertyNames()获取键值
Set<String> keys=prop.stringPropertyNames();  
for(String key:keys){    
   String value=prop.getProperty(key);  
   System.out.println(key+"="+value);  
};  
#### 获取所有键值对
Set<Map.Entry<Object,object>> entries keys=prop.entrySet();      
for(Map.Entry<Object,Object>entry:entries){    
   Object key =entry.getKey();   
   Object value=entry.getValue();  
   System.out.println(key+":"+value);    
} 
#### 读取后缀名为properties文件(文件中存储的是键值对)
Properties prop=new Properties();  
FileReader fr=new FileReader("prop.properties");  
prop.load(fr);//集合加载文件中的数据  
fr.close();
System.out.println(prop);

