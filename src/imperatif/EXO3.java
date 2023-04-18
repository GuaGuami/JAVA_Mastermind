package imperatif;

public class EXO3 
{
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
		
		
				
		
	

		
// Programme de test 
		public static void main(String [] args)
		{
		System.out.println(Duree(5000));//测试的时候调用回方法，函数整个公式飙上去
		//Printl SHI LLLLL
		}
}


