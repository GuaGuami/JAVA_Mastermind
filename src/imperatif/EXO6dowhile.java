package imperatif;

/**自己做的
*public class EXO6dowhile {
*	public static void main(String [] args){
*		do {
*			int i = 0; 
*			int s = 0;
*			i = i + 2;
*			System.out.println("i D = " + i);
*			System.out.println("s D = " + s);
*			}while (i < 20);
*		}
*	}
*/
	public class EXO6dowhile {
		public static void main(String [] args) {
			int i = 0;
			int somme = 0;
			do {
				i = i + 1;
				if (i % 2 == 0) {
					somme = i + somme;
				}
			}while (i < 20);
			System.out.println(somme);
		}
	}

