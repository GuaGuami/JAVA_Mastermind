package imperatif;

public class EXO6_1
{
	//for
	public static int tab6(int i, int somme) 
	{
		i = 0;
		somme = 0;
		for (i = 0; i < 20; i = i + 1) 
		{
			if (i % 2 == 0) //nb pair
			{
				somme = somme + i;//calculer la somme 
			}			
		}
	return somme;
	}
	
	
	
	
	//While
	public static int tab6W(int i,int somme) 
	{
		i = 0;
		somme = 0;
		while(i < 20) {
			i = i + 1;
			if (i % 2 == 0) 
			{
				somme = i + somme;
			}
		}
	return somme;
	}
	
	public static int tabdw(int i, int somme ) 
	{
		i = 0;
		somme = 0;
		do {
			i = i + 1;
			if (i % 2 == 0) {
				somme = i + somme;
			}
		}while (i < 20);
		return somme;
	}
	
	
	//TEST EXO:
	public static void main(String [] args)
	{	System.out.println("for:");
		System.out.println(tab6(21,0));
		
		System.out.println("while:");
		System.out.println(tab6W(5,0));
		
		System.out.println("do while:");
		System.out.println(tabdw(5,0));
		
	}
}

	