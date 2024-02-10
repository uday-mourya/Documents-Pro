import java.util.Scanner;
class Armstrong
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		int n=sc.nextInt();
		int m=n,k=0,rev=0,r=0;
		while(n>0)
		{
			r=n%10;
			k=r*r*r;
			rev=rev+k;
			n=n/10;	
		}
		  if(m==sum)
		  {
			System.out.println("num armstrong");
		  }
		  else
			System.out.println(" num is not armstrong");
	}
}