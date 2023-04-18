package imperatif;

public class EXO2 
{	
	public static int PlusGrand (int a, int b, int c)
	{
		if (a>b && a>c)
		{
		return a;
		}
		else
		{
			if (b>a && b>c) 
			{
			return b;
			}
		    else
		    {
		    	return c;
		    }
	    }
	}

	/**
	 * Programme de test.
	 */
	public static void main (String[] args)
		{
		/*----- Zone pour tester vos sous-programmes -----*/
		System.out.println(PlusGrand (4, 77, 9));
		}

} /*----- Fin de la classe -----*/
