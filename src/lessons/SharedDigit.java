package lessons;

import java.util.Scanner;

public class SharedDigit {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the first number : ");
        int a = in.nextInt();
        System.out.print("Input the second number: ");
        int b = in.nextInt();
        System.out.println("Result: "+hasSharedDigit(a, b));
    }

    public static boolean hasSharedDigit(int p, int q)
    {
        if (p<10 || q>-99)
            return false;
        int x = p % 10;
        int y = q % 10;
        p /= 10;
        q /= 10;
        return (p == q || p == y || x == q || x == y);
    }
}


