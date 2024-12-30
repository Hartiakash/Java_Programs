package Java_Programs;

public class Print_Vowels {
	public static void main(String[] args)
	{
		String str="level";
		char[] c=str.toCharArray();
		for(int r=0;r<c.length;r++)
		{
			if(c[r]=='a' || c[r]=='e' || c[r]=='i' || c[r]=='o' || c[r]=='u')
			{
				System.out.println(c[r]);
			}
		}	
	}
}
