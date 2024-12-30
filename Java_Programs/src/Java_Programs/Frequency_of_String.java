package Java_Programs;

public class Frequency_of_String {
	public static void main(String[] args)
	{
		String str="aaccdd";
		int[] c=new int[123];
		
		for(int i=0;i<str.length();i++)
		{
			char c1=str.charAt(i);
			
			c[c1]++;
		}
		for(int i=0;i<c.length;i++) {
			if(c[i]!=0)
			{
				System.out.println((char)i+" "+c[i]);
			}
		}
		
	}

}
