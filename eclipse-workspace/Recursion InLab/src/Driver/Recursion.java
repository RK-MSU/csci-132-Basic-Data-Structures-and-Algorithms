package Driver;

public class Recursion {
	public static int test = 1;
	public static int gcd = 1;
	public static boolean pal = false;
	
	public static void test(String a)
	{
		System.out.println(a.length());
		System.out.println(a.charAt(0));
		System.out.println(a.charAt(4));
	}
	public static boolean checkPalindrome(String a)
	{
		if(a.contains(" ")){
			String fix = a.substring(0,a.indexOf(" ")) + a.substring(a.indexOf(" ")+1, a.length());
			checkPalindrome(fix);
		}
		else
		{
		a = a.toLowerCase();
		//if the length is 1, it must be a palindrome
		
		 if( a.length() % 2 == 0 && a.length() == 2 && a.charAt(0) == a.charAt(1))
		{
			pal = true;
		}
		else if(a.charAt(0) == a.charAt(a.length()-1) )
		{
			if(a.length() > 3){
				String newStr = a.substring(1,a.length()-1);
				checkPalindrome(newStr);
			}
			else if(a.length() == 3)
			{
				pal = true;
			}
		}
	
		else{
			pal = false;
		}
		}
			return pal;
		
		
		
		
	}
	public static int gcd(double x, double y) {
		
		
		if(x%test == 0 && y%test == 0 ){
			gcd = test;
			test++;
			gcd(x, y);
		}
		
		else{
			if(test >= y){
				test = 1;
				return gcd; 
				}
		 test++;
		 gcd(x, y); 
		 }
		
		test = 1;
		return gcd;
		
	}

}
