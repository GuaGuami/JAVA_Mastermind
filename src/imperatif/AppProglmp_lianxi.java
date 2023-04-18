package imperatif;

public class AppProglmp_lianxi {
		/**
		 * Sous-programmes.
		 */
//EXO1:
		public static boolean estDiviseur (int nb, int diviseur)
		{
			if (nb % diviseur == 0) 
			{
			return true;
			}
			else 
			{
			return false;
			}
		}

//EXO2	
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
		
		
//EXO3
		public static String Duree (int d)
	    {
			int h; 
			int m; 
			int s;
			
			h = d / 3600;
			m = (d-h*3600) / 60;
			s = (d-h*3600-m*60);
			String total = String.valueOf(h) + "h" + String.valueOf(m) +"m" + String.valueOf(s) + "s";
			
			//String.valueOf()是将int 变成string
			//当你用加法的时候参数的类型必须是一样的
			return total;
		}
		
//EXO4:
		public static int salaire4 (String gr, int an)
		{
			int prixindice = 123;
			int indice;
			
					
			if (gr == "c"){
				if (an == 1){
					indice = 15;
				}
				else if (an == 2){
					indice = 17;
				}
				else{//对于else 来说，不需要条件了，因为是只剩下最后一个条件，直接取就好了。
					indice = 19;
				}
			}
			else if (gr == "s"){
				if (an == 1){
					indice = 23;
				}
				else if (an == 2){
					indice = 25;
				}
				else{
					indice = 27;
				}	
			}
			else{
				if (an == 1){
					indice = 35;
				}
				else if (an == 2){
					indice = 40;
				}
				else{
				    indice = 45;
				}
			}
			
			int salairetotal = prixindice * indice;
			return salairetotal;
		}
		
		
//EXO5:
		public static int salaire5(String gr, int an) 
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
		
//EXO6
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
		
		
		//while do
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
		
		
		
		
		
//EXO7:
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
		
		public static boolean Code(int[] chiffre) { 
			   
			   //créer un tableux de deux dimensions pour enregistrer le résultat de calcul pour chqaue chiffre
			   int[][] matrice = new int[2][9];
			   
			   int somme = 0;
			   for(int i=0; i<=8; i++) 
			   {
			    //si le chiffre est dans la case (i) impaire, on ne modifie pas ce chiffre
				   if(i%2 == 0) 
				   	{
					   matrice[0][i] = chiffre[i];
					   matrice[1][i] = chiffre[i];
			     
			    //sinon on fait les calculs et enregistre le résultat dans les case de matrice
				   } 
				   else 
				   {
					   matrice[0][i] = chiffre[i] * 2;
			     
			     //si le chiffre fois 2 est supérieur à 9, le résultat égal le chiffre moins 9
					   if (matrice[0][i] > 9) 
					   		{
						   matrice[1][i] = matrice[0][i] - 9;
			      
			     //sinon on enregistre le résultat de chiffre fois 2
					   		} 
					   else 
					   {
						   matrice[1][i] = matrice[0][i];        
					   }
				   } 
			   //on ajouter le résultat final pour chaque chiffre 
			   somme = somme + matrice[1][i];
			   }
			   
			   //si somme divise par 10 et puis la reste égale 0, retourner vrai, sinon retourner faux
			      if(somme%10 == 0) 
			      {
			    	  return true;
			      } 
			      else 
			      {
			    	  return false;
			      }
		}	
		
//EXO8:
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
		
//EXO9:
		public static String EluCandidat (int tab9[], int num_can) 
		{
			int resultat_can =tab9 [num_can];
			int max = 0,favoris = 0;
			String avis = "";
			
			if (resultat_can > 50) 
			{
				avis = "Vous etes elu!";
			}
			else 
			{
				for (int i:tab9 )
				{
				if (tab9[i] > max) 
				{
					max = tab9[i];
					favoris = i;
				}		
				}
				if (resultat_can <12 || max >50)
				{
					avis = "elu";
				}
				else
				{
					if (favoris != num_can)
					{
						avis="defavorable";
					}
					else 
					{
						avis ="favorable";
					}
				}
			}
			return "resultat pour le candidat :" + tab9[num_can]+", est"+favoris+ "et est "+avis;
		}
		
		
		
		
		
		
/**
 * * * Programme de test.
*/
		public static void main (String[] args)
			{
			//TEST EXO1:
			System.out.println("TEST EXO1:");
			System.out.println(estDiviseur(35,7));
			//int nb % int diviseur == 0;
			
			//TEST EXO2:
			System.out.println("TEST EXO2:");
			System.out.println(PlusGrand (4, 77, 9));
			
			//TEST EXO3:	
			System.out.println("TEST EXO3:");
			System.out.println(Duree(5000));//测试的时候调用回方法，函数整个公式飙上去
			//Printl SHI LLLLL	
	        
			//TEST EXO4:
			System.out.println("TEST EXO4:");
			System.out.println(salaire4("si",3));
			
			//TEST EXO5:
			System.out.println("TEST EXO5:");
			System.out.println(salaire5("si",2));
			
			//TEST EXO6:
			System.out.println("TEST EXO6:");
			System.out.println("for:");
			System.out.println(tab6(21,0));
			
			System.out.println("while:");
			System.out.println(tab6W(5,0));
			
			System.out.println("do while:");
			System.out.println(tabdw(5,0));
			
			//TEST EXO7:
			System.out.println("TEST EXO7:");
			int [] chiffretest = new int [] {3};
			System.out.println(Code(chiffretest));
			
			//TEST EXO8:
			System.out.println("TEST EXO8:");
			System.out.println(recherchernbparfait(8,9));
			
			//TEST EXO9 :
			System.out.println("TEST EXO9:");
			int [] tab9test = new int [] {56,3,17,11,9};
			//System.out.println(EluCandidat(tab9test[],2));
			}

}

 


