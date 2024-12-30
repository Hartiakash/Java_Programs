package Java_Programs;

public class Revers_String_withoutusing_CharAt {
	public static void main(String[] args)
	{
		String str="Level";
		String rev="";
		
		char[] c=str.toCharArray();
		for(int i=c.length-1;i>=0;i--)
		{
			rev=rev+c[i];
		}
		System.out.println(rev);
		
	}
}
