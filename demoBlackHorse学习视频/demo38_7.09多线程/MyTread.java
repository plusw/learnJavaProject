public class MyTread extends Thread{ 
	@Override
	public void run(){
		for(int i=0;i<100;i++){
			System.out.println(super.getName()+"执行了"+i);
		}
	}
}