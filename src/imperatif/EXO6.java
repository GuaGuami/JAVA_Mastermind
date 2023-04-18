package imperatif;

/**自己写的
* public class EXO6 {
*	public static void main(String[] args) {
*		int i;
*		int s = 0;
*	
*		for (i = 0; i < 20; i = i + 2, s = s + i) {
*			System.out.println("i = " + i);
*			System.out.println("somme = " + s);}
*	}
*}
*/

/**问题：
*1.没有考虑是双数：i%2=0
*2.是将他们一一加起来哦。
*/

//CORRIGER
public class EXO6{
	public static void main(String [] args) {
		int i = 0;
		int somme = 0;
		for (i = 0; i < 6; i = i + 1) {
			if (i % 2 == 0) {//nb pair
				somme = somme + i;//calculer la somme 
				System.out.println(somme);
			}			
		}
	}
}

