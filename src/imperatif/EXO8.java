package imperatif;

public class EXO8 {
	public static int recherchernbparfait(int nbinf, int nbsup) {
		int somme;
		int i;
		int nb;
		for(nb = nbinf; nb <= nbsup; nb++) 
		{
			somme = 0;
			for(i = 1; i <= nb; i++) 
			{
				if (nb % i == 0) 
				{
					somme += i;
				}
			}
			if(nb == somme /2) 
			{
				return somme/2;
			}
		}
		return nb;
	}
	public static void main (String [] args)
	{
	System.out.println(recherchernbparfait(8,9));
	}
}
