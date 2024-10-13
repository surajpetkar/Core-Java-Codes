package coreJavaCodes;

import java.io.IOException;
// RUN THIS APP IN NOTEPAD
public class nameop {
	public static void main(String[] args) throws Exception {
		
			System.out.print("Loading");
		for(int i=0;i<10;i++) {
			System.out.print(".");
			Thread.sleep(500);
			System.out.print(".");
			Thread.sleep(500);
			System.out.print(".");
			Thread.sleep(500);
			System.out.print("\b");
			System.out.flush();
			System.out.print("\b");
			System.out.flush();
			System.out.print("\b");
			System.out.flush();
			Thread.sleep(250);	

			System.out.print(" ");
			System.out.print(" ");
			System.out.print(" ");
			System.out.print("\b");
			System.out.flush();
			System.out.print("\b");
			System.out.flush();
			System.out.print("\b");
			System.out.flush();
			Thread.sleep(250);
		}
		System.out.println("");
	     System.out.println("      ____                        .\r\n" + 
				"     / ___) _   _ _ _  ___  _    /|\r\n" + 
				"     \\___ \\| | | | '_|/   || |  / /__\r\n" + 
				"      ___) | |_| | | | (| || | /__  /\r\n" + 
				"     |____/|_____|_|  \\____| |   / /\r\n" + 
				"     ===================|___/    |/  \r\n" + 
				"			         '");
	}
}


