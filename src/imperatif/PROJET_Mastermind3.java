package imperatif;
import java.util.Scanner;

public class PROJET_Mastermind3 {
	public static void main (String[] args) {
		
		
		//1.answer of computer 
		//ordi choisit les chiffres random
		int taille =4;
		int binf=1;
		int bsup =8;
		int[]anstab = new int [taille]; 
		for (int i = 0; i < taille; i++) 
		{
			anstab[i] =  binf + (int)( Math.random() * ((bsup - binf) + 1) );
		}
		//afficher le tab de chiffres random 最后可以删除这行
		System.out.print("[");
		for (int i = 0; i < anstab.length -1; i++)
		{
			System.out.print(anstab[i] + ",");
		}
		System.out.println(anstab[anstab.length -1] + "]");
		
		
			
		//2.player write the colers
	//jouer choisit 4 couleurs input 4 fois, chaque couleur chaque fois 
		String[]jouersTabChi = new String[4];
		for(int t =0;t<jouersTabChi.length;t++)
		{
		Scanner input1 = new Scanner(System.in);
		System.out.println("Choisir 1 couleur.");
		String jouerc1 = input1.nextLine();//choisir votre 1ER couleur 
		
		jouersTabChi[t]= jouerc1;
		}
		
		//afficher jouertab couleurs
		System.out.print("[");
		for (int t = 0; t < jouersTabChi.length -1; t++)
		{
			System.out.print(jouersTabChi[t] + ",");
		}
		System.out.println(jouersTabChi[jouersTabChi.length -1] + "]");
		
		
	//change the coulors of the player to the number of the player
		int[]jouersTabChiin = new int[4];
		for(int  t= 0; t<4; t++)
		{
			if(jouersTabChi[t].equals("Rouge")){
				jouersTabChiin[t] = 1;}
			else if(jouersTabChi[t].equals("Orange")){
				jouersTabChiin[t] = 2;}
			else if(jouersTabChi[t].equals("Jaune")){
				jouersTabChiin[t] = 3;}
			else if(jouersTabChi[t].equals("Vert")){
				jouersTabChiin[t] = 4;}
			else if(jouersTabChi[t].equals("Bleu")){
				jouersTabChiin[t] = 5;}
			else if(jouersTabChi[t].equals("Rose")){
				jouersTabChiin[t] = 6;}
			else if(jouersTabChi[t].equals("Violet")){
					jouersTabChiin[t] = 7;}
			else if(jouersTabChi[t].equals("Noir")){
				jouersTabChiin[t] = 8;}
			//s1.equals(s2) 是比较字符串内容
		}
		
		//afficher le tab chiffres de jouer 
				System.out.print("[");
				for (int i = 0; i < jouersTabChiin.length-1; i++)
				{
					System.out.print(jouersTabChiin[i] + ",");
				}
				System.out.println(jouersTabChiin[jouersTabChiin.length -1] + "]");
		
		
				//3.Compare the two tables: tab of the player and tab of the answer
		while(anstab[0]==jouersTabChiin[0] && anstab[1]==jouersTabChiin[1] && anstab[2]==jouersTabChiin[2] && anstab[3]==jouersTabChiin[3]) {
					
					int bienSomme = 0;
					int malSomme = 0;
					int sel;
					
					if (anstab[0]==jouersTabChiin[0] && anstab[1]==jouersTabChiin[1] && anstab[2]==jouersTabChiin[2] && anstab[3]==jouersTabChiin[3])
					{
						System.out.println( "Félicitations, vous avez gagnez!");
					}
					else
					{
						for(int t = 0; t<jouersTabChiin.length; t++)
						{
								if (anstab[t]==jouersTabChiin[t])//bien place 
									bienSomme = bienSomme + 1;
								
								if (anstab[t]!=jouersTabChiin[t] )
									{
									sel = jouersTabChiin[t];
									for(int i = 0; i< anstab.length; i++)
									{
										if(anstab[i]==sel)
										{
											malSomme = malSomme + 1;
										}
									}
								}
						}
					System.out.println("Bien placé(s) : " + bienSomme + " ; Mal placé(s) : " + malSomme);
					System.out.println("Reessayez!");
					
					}
					break;}	
				   }
			  }			



		
		
				
				

