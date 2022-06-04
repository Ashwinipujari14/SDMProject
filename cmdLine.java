package study.practice.practice3;

import java.util.ArrayList;
import java.util.Collections;

public class cmdLine {
	
	public static void main(String[] args) {
		
		ArrayList<Integer>list=new ArrayList<Integer>();
	
		for(int i=0;i<args.length;i++)
		{
			try {
			list.add(Integer.parseInt(args[i]));
			}catch(NumberFormatException e)
			{
				continue;
			}
		}
		Integer sum=0;
		for(Integer i : list)
		{
			sum=sum+i;
		}
		System.out.println(sum);
		
		for(Integer i : list)
		{
			System.out.print(i+" ");
		}
		Collections.sort(list);
		System.out.println();
		for(Integer i : list)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		Integer x=Collections.max(list);
		System.out.println(x);
		
		System.out.println();
		Integer y=Collections.min(list);
		System.out.println(y);
	}

}
