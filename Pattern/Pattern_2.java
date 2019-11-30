/*
* * * * *
    * * * *
        * * *
          * *
            *
     */
     public class Pattern {
	public static void main(String[] args)
	{
		int i,j;
    System.out.println("enter any number");
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    for(i=0;i<n;i++)
    {
    	int k=0;
    	while(k!=(2*i))
    	{
    		System.out.print(" ");
    		k++;
    	}
    	for(j=i;j<n;j++)
    	{
    		System.out.print("*");
    	}
    	System.out.println();
    }
    }
}
