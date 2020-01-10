
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random rnd=new Random();
		Scanner in=new Scanner(System.in);

	
		System.out.println("Enter $2 or $5 with '2' or '5' to buy a ticket!");
		System.out.print("Curent bank accont: ");
		int Money = (rnd.nextInt((400000-30000)+30000)+30000);
		System.out.print("$");
		System.out.println(Money);
		int Ttype = 0;
		
		int status=0;
		
		
		while (status==0) {
		Ttype=in.nextInt();
			
		if (Ttype==2) {
		int Ticket = (rnd.nextInt((13983816-1)+1)+1);
		

		if (Ticket>1) {
		System.out.println("Try again next time!");
		System.out.println("You have ");
		Money=(Money-Ttype);
		System.out.println(Money);
		System.out.println(" left.");
		}
		System.out.println("");
		System.out.println("Try again?");
		if (Ticket==1) {
		System.out.println("You won!");
		status=(1);
		System.out.println("You have ");
		Money=(Money-Ttype);
		Money=(Money+15000000);
		System.out.println(Money);
		System.out.println(" left.");
		}
		
		}
		
		if (Ttype==5) {
			int Ticket = (rnd.nextInt((2-1)+1)+1);
			

			if (Ticket>1) {
			System.out.println("Try again next time!");
			System.out.println("You have ");
			Money=(Money-Ttype);
			System.out.println(Money);
			System.out.println(" left.");
			}
			System.out.println("");
			System.out.println("Try again?");
			if (Ticket==1) {
			System.out.println("You won!");
			status=(1);
			System.out.println("And only have ");
			Money=(Money-Ttype);
			Money=(Money+30000000);
			System.out.println(Money);
			System.out.println(" left.");
			}
		}
		
		//Statistics are based on the odds of winning the lotto max.
		//for $2, your odds are (rounded) 14,000,000.
		//for $5, they are 27,000,000.
		//this website provided the data: https://www.cbc.ca/news/lotteries-what-are-the-odds-1.775281
		}
	}
}

//currently broken. I did try adding a new feature, but it seems that caused a new error. Will hopefully be fixed in the future.
	

