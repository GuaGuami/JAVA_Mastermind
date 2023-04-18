package imperatif;

public class EXO7 {
	public static boolean leschiffres(long nb) {
		long somme = 0;
		boolean faire = false; 
		long chiffre = 0;
		while (nb > 0 )
		{
			chiffre = nb%10;
			if (faire)
			{
				somme = somme + (chiffre * 2)%9;
			}
			else {
				somme = somme + chiffre;
			}
			faire = !faire;
			nb = nb%10;
			}
			return (somme % 10 == 0);
		}		
	
	public static void main (String [] args)
	{
		System.out.println(leschiffres(9));
	}
}
