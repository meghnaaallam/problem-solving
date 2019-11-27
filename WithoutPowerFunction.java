public class WithoutPowerFunction {

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		long result=1;
		int exponent,base;
	System.out.println("enter base value");
	System.out.println("enter exponent value");
	Scanner sc=new Scanner(System.in);
     base=sc.nextInt();
	exponent=sc.nextInt();
	while(exponent!=0)
	{
		result=result*base;
		--exponent;
	}
		System.out.println("result is:"+result);
	}
	}
