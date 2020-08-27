package java30;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SumofintegersinList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		int temp;
 List<Integer> list = new ArrayList<Integer>();
 Scanner scan =new Scanner(System.in);
 for(int i=0;i<5;i++)
 {
	 System.out.println(" enter the " + (i+1) + " number of ArrayList");
	 int v = scan.nextInt();
	 list.add(v);
	
 }
 
 for(int i=0;i<5;i++)
 {
	 sum= sum+ list.get(i);
 }
  System.out.println("the sum of integers is "+ sum);
	}

}
