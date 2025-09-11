package Reverse;
import java.util.Scanner;


public class ReverseNumbers {
    public int Number(int num){

        String numVal = String.valueOf(num);
        StringBuilder build = new StringBuilder(numVal);
        String reverse = build.reverse().toString();
        int reversed = Integer.parseInt(reverse);

        return  reversed;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your number here: ");
        int num = scanner.nextInt();
        ReverseNumbers obj = new ReverseNumbers();
        int result = obj.Number(num);
        System.out.print("The reverse is: "+ result);

        

    }
    
}
