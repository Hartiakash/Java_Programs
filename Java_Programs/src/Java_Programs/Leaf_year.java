package Java_Programs;

public class Leaf_year {
	public static void main(String[] args)
	{
		int year=2000;
		
		if((year%4==0 || year%400==0) && year%100!=0)
		{
			System.out.println("it is leaf year");
		}
		else {
			System.out.println("it is not a leaf year");
		}
	}

}
