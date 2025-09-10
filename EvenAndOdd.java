import java.util.ArrayList;
import java.util.Scanner;

public class EvenAndOdd {
public void Numbers(){
    int odd = 0;
    int even = 0;

    Scanner scanner = new Scanner(System.in);

    ArrayList<Integer> nums = new ArrayList<>();

    while(true){
    System.out.println("Enter your values here(or enter -1 to exit!): ");
    int input = scanner.nextInt();

    if(input == -1){
        System.out.println("Bye!");
        break;
    }
    nums.add(input);
        
    }
    for(int i = 0; i < nums.size(); i++){
        if(nums.get(i) % 2 == 0){
            even++;
        }else{
        odd++;
        }
    }

    System.out.println("Even numbers are: " + even + " Odd numbers are: " + odd);
   
 }
  public static void main(String[]args){
        EvenAndOdd obj = new EvenAndOdd();
      obj.Numbers();
    }
    
}
    
    

    
 


