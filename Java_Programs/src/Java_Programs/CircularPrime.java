package Java_Programs;

public class CircularPrime {
	public static void main(String[] args)
	{
		int no=113;
		
		if(circularprime(no))
		{
			System.out.println("it is circular prime number");
		}
		else {
			System.out.println("it is not circular peime number");
		}
	}
	public static boolean circularprime(int no)
	{
		String str=String.valueOf(no);
		
		for(int i=0;i<str.length();i++)
		{
			if(!prime(Integer.parseInt(str)))
			{
				return false;
			}
			str=str.substring(1)+str.charAt(0);
		}
		return true;
	}
	public static boolean prime(int no)
	{
		for(int i=2;i<no/2;i++)
		{
			if(no%i==0)
			{
				return false;
			}
		}
		return true;
	}

}
