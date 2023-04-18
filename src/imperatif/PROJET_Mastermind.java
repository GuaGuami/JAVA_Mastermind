package imperatif;

public class PROJET_Mastermind{
	
	//programme qui choisir aléatoirement 4 chiffrres et afficher 4 chiffres 
	public static int[] randomTab(int taille,int binf, int bsup)
	{
		int []tab = new int [taille]; 
		for (int i = 0; i < taille; i++) 
		{
			tab[i] =  binf + (int)( Math.random() * ((bsup - binf) + 1) );
		}
		return tab;
	}
	
	
	public static void afficheTab (int []tab)
	{
		System.out.print("[");
		for (int i = 0; i < tab.length -1; i++)
		{
			System.out.print(tab[i] + ",");
		}
		System.out.println(tab[tab.length -1] + "]");
	}

	//affiche les chiffres que l'ordi les choisit
	//comme ca on peut confirmer les chiffre est bien corresponds les couleurs 
	public static void afficheTab (String[] strings)
	{
		System.out.print("[");
		for (int i = 0; i < strings.length -1; i++)
		{
			System.out.print(strings[i] + ",");
		}
		System.out.println(strings[strings.length -1] + "]");
	}
	
	// on tranduire le chiffre devenir chat (couleur)
	public static String [] conversionCouleur(int[]tab)
	{
		String [] tabString = new String[tab.length];
		
		for(int i = 0; i<tab.length; i++)
		{
			
			if(tab[i] == 1){
				tabString[i] = "Rouge";}
			else if (tab[i]==2) {
				tabString[i] = "Orange";}
			else if (tab[i]==3) {
				tabString[i]= "Jaune";}
			else if (tab[i]==4) {
				tabString[i]= "Vert";}
			else if (tab[i]==5) {
				tabString[i] = "Bleu";}
			else if (tab[i]==6) {
				tabString[i] = "Rose";}
			else {
				tabString[i] = "Noir";
				}
		}
		return tabString;
		
		
		
	//pour confomer 
	}
	
	
	//etape3:
	public static String Mastermind(String[]tab, String[]jouerTab ) {
		while(true) {
		if (tab[0]==jouerTab[0] && tab[1]==jouerTab[1]&& tab[2]==jouerTab[2]&& tab[3]==jouerTab[3])
		{
			return  "Félicitations, vous avez gagnez!";
		}
		break;}
		return "resseayer";
		
		
	}
	
	
	
	
	
	
	
	
	
	/// test 
	public static void main (String [] args)
	{
	int[] tab = randomTab(4,1,8);
	afficheTab(tab);
	afficheTab(conversionCouleur(tab));
	String[]jouerTab= {"Rouge","Rose","Jaune","Jaune"};// ETAPE2 :cest le jouer fait le input
	afficheTab(jouerTab);
	System.out.println(Mastermind(conversionCouleur(tab),jouerTab));
	}
}



	
	
