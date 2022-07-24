#### 创建Properties集合
Properties prop = new Properties();
#### 添加元素
prop.put("迪迦","奥特曼");//前面是键，后面是值，键不能重复  
prop.put("赛文","奥特曼");  
prop.put("哥斯拉","怪兽");//如果键不存在就添加元素,如果键存在，就覆盖  
System.out.println(prop);  
#### 删除元素
prop.remove("赛文");//删除元素
#### 根据key获得value
System.out.println(prop.get("迪迦"));//打印奥特曼
#### 遍历获取所有键值
Set<Object> keys=prop.keySet();    
for(Object key:keys){  
   Object value=prop.get(key);  
   System.out.println(key);  
};
#### 获取所有键值对
Set<Map.Entry<Object,object>> entries keys=prop.entrySet();     
for(Map.Entry<Object,Object>entry:entries){    
   Object key =entry.getKey(); 
   Object value=entry.getValue();
   System.out.println(key+":"+value);  
} 


