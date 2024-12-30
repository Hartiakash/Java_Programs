package Java_Programs;

public class Unique_word_in_sentence {
	public static void main(String[] args)
	{
		String str="Hi Hello Goodmoring Hi Hello";
		String[] s=str.split(" ");
		for(int i=0;i<s.length;i++)
		{
			boolean flag=true;
			for(int j=0;j<s.length;j++)
			{
				if(i!=j && s[i].equals(s[j]))
				{
					flag=false;
					break;
				}
			}
			if(flag)
			{
				System.out.println(s[i]);
			}
		}
	}

}
