package imperatif;

public class EXO5 
{
	public static int salaire(String gr, int an) 
	{
		int prixindice = 123;
		int indice;
		
		switch(gr) 
		{
		case "c" :{	
			switch(an) 
				{
				case 1: indice = 15; break;
				case 2: indice = 17; break;
				case 3: indice = 19; break;
				default: indice = 0;// oublie pas ca 
				}
			break;
				}
		case "s" :{
			switch(an) 
				{
				case 1: indice = 20; break;
				case 2: indice = 23; break;
				case 3: indice = 25; break;
				default: indice = 0; 
				}
			break;	
				}
			
		case "si" :{
			switch(an) 
			{
			case 1: indice = 30;break;
			case 2: indice = 35;break;
			case 3: indice = 40;break;
			default: indice = 0;
			}
			break;
			}
		default:{//记得放这个啊
			indice = 0;
			}
		}
		
		int totalsalaire = indice * prixindice;
		return totalsalaire;
		
	}
	
	//test
		public static void main(String[] args) 
		{
		System.out.println(salaire("si",2));
		}
}
