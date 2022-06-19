
public  class Cat extends Animal{
	private String breed;
	public Cat(){
		//super();
		this("绿色","加菲");//访问有参构造
	};
	public Cat(String color,String breed){
		super(color);
		this.breed=breed;
	};
	
	
	public void setBreed(String breed){
		this.breed=breed;
	}
	public String getBreed(){
		return this.breed;
	}
	public void catchMouse(){
		System.out.println(this.color+"的"+this.breed+"猫正在逮老鼠.....");
	}
}

		