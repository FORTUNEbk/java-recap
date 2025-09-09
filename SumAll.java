import java.util.Scanner;

public class SumAll {
    public int sum(int num){
        int sum = 0;
        
        while(num > 0){
            int digit = num % 10;
            sum += digit;
            num = num/10;
        }
        return sum;
    }
    
    public static void main(String[] args) {
        SumAll obj = new SumAll();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a value");
        int num = scanner.nextInt();

        int reversed = obj.sum(num);
        System.out.println(reversed);
    }
}

