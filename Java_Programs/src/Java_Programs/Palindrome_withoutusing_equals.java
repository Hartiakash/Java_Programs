package Java_Programs;

public class Palindrome_withoutusing_equals {
	public static void main(String[] args)
	{
		String str="level";
		if(palidrome(str))
		{
			System.out.println("it is palindrome");
		}
		else {
			System.out.println("it is not a palindrome");
		}
	}
	public static boolean palidrome(String s) {
		int i=0;
		int j=s.length()-1;
		while(i<j)
		{
			if(s.charAt(i)==s.charAt(j))
			{
				return true;
			}
			i++;
			j--;
		}
		return false;
	}
	

}
