import java.util.Scanner;

public class Integers {

public static void main (String [] args) {
    int input = 0;
    int[] result = new int[51];
    Scanner scan = new Scanner(System.in);

    while(input != 51) {
    System.out.print("Enter an arbitrary number of integers");
    input = scan.nextInt();
    if(input == 51) break;
    if(input < 0 || input > 50) {
        System.out.println("Number is out of range");
     }
        result[input]++;
        continue;
    }
    
    for (int index = 0; index < 51; index++);
        if (result[index] > 0)
        System.out.println(index + " : " + result[index]);
    }
}
