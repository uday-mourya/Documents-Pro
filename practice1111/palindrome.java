import java.util.Scanner;

class Palindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any Number");
		int n = sc.nextInt();
		int rev = 0;
		int m = n;
		while (n > 0) {
			int r = n % 10;
			rev = rev * 10 + r;
			n = n / 10;

		}
		if (rev == m)
			System.out.println("NO. Is Palindrome");
		else
			System.out.println("Not Palindrome");
	}
}
