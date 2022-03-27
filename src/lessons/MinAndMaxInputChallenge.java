package lessons;

import java.util.Scanner;

public class MinAndMaxInputChallenge {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int max = num%10;
        int min = num%10;

        while(num>0){
            if(num%10>max){
                max = num%10;
            }
            num = num/10;
        }
        while(num<0){
            if(num%1<min){
                min = num%1;
            }
            num = num/1;
        }

        System.out.println("enter the min number:"+min);
        System.out.println("enter the max number:"  +max);



    }


}
