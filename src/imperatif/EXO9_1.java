package imperatif;

public class EXO9_1 {
public static boolean Exercice7(int[] chiffre) { 
		
		//cr�er un tableux de deux dimensions pour enregistrer le r�sultat de calcul pour chqaue chiffre
		int[][] matrice = new int[2][9];
		
		//initialiser la somme �gale 0
		int somme = 0;
		
		//faire une boucle pour chaque chiffre
		for(int i=0; i<=8; i++) {
			//si le chiffre est dans la case (i) impaire, on ne modifie pas ce chiffre
			if(i%2 == 0) {
				matrice[0][i] = chiffre[i];
				matrice[1][i] = chiffre[i];
				
			//sinon on fait les calculs et enregistre le r�sultat dans les case de matrice
			} else {
				matrice[0][i] = chiffre[i] * 2;
				
				//si le chiffre fois 2 est sup�rieur � 9, le r�sultat �gal le chiffre moins 9
				if (matrice[0][i] > 9) {
					matrice[1][i] = matrice[0][i] - 9;
					
				//sinon on enregistre le r�sultat de chiffre fois 2
			    } else {
			    	matrice[1][i] = matrice[0][i];			    	
			    }
			}
		
		//on ajouter le r�sultat final pour chaque chiffre 
		somme = somme + matrice[1][i];
						
		}
		
		//si somme divise par 10 et puis la reste �gale 0, retourner vrai, sinon retourner faux
	    if(somme%10 == 0) {
	    	return true;
	    } else {
	    	return false;
	    }
	}
	
	
	
	
	
	public static void main(String [] args) {
	int[] chiffre = new int[] {9,7,2,4,8,7,0,8,6} ;
	
	System.out.println (Exercice7(chiffre));
}
}
