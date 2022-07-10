import java.util.HashSet;
public class Test 
{
    
    public static void main(String[] agrs)
    {
        HashSet<int[]> location=new HashSet<>();
		int[] a=new int[2];
		a[0]=1;
		a[1]=2;
		location.add(a);
		System.out.println(a.hashCode());
		a[0]=2;
		a[1]=7;
		location.add(a);
		System.out.println(a.hashCode());
		for(int[] b: location){
			System.out.println(b[0]);
			System.out.println(b[1]);
		}
    }
}