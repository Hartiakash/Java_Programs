package Java_Programs;

public class PrintNearestVowels {
	public static void main(String[] args)
	{
		char a='b';
		if(a=='a' || a=='e' || a=='i' || a=='o' || a=='u')
		{
			System.out.println(a);
		}
		else if(a>'a' && a<'e')
		{
			System.out.println("a,e");
		}
		else if(a>'e' && a<'i')
		{
			System.out.println("e,i");
		}
		else if(a>'i' && a<'o')
		{
			System.out.println("i,o");
		}
		else if(a>'o' && a<'u')
		{
			System.out.println("o,u");
		}
		else {
			System.out.println("u,z");
		}
	}

}
