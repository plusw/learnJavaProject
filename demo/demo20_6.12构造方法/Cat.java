
public  class Cat{
	int age;
	String name;
	//构造方法可以重载
	public Cat(){};
	public Cat(int age,String name){
		this.age=age;
		this.name=name;
	}
	public void show(){
		System.out.println("小猫的名字是"+this.name+"，年龄是"+this.age);
	}
		
}

		