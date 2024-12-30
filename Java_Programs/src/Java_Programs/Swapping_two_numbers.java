package Java_Programs;

public class Swapping_two_numbers {
	public static void main(String[] args)
	{
		int a=10;
		int b=20;
		int c=a+b;
		a=c-a;
		b=c-b;
		System.out.println(a+"  "+b);
		
		
		int d=40;
		int e=50;
		d=d+e;
		e=d-e;
		d=d-e;
		
		System.out.println(d+" "+e);
	}

}
