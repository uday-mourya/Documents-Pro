
import java.util.Scanner;
//POJO Playin old java object
class DataClass      //POJO Class
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
	
	public void setRoll(int roll)
	{
		this.roll = roll;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public void setFatherName(String fname)
	{
		this.fname = fname;
	}
	public void setMotherName(String mname)
	{
		this.mname = mname;
	}
	public void setCorse(String corse)
	{
		this.corse = corse;
	}
	public void setBranch(String branch)
	{
		this.branch = branch;
	}
	public void setSem(String sem)
	{
		this.sem = sem;
	}
	public void setYear(int year)
	{
		this.year = year;
	}
	public void setPhysics(int physics)
	{
		this.physics = physics;
	}
	public void setChemistry(int chemistry)
	{
		this.chemistry = chemistry;
	}
	public void setMath(int math)
	{
		this.math = math;
	}
	public void setHindi(int hindi)
	{
		this.hindi = hindi;
	}
	public void setEnglish(int english)
	{
		this.english = english;
	}
	public void setTotel()
	{
		this.total = getphysics()+getchemistry()+getmath()+gethindi()+getenglish();
	}
	public void setPer()
	{
		this.per = getTotal()/5.0;
	}
	public int getRollNumber()
	{
		return this.roll;
	}
	public String getName()
	{
		return this.name;
	}
	public String getFName()
	{
		return this.fname;
	}
	public String getMName()
	{
		return this.mname;
	}
	public String getCorse()
	{
		return this.corse;
	}
	public String getBranch()
	{
		return this.branch;
	}
	public String getSem()
	{
		return this.sem;
	}
	public int getYear()
	{
		return this.year;
	}
	public int getphysics()
	{
		return this.physics;
	}
	public int getchemistry()
	{
		return this.chemistry;
	}
	public int getmath()
	{
		return this.math;
	}
	public int gethindi()
	{
		return this.hindi;
	}
	public int getenglish()
	{
		return this.english;
	}
	public double getPer()
	{
		return this.per;
	}
	public int getTotal()
	{
		return this.total;
	}
	
}
class Operation     //BL Class
{
	public void choice(DataClass student[],int n,Operation ob2)
	{
		Scanner sc = new Scanner(System.in);
		
		int choice,searchRoll;
		boolean flag;
		String searchName;
		do
		{
			flag = true;
			System.out.println("Your choices are");
			System.out.println("\t1 For Search by Roll Number");
			System.out.println("\t2 For Search by Name");
			System.out.println("\t3 For Search by Division");
			System.out.println("\t4 For All MarkSheet");
			System.out.println("\t5 For Exit");
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
							ob2.printMarksheet(student,i);
							flag = false;
							break;
						}
					}
					if(flag)
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
							ob2.printMarksheet(student,i);
							flag = false;
						}
					}
					if(flag)
					{
						System.out.print("Enter Name Is Not exist : ");
					}
					break;
				case 3:
					ob2.searchDivision(student,n,ob2);
					break;
					case 4:
					for(int i=0;i<n;i++)
					{
						ob2.printMarksheet(student,i);
					}
					break;
			}
		}while(choice!=5);	
	}
	public void searchDivision(DataClass student[],int n,Operation ob2)
	{
		Scanner sc = new Scanner(System.in);
		boolean flag;
		int choice;
		do
		{
			flag = true;
			System.out.println("Your choices are");
			System.out.println("\t1 For First Division");
			System.out.println("\t2 For Second Division");
			System.out.println("\t3 For Third Division");
			System.out.println("\t6 For Back");
			System.out.print("\tEnter Your choice : ");
			choice = sc.nextInt();
			switch(choice)
			{
				case 1:
					for(int i=0;i<n;i++)
					{
						if(student[i].getPer()>=60&&student[i].getPer()<=100&&student[i].getphysics()>33&&student[i].getchemistry()>33&&student[i].getmath()>33&&student[i].gethindi()>33&&student[i].getenglish()>33)
						{
							ob2.printMarksheet(student,i);
							flag = false;
						}
					}
					if(flag)
					{
						System.out.println("First Division student Not aveleval");
					}
					break;
				case 2:
					for(int i=0;i<n;i++)
					{
						if(student[i].getPer()>=45&&student[i].getPer()<60&&student[i].getphysics()>33&&student[i].getchemistry()>33&&student[i].getmath()>33&&student[i].gethindi()>33&&student[i].getenglish()>33)
						{
							ob2.printMarksheet(student,i);
							flag = false;
						}
					}
					if(flag)
					{
						System.out.println("Second Division student Not aveleval");
					}
					break;
				case 3:
					for(int i=0;i<n;i++)
					{
						if(student[i].getPer()>=33&&student[i].getPer()<45&&student[i].getphysics()>33&&student[i].getchemistry()>33&&student[i].getmath()>33&&student[i].gethindi()>33&&student[i].getenglish()>33)
						{
							ob2.printMarksheet(student,i);
							flag = false;
						}
					}
					if(flag)
					{
						System.out.println("Third Division student Not aveleval");
					}
			}
		}while(choice!=6);
	}
	
	public void printMarksheet(DataClass ref[],int i)
	{	
		Operation ob = new Operation();
		System.out.println("   --------------------------------------------------------------------");
		System.out.println("   |");

		System.out.println("   |\t\t\t\tBU BHOPAL   \n   |                                                   ");
		System.out.println("   |\tName  : " + ref[i].getName() + "\t\t\t\t\tBranch : " + ref[i].getBranch());
		System.out.println("   |\tFName : " + ref[i].getFName() + "\t\t\t\t\tSem    : " + ref[i].getSem());
		System.out.println(  "   |\tMName : " + ref[i].getMName() + "\t\t\t\t\tYear   : " + ref[i].getYear());
		System.out.println("   |\tRoll  : " + ref[i].getRollNumber() + "\t\t\t\t\tCourse : " + ref[i].getCorse() + "\n");
		System.out.println("   --------------------------------------------------------------------");
		System.out.println( "   |\tSubCode      SubName       MaxMarks      MinMarks      ObtMark" );
		System.out.println("   --------------------------------------------------------------------");
		System.out.println( "   |\tBCA100       Physics        100            33            " + ref[i].getphysics() );
		System.out.println("   --------------------------------------------------------------------");
		System.out.println( "   |\tBCA101       chemistry      100            33            " + ref[i].getchemistry() );
		System.out.println("   --------------------------------------------------------------------");
		System.out.println( "   |\tBCA102       math           100            33            " + ref[i].getmath());
		System.out.println("   --------------------------------------------------------------------");
		System.out.println( "   |\tBCA103       hindi          100            33            " + ref[i].gethindi() );
		System.out.println("   --------------------------------------------------------------------");
		System.out.println( "   |\tBCA104       english        100            33            " + ref[i].getenglish());
		System.out.println("   --------------------------------------------------------------------");
		System.out.println( "   |\n   |" );
		ob.division(ref,i);
		System.out.println("\n");
		System.out.println(" --------------------------------------------------------------------");
		
	}
	public void division(DataClass ref[],int i)
	{
		if (ref[i].getphysics() < 33 && ref[i].getchemistry() < 33 &&ref[i].getmath() < 33 &&ref[i].gethindi() < 33 &&ref[i].getenglish() < 33) 
		{
			System.out.println("   |\tFail in All sub");
		} 
		else if ((ref[i].getphysics() < 33 && ref[i].getchemistry() < 33 && ref[i].getmath() < 33 && ref[i].gethindi() < 33) ||(ref[i].getphysics() < 33 && ref[i].getchemistry() < 33 && ref[i].getmath() < 33 & ref[i].getenglish() < 33) ||(ref[i].getphysics() < 33 && ref[i].getmath() < 33 && ref[i].gethindi() < 33 && ref[i].getenglish() < 33) ||(ref[i].getphysics() < 33 && ref[i].getchemistry() < 33 && ref[i].gethindi() < 33 && ref[i].getenglish() < 33) ||(ref[i].getchemistry() < 33 && ref[i].getmath() < 33 && ref[i].gethindi() < 33 && ref[i].getenglish() < 33))
		{
			System.out.println("   |\tStatus     : Fail");
			if (ref[i].getphysics() < 33 && ref[i].getchemistry() < 33 && ref[i].getmath() < 33 && ref[i].gethindi() < 33) 
			{
				System.out.println("   |\tFail in phycics,getchemistry(),mathes,Hindi");
			} 
			else if (ref[i].getphysics() < 33 && ref[i].getchemistry() < 33 && ref[i].getmath() < 33 & ref[i].getenglish() < 33)
			{
				System.out.println("   |\tFail in phycics,chemistry,mathes,enlish");
			} 
			else if (ref[i].getphysics() < 33 && ref[i].getmath() < 33 && ref[i].gethindi() < 33 && ref[i].getenglish() < 33)
			{
				System.out.println("   |\tFail in phycics,mathes,hindi,enlish");
			} 	
			else if (ref[i].getphysics() < 33 && ref[i].getchemistry() < 33 && ref[i].gethindi() < 33 && ref[i].getenglish() < 33)
			{
				System.out.println("   |\tFail in phycics,chemistry,hindi,enlish");
			}
			else if (ref[i].getchemistry() < 33 && ref[i].getmath() < 33 && ref[i].gethindi() < 33 && ref[i].getenglish() < 33)
			{
				System.out.println("   |\tFail in chemistry,mathes,hindi,enlish");
			}
		}
		else if ((ref[i].getphysics() < 33 && ref[i].getchemistry() < 33 && ref[i].getmath() < 33) ||
			(ref[i].getphysics() < 33 && ref[i].getchemistry() < 33 && ref[i].gethindi() < 33) ||
			(ref[i].getphysics() < 33 && ref[i].getmath() < 33 && ref[i].gethindi() < 33) ||
			(ref[i].getchemistry() < 33 && ref[i].getmath() < 33 && ref[i].gethindi() < 33) ||
			(ref[i].getphysics() < 33 && ref[i].getchemistry() < 33 && ref[i].getenglish() < 33) ||
			(ref[i].getmath() < 33 && ref[i].gethindi() < 33 && ref[i].getenglish() < 33) ||
			(ref[i].getchemistry() < 33 && ref[i].gethindi() < 33 && ref[i].getenglish() < 33) ||
			(ref[i].getphysics() < 33 && ref[i].gethindi() < 33 && ref[i].getenglish() < 33) ||
			(ref[i].getenglish() < 33 && ref[i].getmath() < 33 && ref[i].getchemistry() < 33) ||
			(ref[i].getphysics() < 33 && ref[i].getmath() < 33 && ref[i].getenglish() < 33))
		{
			System.out.println("   |\tStatus     : Fail");
			if (ref[i].getphysics() < 33 && ref[i].getchemistry() < 33 && ref[i].getmath() < 33) 
			{
				System.out.println("   |\tFail in physics,chemistry,mathes");
			}
			else if (ref[i].getphysics() < 33 && ref[i].getchemistry() < 33 && ref[i].gethindi() < 33) 
			{
				System.out.println("   |\tFail in physics,chemistry,Hindi");
			}
			else if (ref[i].getphysics() < 33 && ref[i].getmath() < 33 && ref[i].gethindi() < 33) 
			{
				System.out.println("   |\tFail in physics,mathes,hindi");
			} 
			else if (ref[i].getchemistry() < 33 && ref[i].getmath() < 33 && ref[i].gethindi() < 33)
			{
				System.out.println("   |\tFail in chemistry,mathes,hindi");
			}
			else if (ref[i].getphysics() < 33 && ref[i].getchemistry() < 33 && ref[i].getenglish() < 33) 
			{
				System.out.println("   |\tFail in physics,chemistry,enlish");
			}
			else if (ref[i].getchemistry() < 33 && ref[i].gethindi() < 33 && ref[i].getenglish() < 33)
			{
				System.out.println("   |\tFail in chemistry,Hindi,enlish");
			}
			else if (ref[i].getmath() < 33 && ref[i].gethindi() < 33 && ref[i].getenglish() < 33)
				{
				System.out.println("   |\tFail in mathes,Hindi,enlish");
			} 
			else if (ref[i].getphysics() < 33 && ref[i].gethindi() < 33 && ref[i].getenglish() < 33)
			{
				System.out.println("   |\tFail in physics,Hindi,english");
			}
			else if (ref[i].getchemistry() < 33 && ref[i].getmath() < 33 && ref[i].getenglish() < 33)
			{
				System.out.println("   |\tFail in chemistry,mathes,enlish");
			}
			else if (ref[i].getphysics() < 33 && ref[i].getmath() < 33 && ref[i].getenglish() < 33) 
			{
				System.out.println("   |\tFail in physics,mathes,enlish");
			}
		}
		else if ((ref[i].getphysics() < 33 && ref[i].getchemistry() < 33) ||(ref[i].getphysics() < 33 && ref[i].getmath() < 33) ||
			(ref[i].getphysics() < 33 && ref[i].gethindi() < 33) ||(ref[i].getphysics() < 33 && ref[i].getenglish() < 33) ||
			(ref[i].getchemistry() < 33 && ref[i].getmath() < 33) ||(ref[i].getchemistry() < 33 && ref[i].gethindi() < 33) ||
			(ref[i].getchemistry() < 33 && ref[i].getenglish() < 33) ||(ref[i].getmath() < 33 && ref[i].getenglish() < 33) ||
			(ref[i].getmath() < 33 && ref[i].gethindi() < 33) ||(ref[i].gethindi() < 33 && ref[i].getenglish() < 33))
		{
			System.out.println("   |\tStatus     : Supply in two Subject");
			if (ref[i].getphysics() < 33 && ref[i].getchemistry() < 33)
			{
				System.out.println("   |\tFail in physics,chemistry");
			}
			else if (ref[i].getphysics() < 33 && ref[i].getmath() < 33)
			{
				System.out.println("   |\tFail in physics,getmath()es");
			} 
			else if (ref[i].getphysics() < 33 && ref[i].gethindi() < 33) 
			{
				System.out.println("   |\tFail in physics,gethindi()");
			} 
			else if (ref[i].getphysics() < 33 && ref[i].getenglish() < 33)
			{
				System.out.println("   |\tFail in physics,english");
			}
			else if (ref[i].getchemistry() < 33 && ref[i].getmath() < 33) 
			{
				System.out.println("   |\tFail in chemistry,getmath()es");
			}
			else if (ref[i].getchemistry() < 33 && ref[i].gethindi() < 33) 
			{
				System.out.println("   |\tFail in chemistry,Hindi");
			}
			else if (ref[i].getchemistry() < 33 && ref[i].getenglish() < 33)
			{
				System.out.println("   |\tFail in chemistry,english");
			}
			else if (ref[i].getmath() < 33 && ref[i].getenglish() < 33) 
			{
				System.out.println("   |\tFail in Mathes,English");
			} 
			else if (ref[i].getmath() < 33 && ref[i].gethindi() < 33)
			{
				System.out.println("   |\tFail in Mathes,Hindi");
			} 
			else if (ref[i].gethindi() < 33 && ref[i].getenglish() < 33)
			{
				System.out.println("   |\tFail in Hindi,English");
			}
		}
		else if (ref[i].getphysics() < 33 ||ref[i].getchemistry() < 33 ||ref[i].getmath() < 33 ||ref[i].gethindi() < 33 ||ref[i].getenglish() < 33 )
		{
			System.out.println("   |\tStatus     : Supply in Subject");
			if (ref[i].getphysics() < 33) 
			{
				System.out.println("   |\tFail in physics");
			} 
			else if (ref[i].getchemistry() < 33)
				{
				System.out.println("   |\tFail in chemistry");
			} 
			else if (ref[i].getmath() < 33)
				{
				System.out.println("   |\tFail in mathes");
			}
			else if (ref[i].gethindi() < 33) 
				{
				System.out.println("   |\tFail in hindi");
			} else if (ref[i].getenglish() < 33) 
			{
				System.out.println("   |\tFail in English");
			}
		} 
		else 
		{
			System.out.println("   |\tPercentage : " + ref[i].getPer());
			if (ref[i].getPer() >= 60) 
			{
				System.out.println("   |\tStatuse    : Pass");
				System.out.println("   |\tPass in first division");
			} 
			else if (ref[i].getPer() >= 45) 
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
class Mark         //Clinte Class
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
	public void run()
	{
		Scanner sc = new Scanner(System.in);
		Mark ob = new Mark();
		Operation ob1 = new Operation();
		//String corse, name, sem, fname, mname, branch;
		
		//int physics,chemistry,math,hindi,english,year,roll;
		int n;
		DataClass []student = new DataClass[100];
		
		System.out.print("\nEnter number of student : ");
		
		n = sc.nextInt();
		
		for(int i=0;i<n;i++)
		{
			student[i] = new DataClass();
			
			System.out.print("\nEnter Roll number : ");
			student[i].setRoll(ob.takeRoll(student,i));
			sc.nextLine();
			
			System.out.print("\nEnter Your name : ");
			student[i].setName(sc.nextLine());
			
			System.out.print("\nEnter Your Father name : ");
			student[i].setFatherName(sc.nextLine());

			System.out.print("\nEnter Your Mother Name : ");
			student[i].setMotherName(sc.nextLine());
			
			System.out.print("\nEnter Course name : ");
			student[i].setCorse(sc.nextLine());

			System.out.print("\nEnter Your Branch name : ");
			student[i].setBranch(sc.nextLine());

			System.out.print("\nEnter Your Sem : ");
			student[i].setSem(sc.nextLine());
			
			System.out.print("\nEnter Your year : ");
			student[i].setYear(sc.nextInt());
			
			System.out.print("\nEnter marks of phycics : ");
			student[i].setPhysics(ob.takeMark());
			
			System.out.print("\nEnter marks of chemistry : ");
			student[i].setChemistry(ob.takeMark());
			
			System.out.print("\nEnter marks of mathes : ");
			student[i].setMath(ob.takeMark());
			
			System.out.print("\nEnter marks of Hindi : ");
			student[i].setHindi(ob.takeMark());
			
			System.out.print("\nEnter marks of English : ");
			student[i].setEnglish(ob.takeMark());
			student[i].setTotel();
			student[i].setPer();
			
			System.out.println(" _______________________________________________________________________");
			
		}
		ob1.choice(student,n,ob1);
	}
	public static void main(String[]args)
	{
		Mark ob = new Mark();
		ob.run();
	}
}