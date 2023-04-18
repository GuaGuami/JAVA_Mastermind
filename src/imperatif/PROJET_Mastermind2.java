package imperatif;
import java.util.Scanner;

public class PROJET_Mastermind2 {
	public static void main (String[] args) {
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		Scanner sc = new Scanner (System.in);
		System.out.println("ecrit chiffres");
		int guessNum = (int)(Math.random()*100+1);
		
		
		while (true) {
			int result = sc.nextInt();
			if (result<guessNum) {
				System.out.println("plus grand");
			}else if (result> guessNum) {
				System.out.println("plus petite");
			}else {
				System.out.println("BINGO");
				
				break;
			}
		}
	}
}