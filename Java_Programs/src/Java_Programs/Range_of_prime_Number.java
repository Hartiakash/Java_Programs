package Java_Programs;

public class Range_of_prime_Number {
	public static void main(String[] args)
	{
		for(int i=2;i<50;i++)
		{
			boolean flag=true;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					flag=false;
					break;
				}
			}
			if(flag)
			{
				System.out.println(i);
			}
		}
		
	}

}
