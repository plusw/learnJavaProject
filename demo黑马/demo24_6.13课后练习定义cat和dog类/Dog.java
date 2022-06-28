/*
定义猫类Cat。属性:毛的颜色color，品种breed。行为:吃饭eat()，抓老鼠catchMouse()
定义狗类Dog。属性:毛的颜色color，品种breed。行为:吃饭()，看家lookHome()
要求:
      1.按照以上要求定义Cat类和Dog类,属性要私有set和get方法
      2.定义测试类,在main方法中创建该类的对象并给属性赋值(set方法或有参构造方法)
      3.调用成员方法,打印格式如下:

```
花色的波斯猫正在吃鱼.....
花色的波斯猫正在逮老鼠....
黑色的藏獒正在啃骨头.....
黑色的藏獒正在看家.....
```

### 训练提示

1. 类中的属性就是成员变量，类中的行为功能就是成员方法。
2. 成员变量要被private修饰。

### 解题方案

### 操作步骤

1. 定义猫类，定义成员变量，set和get方法，吃饭方法eat()，抓老鼠方法catchMouse()，方法中根据题目给出的格式输出成员变量的值。
2. 定义狗类，定义成员变量，set和get方法，吃饭方法eat()，看家方法lookHome()，方法中根据题目给出的格式输出成员变量的值。
3. 在测试类中使用有参构造创建猫类对象，调用eat()方法和catchMouse()方法。
4. 在测试类中使用有参构造创建狗类对象，调用eat()方法和lookHome()方法。
*/
public  class Dog{
	private String color;
	private String breed;
	public Dog(){};
	public Dog(String color,String breed){
		this.color=color;
		this.breed=breed;
	};
	
	public void setColor(String Color){
		this.color=color;
	}
	public String getColor(){
		return this.color;
	}
	
	public void setBreed(String breed){
		this.breed=breed;
	}
	public String getBreed(){
		return this.breed;
	}
	
	
	
	
	public void eat(){
		System.out.println(this.color+"的"+this.breed+"正在啃骨头.....");
	}
	public void lookHome(){
		System.out.println(this.color+"的"+this.breed+"正在看家.....");
	}
}

		