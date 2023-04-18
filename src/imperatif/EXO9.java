package imperatif;

public class EXO9 {
	public static String canelu(int[]tab9,int j) {
		String avis = "";
		int max = 0;
		for (int i = 0; i<tab9.length; i++) {
			if (tab9[i] > max) {
				max = tab9[i];
			}
		}
		
		if (tab9[j]>50) {
			avis ="elu";
		}
		else if (tab9[j]<=50 && tab9[j]>12.5 && tab9[j] == max) {
			avis = "favorable";
		}
		else {
			avis ="defovorable";
		}
		return avis = "cette personne est " + avis + "et son score est " + tab9[j] +"%";
	}
	public static void main(String [] args) {
		int tab9test [] = new int [] {13,43,8,7};
		System.out.println(canelu(tab9test,0));
	}
}

	