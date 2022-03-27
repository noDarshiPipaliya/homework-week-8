package lessons;

import java.util.Scanner;

public class EvenDigits {

    public static void main(String[] args)
    {
        int number, evenSum = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print(" Please Enter any Number : ");
        number = sc.nextInt();

        evenSum = evendigitsum(number);

        System.out.println("\n The Sum of Even Numbers upto " + number + "  =  " + evenSum);
    }
    public static int evendigitsum(int num)
    {
        int i, sum = 0;
        for(i = 1; i <= num; i++)
        {
            if(i % 2 == 0)
            {
                sum = sum + i;
            }
        }
        return sum;
    }
}



