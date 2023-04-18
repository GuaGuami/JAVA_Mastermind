package imperatif;

public class EXO4 {
	public static int salaire (String gr, int an){
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
		return salairetotal;//return 是每个程序最后输出的东西。
		//为什么前面的if不要呢？因为最后这个工资的方程需要indice，也就是说前面的indices不能结束，因为最后的方程要用到。而是将return放在工资的公式后面。
	}
	
//test 
		public static void main(String [] args) {
			System.out.println(salaire("si",3));
		}
}
