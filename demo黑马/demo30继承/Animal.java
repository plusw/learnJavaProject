public class Animal{
	public String color;
	public Animal(){};
	public Animal(String color){
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
