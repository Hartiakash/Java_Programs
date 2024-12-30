package Java_Programs;

public class Next_Prime_Number {
	public static void main(String[] args)
	{
		int no=12;
		for(int i=no;i<=100;i++)
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
			break;
			}
		}
	}

}
