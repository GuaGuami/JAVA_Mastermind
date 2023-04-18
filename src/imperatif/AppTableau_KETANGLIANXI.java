package imperatif;


//产生一个在0 和1 之间的随机数 不包括1
//Math.random():

//返回一个指定范围的随机数在mn之间的公式
//Math.random()*(n-m)+m;
//or : Math.random()*(n+1-m)+m
//le prof a dit : Math.random()*((n-m+1);
//https://blog.csdn.net/levae1024/article/details/85106292

public class AppTableau_KETANGLIANXI {

//cree et retourne un tableu initialise avec des nombres entiers compris dans un intervalle donnee; le nombre d'elements du tableau est passe en parametre

	public static int[] randomTab(int taille, int min, int max){
		int[]tab = new int [taille];
		int i;
		for (i = 0; i < taille; i++) {
			//i 是表格里面的数字的个数。个数不能多于表格的大小
			tab[i] =  min + (int)(Math.random()*(max-min) + 1);	
		}
			return tab;
	}
	
//exo11 : tab.length --- taille du tableau(int)
	

//因为tab不可以直接表达出来，需要一个转换
	public static void afficheTab(int[] tab) {		
	System.out.print("[");
	for (int i = 0; i < tab.length - 1; i++){
		System.out.print(tab[i] + ",");
		
	}
	System.out.println(tab[tab.length - 1] + "]");
	}
	//在这个阶段java已经转换出来了，现在需要测试咯，
	

	
	
	
//exo12 : Retourne la copie exacte d'un tableau passé en paramètre.

	public static int[] copy (int[]randomTab)
	//copy是函数方法，可以为后面使用的时候调用这个方法， 这个方法里面放入类型和名字。下面是你定义的copy这个方法
	{
		int taille = randomTab.length; //定义这个名字的长度
		int [] copytab = new int [taille];//建立一个新的表格来放入复制的东西
	
		System.arraycopy(randomTab, 0, copytab, 0, taille);
		return copytab;
	}
	

	//exo 13 Vérifie si un nombre entier donné est présent dans un tableau.
	public static boolean VerifieNbE (int[] tab13, int e)//2个输入，一个是表格，一个是整数是否在这个表格里面(int e)
	//你现在在定义一个函数，是一个模型。所以一些可以改变的数字需要用字母表示，在测试中在用数字表示出来
	{
		int taille = tab13.length;
		// 这里需要删除，因为如果不删除的就是等于定义了第二次tab13与第一行一起定义了: int [] tab13 = new int[taille];
		for (int i = 0; i < taille; i ++) 
		{
			if(tab13[i] == e)//在表格中的i位置的数字 = e这个数字
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
				max  = tab15[i];//十分注意为什么这么写
		}
			else
			{
				return max;
			}
		}
		return max;
	}
	
	//EXO16:Calcule et affiche la moyenne et l'écart-type des nombres contenus dans le tableau.
	public static String MeanetEcarttype (int [] tab16)
	{
		int i;
		int totalsomme = 0;
		
		for (i = 0; i<tab16.length; i++)//求和
		{
			totalsomme = totalsomme + tab16[i];//求和
		}
		int mean = totalsomme/tab16.length;// mean
			
	
		int v = 0;
		for(i = 0; i<tab16.length; i++)//求方差
		{
			v = v + ((tab16[i]-mean)*(tab16[i]-mean));//求方差
		}
		int var = v/tab16.length;
		//Math.sqrt()根号下
		double sd = (Math.sqrt(var));
		int intsd = (int) sd;//将double转为int
			
		return "mean :" + mean + " ecart-type :" + intsd ;
//打印两个值可以用方法类型为String 
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
		
	}//
	
	
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

	
//Tri insertion: 取第一位的数在temps中，temps和第0位数字比较，谁小谁去第零位上。
	//取第二位的数字在temps上，temps 与第1位和第0位的数字比较，如果比temps小则不变，
	//如果比temps大则移位去第二位的数字.注意先与靠近第二位置的数字先比较，也就是第一位的数先比较
	//取第三位的数字取temps上，与从第二位置的数字开始比较，比他小，位置则不变，比temps大则移一位
	//在和第一个位置的数比较，以此类推
	//
	
	
	
	
	
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
	
	

	//不懂3412
	
	
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
		//bulle、 两个数比较。第0和第一位置的数比较，排大小，然后第一和第二位置比较，如此类推，这样
//不断重复可以从大到小排出顺序	
	
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
		
	
	
	
//EXO 20 En vous inspirant du triangle de Pascal, 
// un sous-programme permettant de calculer 
	//le nombre de combinaisons de p éléments 
	//dans un ensemble de n éléments

	
	public static int pascal(int p, int n)
	{
		for(p = 1; p < 5; p++)
		{
			for (n = 1; n <= p; p++)
			{
				 System.out.print(" "+p*n);
			}
		}
		return p;
	}
	
	
	
	
	

	
	
	
	//EXO21Implémentez le tri par fusion.
	public static void trifusion(int[] tab20, int inf, int sup)
	{
		for()
		if (inf != sup)
		{
		int mid = (inf + sup)/2;
		trifusion(tab20,inf,sup);
		trifusion(tab20,mid+1,sup);
		//fusion(tab20,inf,mid,sup);	
		}
	}
	
	
//EXO22Implémentez le tri par fusion.
		public static void exo22()
		{
			long debut = System.currentTimeMillis();
			long fin = System.currentTimeMillis() - debut;
		}
	
	
	
	
	
	
	//10 11 12 test:
	public static void main(String[] args) {
		int[] tab = randomTab(9,4,4000);//test :exo10-12
		afficheTab(tab);//为什么不需要system out print 
		afficheTab(copy(tab));//调用这个方法copy来打印
	
	//因为他重新读取public static void afficheTab(int[] tab) 。
	//他是从这里往下读取。所以它可以检测下面的out print
	
	//test EXO13:	
		int [] tab13test = new int [] {1,6,4};
		System.out.println(VerifieNbE (tab13test,0));
	//test EXO14:
		int[] tab14test = new int [] {3,3,4,5,3,0,5};
		System.out.println(NbOccurences (tab14test,0,5));//somme这里是起始的数字0
	//test EXO15:
		int [] tab15test = new int [] {1,2,8,4,5,6};
		System.out.println(PlusGrandNbTAB(tab15test));
	//test EXO16:
		int [] tab16test = new int [] {1,2,3,4,5,6};
		System.out.println(MeanetEcarttype(tab16test));
	//test EXO17:
		int [] tab17test = new int [] {0,1,8,9};
		System.out.println(OrdreCroissant(tab17test));
	//test EXO18insertion:
		System.out.println("-----TEST EXO18insertion:-----");
		int [] tab18test = new int [] {4,1,9,8};
		System.out.println("avant le tri");
		afficheTab(tab18test);
		System.out.println("apres le tri");
		afficheTab(triInsertion(tab18test));

	//test EXO18 selection:
		System.out.println("-----TEST EXO18sel:-----");
		int []tab18sel = new int [] {7,4,3,8};	
		afficheTab(trisele(tab18sel));
		
	//test EXO18bulle:
		System.out.println("-----TEST EXO18bulle:-----");
		int [] tab18testb = new int [] {2,1,9,8};		
		afficheTab(tribulle(tab18testb));
		
		
			
	//test EXO19:	
		System.out.println(fac(9));
		System.out.println(PGDC(24,987));
	//test EXO19:	
		System.out.println(pascal(1,2));
	
		
	}
}
		
	 

 



	
