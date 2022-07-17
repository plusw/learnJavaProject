public class Coder extends Employee{
	Coder(){};
	Coder(String name,int id,double salary){
		super(name,id,salary);
	};
	
	public String work(){
		return "的程序员正在编写代码";
	}
}