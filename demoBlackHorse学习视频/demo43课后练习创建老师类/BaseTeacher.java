public class BaseTeacher extends Teacher{
	BaseTeacher(){};
	BaseTeacher(String name,int age){
		super(name,age);
	};
	
	public void teach(){
		System.out.println("基础班老师讲JavaSE");
	}
}