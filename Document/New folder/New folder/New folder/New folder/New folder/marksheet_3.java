
import java.util.Scanner;

//POJO Play in old java object
class DataClass         //BL
{
	private String name;
	private String fname;
	private String mname;
	private String sem;
	private String branch;
	private int year;
	private int total;
	private double per;
	private String corse;
	private  int roll;	
	private int physics;
	private int chemistry;
	private int math;
	private int hindi;
	private int english;
	
	public DataClass(int roll,String name,String fname,String mname,String corse,String branch,String sem,int year,int physics,int chemistry,int math,int hindi,int english)
	{
		this.name  = name;
		this.fname = fname;
		this.mname = mname;
		this.sem   = sem;	
		this.branch = branch;
		this.year  = year;
		this.corse = corse;
		this.roll  = roll;
		this.physics = physics;
		this.chemistry = chemistry;
		this.math = math;
		this.hindi = hindi;
		this.english = english;	
		this.total =	this.physics+this.chemistry+this.math+this.hindi+this.english;
		this.per = total/5.0;
	}
	public int getRollNumber()
	{
		return this.roll;
	}
	public String getName()
	{
		return this.name;
	}
	public double getPer()
	{
		return this.per;
	}
	public void printMarksheet()
	{
		System.out.println("_______________________________________________________________________");
		System.out.println("   |");

		System.out.println("   |\t\t\t\tBU BHOPAL   \n   |                                                   ");
		System.out.println("   |\tName  : " + this.name + "\t\t\t\t\tBranch : " + this.branch);
		System.out.println("   |\tFName : " + this.fname + "\t\t\t\t\tSem    : " + this.sem);
		System.out.println(  "   |\tMName : " + this.mname + "\t\t\t\t\tYear   : " + this.year);
		System.out.println("   |\tRoll  : " + this.roll + "\t\t\t\t\tCourse : " + corse + "\n");
		System.out.println( "   |\tSubCode      SubName       MaxMarks      MinMarks      ObtMark" );
		System.out.println( "   |\tBCA100       Physics        100            33            " + this.physics );
		System.out.println( "   |\tBCA101       chemistry      100            33            " + this.chemistry );
		System.out.println( "   |\tBCA102       math           100            33            " + this.math);
		System.out.println( "   |\tBCA103       hindi          100            33            " + this.hindi );
		System.out.println( "   |\tBCA104       english        100            33            " + this.english +"\n   |\n   |" );
		this.division();
		System.out.println("\n");
		System.out.println(" _______________________________________________________________________");
		
	}
	public void division()
	{
		if (physics < 33 && chemistry < 33 &&math < 33 &&hindi < 33 &&english < 33) 
		{
			System.out.println("   |\tFail in All sub");
		} 
		else if ((physics < 33 && chemistry < 33 && math < 33 && hindi < 33) ||(physics < 33 && chemistry < 33 && math < 33 & english < 33) ||(physics < 33 && math < 33 && hindi < 33 && english < 33) ||(physics < 33 && chemistry < 33 && hindi < 33 && english < 33) ||(chemistry < 33 && math < 33 && hindi < 33 && english < 33))
		{
			System.out.println("   |\tStatus     : Fail");
			if (physics < 33 && chemistry < 33 && math < 33 && hindi < 33) 
			{
				System.out.println("   |\tFail in phycics,chemistry,mathes,Hindi");
			} 
			else if (physics < 33 && chemistry < 33 && math < 33 & english < 33)
			{
				System.out.println("   |\tFail in phycics,chemistry,mathes,enlish");
			} 
			else if (physics < 33 && math < 33 && hindi < 33 && english < 33)
			{
				System.out.println("   |\tFail in phycics,mathes,hindi,enlish");
			} 	
			else if (physics < 33 && chemistry < 33 && hindi < 33 && english < 33)
			{
				System.out.println("   |\tFail in phycics,chemistry,hindi,enlish");
			}
			else if (chemistry < 33 && math < 33 && hindi < 33 && english < 33)
			{
				System.out.println("   |\tFail in chemistry,mathes,hindi,enlish");
			}
		}
		else if ((physics < 33 && chemistry < 33 && math < 33) ||
			(physics < 33 && chemistry < 33 && hindi < 33) ||
			(physics < 33 && math < 33 && hindi < 33) ||
			(chemistry < 33 && math < 33 && hindi < 33) ||
			(physics < 33 && chemistry < 33 && english < 33) ||
			(math < 33 && hindi < 33 && english < 33) ||
			(chemistry < 33 && hindi < 33 && english < 33) ||
			(physics < 33 && hindi < 33 && english < 33) ||
			(english < 33 && math < 33 && chemistry < 33) ||
			(physics < 33 && math < 33 && english < 33))
		{
			System.out.println("   |\tStatus     : Fail");
			if (physics < 33 && chemistry < 33 && math < 33) 
			{
				System.out.println("   |\tFail in physics,chemistry,mathes");
			}
			else if (physics < 33 && chemistry < 33 && hindi < 33) 
			{
				System.out.println("   |\tFail in physics,chemistry,Hindi");
			}
			else if (physics < 33 && math < 33 && hindi < 33) 
			{
				System.out.println("   |\tFail in physics,mathes,hindi");
			} 
			else if (chemistry < 33 && math < 33 && hindi < 33)
			{
				System.out.println("   |\tFail in chemistry,mathes,hindi");
			}
			else if (physics < 33 && chemistry < 33 && english < 33) 
			{
				System.out.println("   |\tFail in physics,chemistry,enlish");
			}
			else if (chemistry < 33 && hindi < 33 && english < 33)
			{
				System.out.println("   |\tFail in chemistry,Hindi,enlish");
			}
			else if (math < 33 && hindi < 33 && english < 33)
				{
				System.out.println("   |\tFail in mathes,Hindi,enlish");
			} 
			else if (physics < 33 && hindi < 33 && english < 33)
			{
				System.out.println("   |\tFail in physics,Hindi,english");
			}
			else if (chemistry < 33 && math < 33 && english < 33)
			{
				System.out.println("   |\tFail in chemistry,mathes,enlish");
			}
			else if (physics < 33 && math < 33 && english < 33) 
			{
				System.out.println("   |\tFail in physics,mathes,enlish");
			}
		}
		else if ((physics < 33 && chemistry < 33) ||(physics < 33 && math < 33) ||
			(physics < 33 && hindi < 33) ||(physics < 33 && english < 33) ||
			(chemistry < 33 && math < 33) ||(chemistry < 33 && hindi < 33) ||
			(chemistry < 33 && english < 33) ||(math < 33 && english < 33) ||
			(math < 33 && hindi < 33) ||(hindi < 33 && english < 33))
		{
			System.out.println("   |\tStatus     : Supply in two Subject");
			if (physics < 33 && chemistry < 33)
			{
				System.out.println("   |\tFail in physics,chemistry");
			}
			else if (physics < 33 && math < 33)
			{
				System.out.println("   |\tFail in physics,mathes");
			} 
			else if (physics < 33 && hindi < 33) 
			{
				System.out.println("   |\tFail in physics,Hindi");
			} 
			else if (physics < 33 && english < 33)
			{
				System.out.println("   |\tFail in physics,english");
			}
			else if (chemistry < 33 && math < 33) 
			{
				System.out.println("   |\tFail in chemistry,mathes");
			}
			else if (chemistry < 33 && hindi < 33) 
			{
				System.out.println("   |\tFail in chemistry,Hindi");
			}
			else if (chemistry < 33 && english < 33)
			{
				System.out.println("   |\tFail in chemistry,english");
			}
			else if (math < 33 && english < 33) 
			{
				System.out.println("   |\tFail in Mathes,English");
			} 
			else if (math < 33 && hindi < 33)
			{
				System.out.println("   |\tFail in Mathes,Hindi");
			} 
			else if (hindi < 33 && english < 33)
			{
				System.out.println("   |\tFail in Hindi,English");
			}
		}
		else if (physics < 33 ||chemistry < 33 ||math < 33 ||hindi < 33 ||english < 33 )
		{
			System.out.println("   |\tStatus     : Supply in Subject");
			if (physics < 33) 
			{
				System.out.println("   |\tFail in physics");
			} 
			else if (chemistry < 33)
				{
				System.out.println("   |\tFail in chemistry");
			} 
			else if (math < 33)
				{
				System.out.println("   |\tFail in mathes");
			}
			else if (hindi < 33) 
				{
				System.out.println("   |\tFail in hindi");
			} else if (english < 33) 
			{
				System.out.println("   |\tFail in English");
			}
		} 
		else 
		{
			//System.out.println("   |Total = "+total);
			System.out.println("   |\tPercentage : " + per);
			if (per >= 60) 
			{
				System.out.println("   |\tStatuse    : Pass");
				System.out.println("   |\tPass in first division");
			} 
			else if (per >= 45) 
			{
				System.out.println("   |\tStatuse : Pass");
				System.out.println("   |\tPass in Second division");
			}
			else 
			{
				System.out.println("   |\tStatuse : Pass");
				System.out.println("   |\tPass in Third division");
			}
		}
	}	
}

class Mark
{ 
	public int takeRoll(DataClass student[],int i)
	{
		Scanner sc = new Scanner(System.in);
		boolean flag;
		int roll;
		do
		{
			roll= sc.nextInt();
			flag = false;
			for(int j = 0;i>0&&j<i;j++)
			{
				if(student[j].getRollNumber()==roll)
				{
					System.out.println("Duplicate Roll Number Please Enter agen roll number");
					flag = true;
				}
			}				
		}while(flag);
		return roll;
	}
	public int takeMark()
	{
		Scanner sc = new Scanner(System.in);
		int mark;
		do
		{
			mark = sc.nextInt();
			if(mark<0||mark>100)
			{
				System.out.println("Invalide marks of Please enter Agen mark!");
			}
		}while (mark<0||mark>100);
		return mark;
	}
	public void choice(DataClass student[],int n)
	{
		Scanner sc = new Scanner(System.in);
		
		int choice,searchRoll,count;
		String searchName;
		do
		{
			count = 0;
			System.out.println("Your choices are");
			System.out.println("\t1 For Search by Roll Number");
			System.out.println("\t2 For Search by Name");
			System.out.println("\t3 For Search by Division");
			System.out.println("\t4 For Back");
			System.out.print("\tEnter Your choice : ");
			choice = sc.nextInt();
			sc.nextLine();
			switch(choice)
			{
				case 1:
					System.out.print("Enter Your Roll Number : ");
					searchRoll = sc.nextInt();
					for(int i=0;i<n;i++)
					{
						if(student[i].getRollNumber()==searchRoll)
						{
							student[i].printMarksheet();
							count++;
							break;
						}
					}
					if(count==0)
					{
						System.out.print("Enter Roll Number Is Not exist : ");
					}
					break; 
				case 2:
					System.out.print("Enter Your Name : ");
					searchName = sc.nextLine();
					
					for(int i=0;i<n;i++)
					{
						if(student[i].getName().equals(searchName))
						{
							student[i].printMarksheet();
							count++;
						}
					}
					if(count==0)
					{
						System.out.print("Enter Name Is Not exist : ");
					}
					break;
				case 3:
					do
					{
						count = 0;
						System.out.println("Your choices are");
						System.out.println("\t1 For First Division");
						System.out.println("\t2 For Second Division");
						System.out.println("\t3 For Third Division");
						System.out.println("\t5 For Back");
						System.out.print("\tEnter Your choice : ");
						choice = sc.nextInt();
						switch(choice)
						{
							case 1:
								for(int i=0;i<n;i++)
								{
									if(student[i].getPer()>=60&&student[i].getPer()<=100)
									{
										student[i].printMarksheet();
										count++;
									}
								}
								if(count==0)
								{
									System.out.println("First Division student Not aveleval");
								}
								break;
							case 2:
								for(int i=0;i<n;i++)
								{
									if(student[i].getPer()>=45&&student[i].getPer()<60)
									{
										student[i].printMarksheet();
										count++;
									}
								}
								if(count==0)
								{
									System.out.println("Second Division student Not aveleval");
								}
								break;
							case 3:
								for(int i=0;i<n;i++)
								{
									if(student[i].getPer()>=33&&student[i].getPer()<45)
									{
										student[i].printMarksheet();
										count++;
									}
								}
								if(count==0)
								{
									System.out.println("Third Division student Not aveleval");
								}
						}
					}while(choice!=5);
			}
		}while(choice!=4);	
	}
	public void run()
	{
		Scanner sc = new Scanner(System.in);
		Mark ob = new Mark();
		String corse, name, sem, fname, mname, branch;
		
		int physics,chemistry,math,hindi,english,year,roll,n;
		
		DataClass []student = new DataClass[100];
		
		System.out.print("\nEnter number of student : ");
		
		n = sc.nextInt();
		
		for(int i=0;i<n;i++)
		{
			System.out.print("\nEnter Roll number : ");
			roll = ob.takeRoll(student,i);
			
			sc.nextLine();
			
			System.out.print("\nEnter Your name : ");
			name = sc.nextLine();

			System.out.print("\nEnter Your Father name : ");
			fname = sc.nextLine();

			System.out.print("\nEnter Your Mother Name : ");
			mname = sc.nextLine();
			
			System.out.print("\nEnter Course name : ");
			corse = sc.next();

			System.out.print("\nEnter Your Branch name : ");
			branch = sc.next();

			System.out.print("\nEnter Your Sem : ");
			sem = sc.next();
			
			System.out.print("\nEnter Your year : ");
			year = sc.nextInt();
			
			System.out.print("\nEnter marks of phycics : ");
			physics = ob.takeMark();
			
			System.out.print("\nEnter marks of chemistry : ");
			chemistry = ob.takeMark();
			
			System.out.print("\nEnter marks of mathes : ");
			math = ob.takeMark();
			
			System.out.print("\nEnter marks of Hindi : ");
			hindi = ob.takeMark();
			
			System.out.print("\nEnter marks of English : ");
			english = ob.takeMark();
			
			student[i] = new DataClass(roll,name,fname,mname,corse,branch,sem,year,physics,chemistry,math,hindi,english);
			System.out.println(" _______________________________________________________________________");
			
		}

		ob.choice(student,n);
	}
	public static void main(String[]args)
	{
		Mark ob = new Mark();
		ob.run();
	}
}