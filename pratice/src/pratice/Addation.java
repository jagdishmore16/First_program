package pratice;

public class Addation {

	public static void main(String[] args) {
		
		int a = 19;
		int b = 5;
		
		int c = add(a,b);
		System.out.println("The sum of a and b is="+c);
		
		int d = sub(a,b);
		System.out.println("The sum of a and b is="+d);
	}
	public static int add(int n1,int n2)
	{
		int s;
		s = n1 + n2;
		return s;
	}
	public static int sub(int x,int y)
	{
		int a;
		a =x - y;
		return a;
	}
	public static int mul(int b,int u)
	{
		int d;
		d =b * u;
		return d;
	}
}
