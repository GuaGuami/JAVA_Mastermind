package imperatif;

public class EXO6while {
	/**public static void main(String[] args) {
		*int i = 0;
		*int s = 0;
		*while (i < 20) {
			*System.out.println("i w= " + i);
			*System.out.println("somme w= " + s);
			*i = i + 2;
			*s = s + i;
		*}
	}
	*/
	public static void main(String [] args) {
	int i = 0;
	int somme = 0;
	while(i < 20) {
		i = i + 1;
		if (i % 2 == 0) {
			somme = i + somme;
			System.out.println(somme);
		}
	}
	}
}


