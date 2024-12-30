package Java_Programs;

public class Integer_To_Bineary {
	public static void main(String[] args)
	{
		int no=6;
		String result="";
		
		while(no!=0)
		{
			int rem=no%2;
			result=rem+result;
			no=no/2;
		}
		System.out.println(result);
	}

}
