/*
Brandon Miller
ITSE-1302
4/4/17
*/

import java.util.Scanner;

public class sumvalue {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an even number above 2");
        int num = input.nextInt();
        if (num >= 2 && num % 2==0) 
        {
            int sum = 0;
            for (int i = 2; i <= num; i +=2)
            {
                sum += i;
            }
            System.out.println("The sum of all even numbers between 2 and the input is " + sum);
        } 
                else
        {
            System.out.println("Invalid, please enter an even number above 2");
        }
    }
}