package Java_Programs;

public class Remove_Adjecent_words {
	public static void main(String[] args)
	{
		String str="Hello Hello Hi Hi Hello Hi Hello Hello Hello";
		String[] s=str.split(" ");
		for(int i=0;i<s.length-1;i=i+2)
		{
			if(Adjecent(s[i],s[i+1]))
			{
				System.out.println(s[i]);
			}
		}
		System.out.println(s[s.length-1]);
	}
	public static boolean Adjecent(String s1,String s2)
	{
		if(!s1.equals(s2))
		{
			return true;
		}
		else
		return true;
	}
}
