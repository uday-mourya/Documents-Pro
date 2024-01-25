import java.util.Scanner;

class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any Number");
        int n = sc.nextInt();
        int i = 1;
        int sum = 0;
        while (i < n) {
            if (n % i == 0) {
                sum = sum + i;
            }
            i++;
        }
        if (sum==n) {
            System.out.println("Perfact Number");
        } else {
            System.out.println("Not Perfact Number");
        }
    }
}