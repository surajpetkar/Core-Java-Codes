package coreJavaCodes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class DifficultSubject {

	public static void main(String[] args) {
		HashMap<String,Double[]> map = new HashMap<>();
		Scanner sc  = new Scanner(System.in);
		Double[] marks = new Double[6];
		String ch;
		do {
		System.out.println("Please Enter Student Name:");
		String name = sc.next();
		System.out.println("Please Enter "+name+"'s English Marks :");
		marks[0]=sc.nextDouble();
		System.out.println("Please Enter "+name+"'s History Marks :");
		marks[1]=sc.nextDouble();
		System.out.println("Please Enter "+name+"'s Computers Marks :");
		marks[2]=sc.nextDouble();
		System.out.println("Please Enter "+name+"'s Mathematics Marks :");
		marks[3]=sc.nextDouble();
		System.out.println("Please Enter "+name+"'s Science Marks :");
		marks[4]=sc.nextDouble();
		System.out.println("Please Enter "+name+"'s Economics Marks :");
		marks[5]=sc.nextDouble();
		map.put(name,marks);
		System.out.println("Do you want to continue Y/N :");
		ch = sc.next();
		}while(ch.equalsIgnoreCase("Y")); 
		System.out.println(map);
		Set<String> set = map.keySet();
		System.out.println(set);
		Iterator itr = set.iterator();
		while(itr.hasNext()) {
		    marks = map.get(itr.next());
		}
		
	}
}
