package lessons;

import java.util.Scanner;

public class FirstAndLastDigit {

    public static void main(String args[]) {

        int r, n, rev = 0, fd, ld, s;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        n = sc.nextInt();

        ld = n % 10;

        while (n > 0) {
            r = n % 10;
            rev = rev * 10 + r;
            n = n / 10;
        }

        fd = rev % 10;
        s = fd + ld;

        System.out.println("Sum of first and last digits:" + s);

    }
}









