
import java.util.Scanner;
class DataClass
{
	private String name[];
	private String fname[];
	private String mname[];
	private String name[];
	private String sem[];
	private int year[];
	private String corse[];
	private int roll[];
	private int mark[][5];
	private int total[];
	public void setData(int n)
	{
		name = n;
		fname = n;
		mname = n;
		name =n ;
		sem = n;
		year = n;
		corse = n;
		roll = n;
		total = n;
	}
	public void printMarksheet(int n)
	{
		System.out.println("    _______________________________________________________________________");
		System.out.println("   |");

		System.out.println("   |\t\t\t\tBU BHOPAL   \n   |                                                   ");
		System.out.println("   |\tName  : " + this.name[n] + "\t\t\t\t\tBranch : " + this.branch[n]");
		System.out.println("   |\tFName : " + this.fname[n] + "\t\t\t\t\tSem    : " + this.sem[n]");
		System.out.println(  "   |\tMName : " + this.mname[n] + "\t\t\t\t\tYear   : " + this.year[i]);
		System.out.println("   |\tRoll  : " + this.roll[n] + "\t\t\t\t\tCourse : " + corse + "\n");
		System.out.println( "   |\tSubCode      SubName       MaxMarks      MinMarks      ObtMark" );
		System.out.println( "   |\tBCA100       Physics        100            33            " + mark[0] );
		System.out.println( "   |\tBCA101       chemistry      100            33            " + mark[1] );
		System.out.println( "   |\tBCA102       math           100            33            " + mark[2]);
		System.out.println( "   |\tBCA103       hindi          100            33            " + mark[3] );
		System.out.println( "   |\tBCA104       english        100            33            " + mark[4] +"\n   |\n   |\n   |" );
		System.out.println("   |\tTotal      : " + total);
	}
}

class Mark
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of student");
		int i=0,n = sc.nextInt();
		sc.nextLine();
		while(i<=n)
		{
			System.out.println("Enter Your name");
			name = sc.nextLine();

			System.out.println("Enter Your Father name");
			fname = sc.nextLine();

			System.out.println("Enter Your Mother Name");
			mname = sc.nextLine();

			System.out.println("Enter Course name");
			corse = sc.next();

			System.out.println("Enter Roll number");
			roll = sc.nextInt();

			System.out.println("Enter Your Branch name");
			branch = sc.next();

			System.out.println("Enter Your Sem");
			sem = sc.next();
		}
	}
}

