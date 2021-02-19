/* Method Overloading is defined as when a class has same method names but different parameters. */

class casio{
	public void add(int i, int j) 
	{
		System.out.println(i + j);
	}
	
	public void add(int i , int j , int k)
	{
		System.out.println(i + j + k);
	}
	
	public void add(double i , double j)
	{
		System.out.println(i + j);
	}
	
}

public class Day{
public static void main(String[] args)
{
	casio obj = new casio();
	
	obj.add(7, 8); 
	
	obj.add(9,8,10);
	
	obj.add(9.0,8.8);
}

}
