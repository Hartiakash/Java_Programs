package Java_Programs;

import java.util.LinkedHashSet;

public class Dublicate_remove_in_String {
	public static void main(String[] args)
	{
		String str="java";
		LinkedHashSet h1=new LinkedHashSet();
		for(int i=0;i<str.length();i++)
		{
			h1.add(str.charAt(i));
		}
		
		for(Object c:h1)
		{
			System.out.println(c);
		}
	}

}
