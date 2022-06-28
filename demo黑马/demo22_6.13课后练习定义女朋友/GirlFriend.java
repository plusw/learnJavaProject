/*
定义一个女朋友类。女朋友的属性包含：姓名，身高，体重。行为包含：洗衣服wash()，做饭cook()。另外定义一个用于展示三个属性值的show()方法。
请在测试类中创建对象并赋值，然后分别调用展示方法、洗衣服方法和做饭方法。打印效果如下：

```
我女朋友叫凤姐,身高155.0厘米,体重130.0斤
女朋友帮我洗衣服
女朋友给我做饭
```

### 训练提示

1. 类中的属性就是成员变量，类中的行为功能就是成员方法。
2. 成员变量要被private修饰。
3. 展示方法的作用就是打印姓名、身高、体重三个成员变量的值。

### 解题方案

### 操作步骤

1. 定义女朋友类，定义String类型姓名，double类型身高和double类型体重三个成员变量，三个成员变量都用privice修饰。
2. 提供set/get方法。
3. 编写展示方法show()，方法打印三个成员变量的值。
4. 编写洗衣服wash()方法，输出洗衣服的语句。
5. 编写做饭cook()方法，输出做饭的语句。
6. 在测试类中创建女友对象并赋值，分别调用各个方法。
*/
public  class GirlFriend{
	private String name;
	private double height;
	private double weight;
	public GirlFriend(){};
	
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return this.name;
	}
	
	public void setHeight(double height){
		this.height=height;
	}
	public double getHeight(){
		return this.height;
	}
	
	public void setWeight(double weight){
		this.weight=weight;
	}
	public double getWeight(){
		return this.weight;
	}
	
	public void show(){
		System.out.println("我女朋友叫"+this.name+",身高"+this.height+"厘米,体重"+this.weight+"斤");
	}
	public void wash(){
		System.out.println("女朋友帮我洗衣服");
	}
	public void cook(){
		System.out.println("女朋友给我做饭");
	}	
}

		