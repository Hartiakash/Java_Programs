package Java_Programs;

public class Prime_Number {
	public static void main(String[] args)
	{
		int no=7;
		boolean flag=true;
		for(int i=2;i<no;i++)
		{
			if(no%i==0)
			{
				flag=false;
				break;
			}
		}
		if(flag)
		{
			System.out.println("it is prime number");
		}
		else {
			System.out.println("It is not prime number");
		}
	}

}
