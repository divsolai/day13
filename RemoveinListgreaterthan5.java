package java30;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RemoveinListgreaterthan5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		int range;
		List<String> list = new ArrayList<String>();
		List<String> uplist = new ArrayList<String>();
		System.out.println("Enter the range of the list");
		range= scan.nextInt();
		for(int i=0;i<range;i++)
		{
			System.out.println("Enter the value of the ArrayList");
			String v=scan.next();
			list.add(v);
		}
		System.out.println("The ArrayList is"+ list);
		for(int i=0;i<range;i++)
		{
			if(list.get(i).startsWith("s"))
			{
				if(list.get(i).length()>5)
			    uplist.add(list.get(i));
			
			}else
			{
				if(!list.get(i).startsWith("s"))
					uplist.add(list.get(i));
			}
				}
		System.out.println(" the updated list is "+ uplist);
}
}
