package Java_Programs;

public class Revers_String {
	public static void main(String[] args)
	{
		String str="Level";
		String rev="";
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		System.out.println(rev);
			
	}

}
