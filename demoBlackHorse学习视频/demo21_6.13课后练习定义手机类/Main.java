public class Main{
	public static void main(String[] args){
		Phone myPhone=new Phone();
		myPhone.setBrand("小米");
		myPhone.setPrice(3998);
		myPhone.setColor("黑色");
		
		myPhone.call();
		myPhone.sendMessage();
	}
}
	