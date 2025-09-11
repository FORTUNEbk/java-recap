import java.util.Scanner;

public class FibonacciSequence{
    public void Fibonacci(){
        Scanner scanner = new Scanner(System.in);

       

        System.out.println("Enter a number");
        int num = scanner.nextInt();
        int first = 0;
        int second = 1;

        for(int i = 1; i <= num; i++){
            System.out.print(first + " ");
            int next = first + second;
             first = second;
             second = next;
        }

        scanner.close();

    }
    public static void main(String []args){
        FibonacciSequence  obj = new FibonacciSequence();
        obj.Fibonacci();
    }
}