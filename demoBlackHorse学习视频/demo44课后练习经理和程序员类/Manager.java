public class Manager extends Employee{
	double bonus;
	Manager(){};
	Manager(String name,int id,double salary,double bonus){
		super(name,id,salary);
		this.bonus=bonus;
	};
	
	public String work(){
		return "的项目经理正在管理程序员写代码";
	}
}