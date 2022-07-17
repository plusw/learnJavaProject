import java.util.Objects;
public class Test{
    public static void main(String[] agrs)
    {
		 
		int a=Objects.hash(10,13);
		int a1=Objects.hash(13,10);
		int a2=Objects.hash(10,13);
		System.out.println(a2);
    }
}