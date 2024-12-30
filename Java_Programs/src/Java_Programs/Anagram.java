package Java_Programs;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args)
	{
		String str="care";
		String str1="race";
		if(str.length()==str1.length()) {
			char[] c1=str.toCharArray();
			char[] c2=str1.toCharArray();
			
			Arrays.sort(c1);
			Arrays.sort(c2);
			
			if(Arrays.equals(c1, c2))
			{
				System.out.println("It is Anagram");
			}
			else {
				System.out.println("It is not Anagram");
			}
		}
	}

}
