import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class FindingPrime {
    public boolean IsPrime(int n){
        if(n < 1) return false;
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0)return false;
        }
        return true;
    }
    public void Numbers(){
        ArrayList<Integer> prime = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) { 
            System.out.println("Enter your values here(enter -1 to exit!)");
            int num = scanner.nextInt();

            if(num == -1){
                System.out.println("Bye");
                break;
            }

            
              if(IsPrime(num)){
                prime.add(num);
              }
        
        }
        System.out.println("The prime numbers are: "+ prime);

        int greatest  = Collections.max(prime);
        int smallest = Collections.min(prime);

        System.out.println("The biggest prime is: " + greatest);
        System.out.println("The smallest prime is: " + smallest );
    }
    
    public static void main(String[] args) {
        FindingPrime obj = new FindingPrime();
        obj.Numbers();
    }
    
}
