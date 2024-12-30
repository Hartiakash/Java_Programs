package Java_Programs;

public class Palindrome {
	public static void main(String[] args)
	{
		String str="Level";
		String rev="";
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		if(str.equalsIgnoreCase(rev))  //equals
		{
			System.out.println(str+" It is Palindrome");
		}
		else {
			System.out.println("It is not Palindrome");
		}
	}

}
