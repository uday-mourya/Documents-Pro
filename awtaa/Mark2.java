import java.util.Scanner;

 class Student {
    private int roll;
    private String name;
    private String Fname;
    private String Mname;
    private String course;
    private String branch;
    private String sem;
    private String year;
    private int p;
    private int c;
    private int m;
    private int e;
    private int h;
    
    
    public Student(int roll, String name, String Fname, String Mname, String course, String branch, String sem, String year, int p, int c,int m,int e,int h)    {
          this.roll=roll;
          this.name=name;
          this.Fname=Fname;
          this.Mname=Mname;
          this.course=course;
          this.branch=branch;
          this.sem=sem;
          this.year=year;
          this.p=p;
          this.c=c;
          this.m=m;
          this.e=e;
          this.h=h;

    }

    public int getRoll()
    {
        return roll;
    }
    public void setRoll(int roll) {
        this.roll=roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFName() {
        return Fname;
    }
    public void setFName(String Fname) {
        this.Fname=Fname;
    }

    public String getMName() {
        return Mname;
    }

    public void setMName(String Mname) {
        this.Mname = Mname;
    }

    public String getCourse() {
        return course;
    }
    
    public void setCourse(String course) {
        this.course = course;
    }
    
    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch){
        this.branch=branch;
    }
    
    public String getSem() {
        return sem;
    }

    public void setSem(String sem){
        this.sem=sem;
    }
    
    public String getYear(){
        return year;
    }
    
    public void setYear(String year){
        this.year=year;
    }
    
    public int getP(){
        return p;
    } 

    public void setP(int p){
        this.p=p;
    }

     public int getC(){
        return c;
    } 

    public void setC(int c){
        this.c=c;
    }

     public int getM(){
        return m;
    } 

    public void setM(int m){
        this.m=m;
    }

     public int getE(){
        return e;
    } 

    public void setE(int e){
        this.e=e;
    }

     public int getH(){
        return h;
    } 

    public void setH(int h){
        this.h=h;
    }
   
}
class MarksException extends RuntimeException
{
      MarksException(){}
      MarksException(String msg){
          super(msg);
      }
}
 class StudentProcessor {

    Scanner scanner=new Scanner(System.in);
    
    public void processStudents(Student[] std) {
        
        for (Student ob : std) {
            System.out.println("___________________________________________________________________________________________");
            System.out.println("                                       DAVV-INDORE                                         ");
            System.out.println("                                                                                           ");
            System.out.println("  Roll no.: " + ob.getRoll() +"    \t  \t  \t  \t  \t       "+"Course  : " + ob.getCourse() );
            System.out.println("  Name    : " + ob.getName() +"    \t  \t  \t  \t  \t       "+"Branch  : " + ob.getBranch() );
            System.out.println("  FName   : " + ob.getFName()+"    \t  \t  \t  \t  \t       "+"Semester: " + ob.getSem()    );
            System.out.println("  MName   : " + ob.getMName()+"    \t  \t  \t  \t  \t       "+"Year    : " + ob.getYear()   );
            System.out.println("-------------------------------------------------------------------------------------------");
            System.out.println("  Sub-Code          Sub-Name          Min-Marks          Max-Marks          Obtain-Marks   ");
            System.out.println("-------------------------------------------------------------------------------------------");
            System.out.println("  cse-501           Physics              33                70                 "+ ob.getP()  );
            System.out.println("  cse-502           Chemistry            33                70                 "+ ob.getC()  );
            System.out.println("  cse-503           Maths                33                70                 "+ ob.getM()  );
            System.out.println("  cse-504           English              33                70                 "+ ob.getE()  );
            System.out.println("  cse-505           Hindi                33                70                 "+ ob.getH()  );
            System.out.println("___________________________________________________________________________________________");           
        }
    }
    public void Input(Student[] std) {

         for (int i = 0; i < std.length; i++) {
            System.out.println("Enter details for Students " + (i + 1) + ":");

            System.out.print("Roll: ");
            int roll=scanner.nextInt();
            scanner.nextLine();
            
            System.out.print("Name: ");
            String name = scanner.nextLine();
            
            System.out.print("Father name: ");
            String Fname = scanner.nextLine();
            
            System.out.print("Mother name: ");
            String Mname = scanner.nextLine();
            
            System.out.print("Course: ");
            String course = scanner.nextLine();

            System.out.print("Branch: ");
            String branch = scanner.nextLine();

            System.out.print("Semester: ");
            String sem =scanner.nextLine();

            System.out.println("Year: ");
            String year=scanner.nextLine();
      
            System.out.print("Physics: ");
            int p=scanner.nextInt();               
             
            System.out.print("Chemistry: ");
            int c=scanner.nextInt();
            
            System.out.print("Maths: ");
            int m=scanner.nextInt(); 
           
            System.out.print("English: ");
            int e=scanner.nextInt();
            
            System.out.print("Hindi: ");
            int h=scanner.nextInt();
            
            std[i] = new Student(roll, name, Fname, Mname, course, branch, sem, year, p, c, m, e, h);         
            
        }
        
    }
}

 class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        StudentProcessor processor = new StudentProcessor();

        System.out.println("Enter how many values you want to enter");
        
        int n=scanner.nextInt();

        Student[] std = new Student[n];
        
        processor.Input(std);
        
        processor.processStudents(std);
    }
}
