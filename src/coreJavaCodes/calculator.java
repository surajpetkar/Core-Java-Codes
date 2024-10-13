package timepass;
import java.util.Scanner;
public class calculator {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	int ch;
	System.out.println("Enter first number:");
	String no1=sc.nextLine();
	int num1=Integer.parseInt(no1);
	System.out.println("Enter second number");
    String no2=sc.nextLine();
    int num2=Integer.parseInt(no2);
    do
    {
    System.out.println("\n 1) Addition \n 2) Substraction \n 3) Multiplication \n 4) Division \n 5) Exit \n Enter your choice:");
    String rd=sc.nextLine();
    ch=Integer.parseInt(rd);
    switch(ch)
    {
    case 1:
    	System.out.println("Addition is:"+(num1+num2));
    break;
    case 2:
    	System.out.println("Substraction is:"+(num1-num2));
    break;
    case 3:
    	System.out.println("Multiplication is:"+(num1*num2));
    break;
    case 4:
    	System.out.println("Division is:"+(num1%num2));
    break;
    case 5:
    	System.exit(0);
    break;
    }
    }while(ch!=5);
}
}
