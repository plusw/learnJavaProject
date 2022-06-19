
public  class Cat extends Animal{
	private String breed;
	public Cat(){};
	public Cat(String breed){
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

		