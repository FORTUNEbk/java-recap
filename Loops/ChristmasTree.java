package Loops;
import java.util.Scanner;

public class ChristmasTree {

    public void Number(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the tree: ");
        int TreeSize = scanner.nextInt();
        for(int i = 1; i <=TreeSize; i++){

            for(int j = i; j < TreeSize; j++){
                System.out.print(" ");
            }

            for(int k = 1; k <= (2 * i - 1); k++){
                System.out.print("*");

            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        ChristmasTree tree = new ChristmasTree();
        tree.Number();
    }
}
