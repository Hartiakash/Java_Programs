package Java_Programs;

import java.util.TreeSet;

public class Panagram {
	public static void main(String[] args)
	{
		
		String str="Glib jocks quiz nymph to vex dwarf";
		TreeSet t1=new TreeSet();
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch!=' ')
			{
				t1.add(ch);
			}
		}
		if(t1.size()==26)
		{
			System.out.println("it is panagram");
		}
		else {
			System.out.println("it is not panagram");
		}
		
		
	}

}
