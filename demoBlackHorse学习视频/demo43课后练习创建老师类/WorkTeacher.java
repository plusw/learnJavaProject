public class WorkTeacher extends Teacher{
	WorkTeacher(){};
	WorkTeacher(String name,int age){
		super(name,age);
	};
	
	public void teach(){
		System.out.println("就业班老师讲JavaEE		");
	}
}