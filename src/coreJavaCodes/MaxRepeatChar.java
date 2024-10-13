package timepass;

import java.util.HashMap;
import java.util.Scanner;

public class MaxRepeatChar {

	public static void main(String[] args) {
		HashMap<Character, Integer> map = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		int[] countar = new int[str.length()];
		int count = 0;
		int max = 0;
		char[] ch = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			count = 1;

			for (int j = i + 1; j < ch.length; j++) {
				if (ch[j] == 32) {
					break;
				} else if (ch[i] == ch[j]) {
					count++;
					ch[j] = 0;
				}
			}
			map.put(ch[i], count);
			countar[i] = count;
		}
		System.out.println(map);
		max = countar[0];
		for (int i = 0; i < countar.length; i++) {
			if (countar[i] > max) 
				max = countar[i];
		}
		System.out.println(max);
	}
}
