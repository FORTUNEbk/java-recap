import java.util.Scanner;

public class LargestAndSmallest {
    public void Number(int n1, int n2, int n3, int n4, int n5){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        int store[] ={n1, n2, n3, n4, n5};
        for(int i = 0; i < store.length; i++){
            if(store[i] > largest){
                largest = store[i];
            }

            if(store[i] < smallest){
                smallest = store[i];
            }

        } 
        System.out.println("The largest number is: "+ largest);
        System.out.println("The smallest number is: " + smallest);
    }
    
    public static void main(String[]args){
        LargestAndSmallest obj = new LargestAndSmallest();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Entet the first value: ");;
        int n1 = scanner.nextInt();

        System.out.print("Entet the second value: ");;
        int n2 = scanner.nextInt();

        System.out.print("Entet the third value: ");;
        int n3 = scanner.nextInt();

        System.out.print("Entet the fourth value: ");;
        int n4 = scanner.nextInt();

        System.out.print("Entet the fifth value: ");;
        int n5 = scanner.nextInt();

        obj.Number(n1, n2, n3, n4, n5);

        scanner.close();
    }
}
