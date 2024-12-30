package Java_Programs;

public class Print_Unique_Number {
	public static void main(String[] args)
	{
		int[] arr= {1,2,4,3,2,1,5,6,7,7};
		
		for(int i=0;i<arr.length;i++)
		{
			boolean flag=true;
			for(int j=0;j<arr.length;j++)
			{
				if(i!=j && arr[i]==arr[j])
				{
					flag=false;
					break;
				}
			}
			if(flag) {
				System.out.println(arr[i]);
			}
		}
	}

}
