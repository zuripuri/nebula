package Zuriel;

public class gitTest {
	static int add(int x, int y) {
		int z=x+y;
		return z;
	}
	static int mul(int a, int b, int c) {
		int d=a*b*c;
		return d;
	}
	static int div(int x, int a) {
		int i=x/a;
		return i;
	}
	public static void main(String args[])
	{
		int x=1,y=2,a=3,b=4,c=5;
		System.out.println(add(x,y));
		System.out.println(mul(a,b,c));
		System.out.println(div(x,a));
	}
}
