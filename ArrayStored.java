import java.util.Scanner;

public class ArrayStored {
    public int Storage(int n1, int n2, int n3, int n4, int n5){
        int current;
        int greatest = 0;
        int store[] = {n1, n2, n3, n4, n5};

        for(int i = 0; i < store.length; i++){
            current = store[i];
            if(current > greatest){
                greatest = current;
            }
        }
        return greatest;
        
    }

    public static void main(String[] args) {
        ArrayStored obj = new ArrayStored();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int n1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int n2 = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int n3 = scanner.nextInt();

        System.out.print("Enter the fourth number: ");
        int n4 = scanner.nextInt();

        System.out.print("Enter the fifth number: ");
        int n5 = scanner.nextInt();

        int result = obj.Storage(n1, n2, n3, n4, n5);
        System.out.println("The greatest value is " + result);

        scanner.close();
        
    }
}

    

