/*
定义手机类，手机有品牌(brand),价格(price)和颜色(color)三个属性，有打电话call()和sendMessage()两个功能。

请定义出手机类，类中要有set/get方法。

定义测试类，在主方法中使用空参构造创建对象，使用set方法赋值。

调用对象的两个功能，打印效果如下：

```
正在使用价格为3998元黑色的小米手机打电话....
正在使用价格为3998元黑色的小米手机发短信....
```

### 训练提示

1. 类中的属性就是成员变量，类中的行为功能就是成员方法。
2. 成员变量要被private修饰。

### 解题方案

### 操作步骤

1. 定义手机类，手机类中定义String类型的品牌，int类型的价格，String类型的颜色，三个成员变量都用privice修饰。
2. 提供set/get方法。
3. 编写打电话的成员方法，方法中对成员变量进行使用。
4. 编写发短信的成员方法，方法中对成员变量进行使用。
5. 在测试类中创建手机对象，使用set方法赋值，分别调用各个方法。
*/
public  class Phone{
	private String brand;
	private double price;
	private String color;
	public Phone(){};
	
	public void setBrand(String brand){
		this.brand=brand;
	}
	public String getBrand(){
		return this.brand;
	}
	
	public void setColor(String color){
		this.color=color;
	}
	public String getColor(){
		return this.color;
	}
	
	public void setPrice(double price){
		this.price=price;
	}
	public double getPrice(){
		return this.price;
	}
	
	public void call(){
		System.out.println("正在使用价格为"+(int)this.price+"元"+this.color+"的"+this.brand+"手机打电话....");
	}
	public void sendMessage(){
		System.out.println("正在使用价格为"+(int)this.price+"元"+this.color+"的"+this.brand+"手机发短信....");
	}	
}

		