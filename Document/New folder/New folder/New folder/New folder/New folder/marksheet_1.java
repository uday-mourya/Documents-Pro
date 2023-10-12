
import java.util.Scanner;
class Mark
{
	public static void main(String[]args)
	{
		int total,year,n,i=0;
		double per;
		boolean flag;
		String corse, name, sem, fname, mname, branch;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of student");
		n = sc.nextInt();
		int mark[] = new int[5];
		int roll[] = new int [n];
		sc.nextLine();
		while(i<n)
		{
			System.out.println("Enter Your name");
			name = sc.nextLine();

			System.out.println("Enter Your Father name");
			fname = sc.nextLine();

			System.out.println("Enter Your Mother Name");
			mname = sc.nextLine();

			System.out.println("Enter Course name");
			corse = sc.next();

			do
			{
				System.out.println("Enter roll number ");
				roll[i] = sc.nextInt();
				flag = false;
				for(int j = 0;i>0&&j<i;j++)
				{
					if(roll[j]==roll[i])
					{
						System.out.println("Duplicate Roll Number");
						flag = true;
					}
				}				
			}while(flag);
			System.out.println("Enter Your Branch name");
			branch = sc.next();

			System.out.println("Enter Your Sem");
			sem = sc.next();

			System.out.println("Enter Your Year");
			year = sc.nextInt();
			
			do
			{
				System.out.println("Enter marks of phycics");
				mark[0] = sc.nextInt();
				if(mark[0]<0||mark[0]>100)
				{
				System.out.println("Invalide marks of phycics !");
				}
			}while (mark[0]<0||mark[0]>100);  
			do
			{
				System.out.println("Enter marks of chemistry");
				mark[1] = sc.nextInt();
				if(mark[1]<0||mark[1]>100)
				{
					System.out.println("Invalide marks of chemistry !");
				}
			}while (mark[1]<0||mark[1]>100);
			do
			{
		
				System.out.println("Enter marks of math");
				mark[2] = sc.nextInt();
				if(mark[2]<0||mark[2]>100)
				{
				System.out.println("Invalide marks of math !");
				}
			}while (mark[2]<0||mark[2]>100);
			do
			{
			
				System.out.println("Enter marks of hindi");
				mark[3] = sc.nextInt();
				if(mark[3]<0||mark[3]>100)
				{
					System.out.println("Invalide marks of hindi !");
				}	
			}while (mark[3]<0||mark[3]>100);
			do
			{
				
				System.out.println("Enter marks of english");
				mark[4] = sc.nextInt();
				if(mark[4]<0||mark[4]>100)
				{
					System.out.println("Invalide marks of english !");
				}	
			}while (mark[4]<0||mark[4]>100);
				total = mark[0] + mark[1] + mark[2] + mark[3] + mark[4];
				System.out.println("    _______________________________________________________________________");
				System.out.println("   |");

				System.out.println("   |\t\t\t\tBU BHOPAL   \n   |                                                   ");
				System.out.println("   |\tName  : " + name + "\t\t\t\t\tBranch : " + branch + "   "            );
				System.out.println("   |\tFName : " + fname + "\t\t\t\t\tSem    : " + sem + "      "        );
				System.out.println(  "   |\tMName : " + mname + "\t\t\t\t\tYear   : " + year  );
				System.out.println("   |\tRoll  : " + roll[i] + "\t\t\t\t\tCourse : " + corse +  "   \n   |"  );
				System.out.println( "   |\tSubCode      SubName       MaxMarks      MinMarks      ObtMark" );
				System.out.println( "   |\tBCA100       Physics        100            33            " + mark[0] );
				System.out.println( "   |\tBCA101       chemistry      100            33            " + mark[1] );
				System.out.println( "   |\tBCA102       math           100            33            " + mark[2]);
				System.out.println( "   |\tBCA103       hindi          100            33            " + mark[3] );
				System.out.println( "   |\tBCA104       english        100            33            " + mark[4] +"\n   |\n   |\n   |" );
				System.out.println("   |\tTotal      : " + total);
				if (mark[0] < 33 && mark[1] < 33 &&mark[2] < 33 &&mark[3] < 33 &&mark[4] < 33) 
				{
				System.out.println("   |\tFail in All sub");
				} 
				else if ((mark[0] < 33 && mark[1] < 33 && mark[2] < 33 && mark[3] < 33) ||(mark[0] < 33 && mark[1] < 33 && mark[2] < 33 & mark[4] < 33) ||(mark[0] < 33 && mark[2] < 33 && mark[3] < 33 && mark[4] < 33) ||(mark[0] < 33 && mark[1] < 33 && mark[3] < 33 && mark[4] < 33) ||(mark[1] < 33 && mark[2] < 33 && mark[3] < 33 && mark[4] < 33))
				{
					System.out.println("   |\tStatus     : Fail");
				if (mark[0] < 33 && mark[1] < 33 && mark[2] < 33 && mark[3] < 33) 
				{
					System.out.println("   |\tFail in phycics,mark[1],mark[2]es,mark[3]");
				} 
					else if (mark[0] < 33 && mark[1] < 33 && mark[2] < 33 & mark[4] < 33)
					{
						System.out.println("   |\tFail in phycics,mark[1],mark[2]es,enlish");
					} 
					else if (mark[0] < 33 && mark[2] < 33 && mark[3] < 33 && mark[4] < 33)
					{
						System.out.println("   |\tFail in phycics,mark[2]es,mark[3],enlish");
					} 
					else if (mark[0] < 33 && mark[1] < 33 && mark[3] < 33 && mark[4] < 33)
					{
					System.out.println("   |\tFail in phycics,mark[1],mark[3],enlish");
					}
					else if (mark[1] < 33 && mark[2] < 33 && mark[3] < 33 && mark[4] < 33)
					{
					System.out.println("   |\tFail in mark[1],mark[2]es,mark[3],enlish");
					}
				}
				else if ((mark[0] < 33 && mark[1] < 33 && mark[2] < 33) ||
					(mark[0] < 33 && mark[1] < 33 && mark[3] < 33) ||
					(mark[0] < 33 && mark[2] < 33 && mark[3] < 33) ||
					(mark[1] < 33 && mark[2] < 33 && mark[3] < 33) ||
					(mark[0] < 33 && mark[1] < 33 && mark[4] < 33) ||
					(mark[2] < 33 && mark[3] < 33 && mark[4] < 33) ||
					(mark[1] < 33 && mark[3] < 33 && mark[4] < 33) ||
					(mark[0] < 33 && mark[3] < 33 && mark[4] < 33) ||
					(mark[4] < 33 && mark[2] < 33 && mark[1] < 33) ||
					(mark[0] < 33 && mark[2] < 33 && mark[4] < 33))
				{
					System.out.println("   |\tStatus     : Fail");
					if (mark[0] < 33 && mark[1] < 33 && mark[2] < 33) 
					{
						System.out.println("   |\tFail in physics,chemistry,math");
					}
					else if (mark[0] < 33 && mark[1] < 33 && mark[3] < 33) 
					{
						System.out.println("   |\tFail in phycics,chemistry,hindi");
					}
					else if (mark[0] < 33 && mark[2] < 33 && mark[3] < 33) 
					{
						System.out.println("   |\tFail in physics,math,hindi");
					} 
					else if (mark[1] < 33 && mark[2] < 33 && mark[3] < 33)
					{
						System.out.println("   |\tFail in chemistry,mathes,hindi");
					}
					else if (mark[0] < 33 && mark[1] < 33 && mark[4] < 33) 
					{
						System.out.println("   |\tFail in physics,chemistry,enlish");
					}
					else if (mark[1] < 33 && mark[3] < 33 && mark[4] < 33)
					{
						System.out.println("   |\tFail in chemistry,hindi,enlish");
					}
					else if (mark[2] < 33 && mark[3] < 33 && mark[4] < 33)
						{
						System.out.println("   |\tFail in mathes,hindi,enlish");
					} 
					else if (mark[0] < 33 && mark[3] < 33 && mark[4] < 33)
					{
						System.out.println("   |\tFail in physics,hindi,english");
					}
					else if (mark[1] < 33 && mark[2] < 33 && mark[4] < 33)
					{
						System.out.println("   |\tFail in chemistry,mathes,enlish");
					}
					else if (mark[0] < 33 && mark[2] < 33 && mark[4] < 33) 
					{
						System.out.println("   |\tFail in phycics,mathes,enlish");
					}
				}
				else if ((mark[0] < 33 && mark[1] < 33) ||(mark[0] < 33 && mark[2] < 33) ||
					(mark[0] < 33 && mark[3] < 33) ||(mark[0] < 33 && mark[4] < 33) ||
					(mark[1] < 33 && mark[2] < 33) ||(mark[1] < 33 && mark[3] < 33) ||
					(mark[1] < 33 && mark[4] < 33) ||(mark[2] < 33 && mark[4] < 33) ||
					(mark[2] < 33 && mark[3] < 33) ||(mark[3] < 33 && mark[4] < 33))
				{
					System.out.println("   |\tStatus     : Supply in two Subject");
					if (mark[0] < 33 && mark[1] < 33)
					{
					System.out.println("   |\tFail in physics,chemistry");
					}
					else if (mark[0] < 33 && mark[2] < 33)
					{
						System.out.println("   |\tFail in physics,mathes");
					} 
					else if (mark[0] < 33 && mark[3] < 33) 
					{
					System.out.println("   |\tFail in physics,mark[3]");
					} 
					else if (mark[0] < 33 && mark[4] < 33)
					{
						System.out.println("   |\tFail in physics,english");
					}
					else if (mark[1] < 33 && mark[2] < 33) 
					{
						System.out.println("   |\tFail in chemistry,mathes");
					}
					else if (mark[1] < 33 && mark[3] < 33) 
					{
						System.out.println("   |\tFail in chemistry,hindi");
					}
					else if (mark[1] < 33 && mark[4] < 33)
					{
						System.out.println("   |\tFail in chemistry,english");
					}
					else if (mark[2] < 33 && mark[4] < 33) 
					{
						System.out.println("   |\tFail in mathes,english");
					} 
					else if (mark[2] < 33 && mark[3] < 33)
					{
						System.out.println("   |\tFail in mathes,hindi");
					} 
					else if (mark[3] < 33 && mark[4] < 33)
					{
						System.out.println("   |\tFail in hindi,english");
					}
				}
				else if (mark[0] < 33 ||mark[1] < 33 ||mark[2] < 33 ||mark[3] < 33 ||mark[4] < 33 )
				{
					System.out.println("   |\tStatus     : Supply in Subject");
					if (mark[0] < 33) 
					{
						System.out.println("   |\tFail in physics");
					} 
					else if (mark[1] < 33)
						{
						System.out.println("   |\tFail in chemistry");
					} 
					else if (mark[2] < 33)
						{
						System.out.println("   |\tFail in mathes");
					}
					else if (mark[3] < 33) 
						{
						System.out.println("   |\tFail in hindi");
					} else if (mark[4] < 33) 
					{
						System.out.println("   |\tFail in english");
					}
				} 
				else 
				{
					per = total / 5.0;
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
				System.out.println("   |_______________________________________________________________________");
			i++;
			sc.nextLine();
			System.out.println("\n\n");
		}
	}
}

