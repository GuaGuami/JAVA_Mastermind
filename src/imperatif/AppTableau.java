package imperatif;

public class AppTableau 
{
	//cree et retourne un tableu initialise avec des nombres 
	//entiers compris dans un intervalle donnee; le nombre d'elements du tableau est passe en parametre

	
//EXO10:
	public static int[] randomTab(int taille, int min, int max){
			int[]tab = new int [taille];
			int i;
			for (i = 0; i < taille; i++) 
			{
				tab[i] =  min + (int)(Math.random()*(max-min) + 1);	
			}
				return tab;
		}
		
	
	
		
//EXO11 : tab.length --- taille du tableau(int)
		
		public static void afficheTab(int[] tab) {		
		System.out.print("[");
		for (int i = 0; i < tab.length - 1; i++){
			System.out.print(tab[i] + ",");
			
		}
		System.out.println(tab[tab.length - 1] + "]");
		}
		
		

		
		
//EXO12 : Retourne la copie exacte d'un tableau passé en paramètre.

		public static int[] copy (int[]randomTab)
		{
			int taille = randomTab.length; 
			int [] copytab = new int [taille];
		
			System.arraycopy(randomTab, 0, copytab, 0, taille);
			return copytab;
		}
		


//EXO13 Vérifie si un nombre entier donné est présent dans un tableau.
		public static boolean VerifieNbE (int[] tab13, int e)
		{
			int taille = tab13.length;
			for (int i = 0; i < taille; i ++) 
			{
				if(tab13[i] == e)
				{
					return true;
				}		
			}
			return false;
		}
		
		
		
//EXO14:Retourne le nombre d’occurences d’un nombre donné dans un tableau.
		public static int NbOccurences (int[] tab14, int somme, int e)
		{
			somme = 0;	
			int i;
			for (i = 0; i < tab14.length; i++) 
			{
				if(tab14[i] == e)
				{
					somme = somme +1;
				}
		 
			}
			return somme;
		}
		
		
		
//EXO15:Retourne la plus petite (ou la plus grande) valeur du tableau.
		public static int PlusGrandNbTAB (int[] tab15)
		{
			int max = 0;
			for (int i = 0; i < tab15.length; i++)
			{
				if(max <= tab15[i])
				{
					max  = tab15[i];
			}
				else
				{
					return max;
				}
			}
			return max;
		}
		

		
//EXO16:Calcule et affiche la moyenne et l'écart-type des nombres contenus dans le tableau.
		public static String MeanetSd (int [] tab16)
		{
			int i;
			int totalsomme = 0;
			
			for (i = 0; i<tab16.length; i++)//somme
			{
				totalsomme = totalsomme + tab16[i];
			}
			int mean = totalsomme/tab16.length;// mean
				
		
			int v = 0;
			for(i = 0; i<tab16.length; i++)
			{
				v = v + ((tab16[i]-mean)*(tab16[i]-mean));//ecarttype
			}
			int var = v/tab16.length;
			//Math.sqrt()根号下
			double sd = (Math.sqrt(var));
			int intsd = (int) sd;
				
			return "Mean : " + mean + " ; Ecart-type : " + intsd;
	
		}
		
		
//EXO17:Vérifie si le tableau est trié par ordre croissant.
		public static boolean OrdreCroissant (int [] tab17)
		{
			int i;
			int max = 0;
			for (i = 0; i < tab17.length; i++)
			{
				if (tab17[i] >= max)
				{
					max = tab17[i];
				}	
				else 
				{
					return false;
				}
			}
			return true;	
		}
			
		
		
//EXO18:Algorithme du tri par sélection.
		public static int [] trisele(int tabse []) 
		{
			int i ;
			int n = tabse.length;
			for (i = 0; i<=n-2; i++)
			{
				int min = i;
				for(int j = i +1; j<=n-1; j++)
				{
					if (tabse[j] < tabse[i])
						{
							min = j;
						}
				}
				/* Echanger les 2 valeurs */
				int aux = tabse [min];
				tabse[min]=tabse[i];
				tabse[i]=aux;
			}
			return tabse;//!!!!!!!
		}
			
		
//EXO18:Vous implémenterez et testerez 2 (ou les 3) des algorithmes suivants qui trient un tableau d'entiers T de taille n par ordre croissant.
		public static int[] triInsertion(int [] tab18)
		{
			int n = tab18.length;
			int i = 1;
			int temps = 0;
			for (i = 1; i <= n-1; i++)
			{
				temps = tab18[i]; 
				int j = i;
				
				while(j > 0 && tab18[j-1] > temps)
				{
					tab18[j] = tab18[j-1];
					j--;
				}
				tab18[j]=temps;
			}
			return tab18;
		}
		
		
		
//EXO18:Algorithme du tri a bulle.
		public static int [] tribulle (int tabbu [])
		{
			int n = tabbu.length;
			for (int i = 0; i<=n-2; i++)
			{
				for (int j = (n-1); j >= i + 1; j--)//
					{
					if (tabbu[j-1] >= tabbu[j])
						{
						/* Echanger les 2 valeurs */
						int aux = tabbu[j-1];
						tabbu[j-1] = tabbu[j];
						tabbu[j] = aux;
						}	
					}
			}
			return tabbu;
		}
		
		
		
		
		
//EXO19: Ecrire un sous-programme qui calcule la factorielle d’un nombre et le PGCD de deux nombres.
	    //Algorithme de la fonction factorielle d’un nombre n.
		public static int fac(int n)
		{
			if (n == 0)
			{
				return 1;
			}
			else
			{
				return n*fac(n-1);
			}
		}
			
		public static int PGDC (int a, int b)
		{
			if (a == b)
			{
				return a;
			}
			else
			{
				if (a>b)
				{
					return PGDC(a-b,b);//不不懂
				}
				else
				{
					return PGDC(a,b-a);
				}
			}
		}
			
		
//EXO22:	
		public static void exo22()
		{
			
		}
		
		
		
		
				
		//10 11 12 test:
		public static void main(String[] args)
		{System.out.println("-----TEST EXO10-11:-----");
			int[] tab = randomTab(9,4,4000);//test :exo10-12
			afficheTab(tab);
		System.out.println("-----TEST EXO12:-----");
			afficheTab(copy(tab));	
			
		//test EXO13:	
			System.out.println("-----TEST EXO13:-----");
			int [] tab13test = new int [] {1,6,4};
			System.out.println(VerifieNbE (tab13test,0));
			
		//test EXO14:
			System.out.println("-----TEST EXO14:-----");
			int[] tab14test = new int [] {3,3,4,5,3,0,5};
			System.out.println(NbOccurences (tab14test,0,5));
			
		//test EXO15:
			System.out.println("-----TEST EXO15:-----");
			int [] tab15test = new int [] {1,2,8,4,5,6};
			System.out.println(PlusGrandNbTAB(tab15test));
			
		//test EXO16:
			System.out.println("-----TEST EXO16:-----");
			int [] tab16test = new int [] {9,2,3,7,5,8};
			System.out.println(MeanetSd(tab16test));
			
		//test EXO17:
			System.out.println("-----TEST EXO17:-----");
			int [] tab17test = new int [] {0,1,8,5};
			System.out.println(OrdreCroissant(tab17test));
			
		//test EXO18 selection:
			System.out.println("-----TEST EXO18sel:-----");
			int []tab18sel = new int [] {7,4,3,8};	
			System.out.println("avant le tri");
			afficheTab(tab18sel);
			System.out.println("apres le tri");
			afficheTab(trisele(tab18sel));
			
		//test EXO18insertion:
			System.out.println("-----TEST EXO18insertion:-----");
			int [] tab18test = new int [] {4,1,9,8};		
			System.out.println("avant le tri");
			afficheTab(tab18test);
			System.out.println("apres le tri");
			afficheTab(triInsertion(tab18test));
			
		//test EXO18bulle:
			System.out.println("-----TEST EXO18bulle:-----");
			int [] tab18testb = new int [] {2,1,9,8};
			System.out.println("avant le tri");
			afficheTab(tab18testb);
			System.out.println("apres le tri");
			afficheTab(tribulle(tab18testb));
			
		//test EXO19:	
			System.out.println("-----TEST EXO19:-----");
			System.out.println(fac(9));
			System.out.println("le PGCD est " + PGDC(24,987));
		
			
			
		//test EXO22:	
			System.out.println("-----TEST EXO22:-----");
			long debut = System.currentTimeMillis();
			long fin = System.currentTimeMillis() - debut;
			System.out.println(fin+"ms");
		
		}
}

	 



		



