import java.util.Scanner;


class PrimeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Starting Point: ");
        int startingpoint = scanner.nextInt();

        System.out.print("Enter Ending Point: ");
        int endingpoint = scanner.nextInt();

        System.out.println("Prime numbers between " + startingpoint + " and " + endingpoint + " are:");
        
        for (int i = startingpoint; i <= endingpoint; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
