package coreJavaCodes;

import java.util.HashMap;
import java.util.Scanner;

public class TrueSiblings {

	public static void main(String[] args) {
		HashMap<Integer,Integer> map = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();
		for(int i=0;i<c1.length;i++) {
			for(int j=0;j<c2.length;j++) {
				if(c1[i]==c2[j]) {
					map.put(i,j);
				}
			}
		}
		if(s1.length()==s2.length() && map.size()==s2.length()) {
			System.out.println("True");
			System.out.println(map);
		}
		else {
			System.out.println("False");
		}
	}
}
