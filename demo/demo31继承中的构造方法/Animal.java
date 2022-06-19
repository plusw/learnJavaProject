public class Animal{
	public String color;
	/*public Animal(){
		System.out.println("Animal空参构造方法");
	};
	*/
	public Animal(String color){
		System.out.println("Animal的有参构造方法");
		this.color=color;
	};
	
	public void setColor(String Color){
		this.color=color;
	}
	public String getColor(){
		return this.color;
	}
	
	
	
	
	public void eat(){
		System.out.println("正在吃");
	}
	
}
