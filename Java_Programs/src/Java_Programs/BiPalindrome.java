package Java_Programs;

public class BiPalindrome {
	public static void main(String[] args)
	{
		int no=1212;
		String str=String.valueOf(no);
		if(str.charAt(0)!=0 && str.length()%2==0)
		{
			String s1=str.substring(0,str.length()/2);
			String s2=str.substring(str.length()/2);
			if(palidrome(s1)==palidrome(s2))
			{
				System.out.println("Bipalidrome");
			}
			else {
				System.out.println("It is not Bipalidrome");
			}
		}
	}
		static boolean palidrome(String str)
		{
			String rev="";
			for(int i=str.length()-1;i>=0;i--)
			{
				rev=rev+str.charAt(i);
			}
			return rev.equals(str);
		
	}

}
