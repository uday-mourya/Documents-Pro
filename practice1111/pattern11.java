import java.util.Scanner;
class Test{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number");
        int n=sc.nextInt();


        for(int i=0;i<n;i++){
            for(int j=0;j<=i*3;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}