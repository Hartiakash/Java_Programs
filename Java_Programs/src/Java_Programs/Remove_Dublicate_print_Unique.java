package Java_Programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class Remove_Dublicate_print_Unique {
	public static void main(String[] args) {
		ArrayList<Integer> a=new ArrayList<Integer>(Arrays.asList(1,2,3,2,7,1,4,5,6));
		List<Integer> l1=removeDuplicate(a);
		Collections.sort(a);
		System.out.println("printing unique number");
		for(int no:l1) {
			System.out.print(no);
		}
  	}
	public static List<Integer> removeDuplicate(List<Integer> arr){
		List<Integer> l1=new ArrayList<Integer>();
		TreeSet<Integer> t1=new TreeSet<Integer>();
		for(int i=0;i<arr.size();i++) {
			t1.add(arr.get(i));
			boolean flag=true;
			for(int j=0;j<arr.size();j++)
			{
				if(i!=j && arr.get(i)==arr.get(j))
				{
					flag=false;
					break;
				}
			}
			if(flag)
			{
				l1.add(arr.get(i));
			}
		}
	System.out.println("Remove duplicate values :");
	for(int no:t1)
	{
		System.out.println(no+" ");
	}
	return l1;
	}

}
