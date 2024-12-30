package Java_Programs;

public class Event_Length_of_String {
	public static void main(String[] args)
	{
		String str="level hi hello by";
		String[] s=str.split(" ");
		for(int i=0;i<s.length;i++)
		{
			if(s[i].length()%2==0)
			{
				System.out.println(s[i]);
			}
		}
	}

}
