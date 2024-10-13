package timepass;

import java.time.LocalDateTime;

public class FinancialYear {

	public static void main(String[] args) {
		LocalDateTime date = LocalDateTime.of(2021,02,11,2,0,0); 
		System.out.println(date.now());
		if(date.getMonth().getValue()<= 3) {
			System.out.println("Financial Year is :"+(date.getYear()-1)+" - "+date.getYear());
		}
		else {
			System.out.println("Financial Year is : "+date.getYear()+" - "+(date.getYear()+1));
		}
	}
}
