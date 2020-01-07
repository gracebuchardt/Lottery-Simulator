
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random rnd=new Random();
		Scanner in=new Scanner(System.in);

		int Ticket = (rnd.nextInt((13983816-1)+1)+1);

		if (Ticket>1) {
		System.out.println("Try again next time!");
		}
		if (Ticket==1) {
		System.out.println("You won!");
		}
	}

}
