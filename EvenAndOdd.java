import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class EvenAndOdd {
public void Numbers(){
    int odd = 0;
    int even = 0;
   

    Scanner scanner = new Scanner(System.in);

    ArrayList<Integer> nums = new ArrayList<>();
    ArrayList<Integer> evenList = new ArrayList<>();
    ArrayList<Integer> oddList = new ArrayList<>();


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
            evenList.add(nums.get(i));
            even++;
        }else{
        oddList.add(nums.get(i));
        odd++;
        }

       
    }

    System.out.println("The even numbers are: " + evenList);
    System.out.println("The odd numbers are: " + oddList);
    System.out.println("Even numbers are: " + even + " Odd numbers are: " + odd);

    if(!evenList.isEmpty()){
        int smallestEven = Collections.min(evenList);
        int largestEven = Collections.max(evenList);
    System.out.println("The smallest even is: " + smallestEven + " The largest even is: " + largestEven);

    }
    if(!oddList.isEmpty()){
        int smallestOdd = Collections.min(oddList);
        int largeststOdd = Collections.max(oddList);
     System.out.println("The smallest even is: " + smallestOdd + " The largest even is: " + largeststOdd);

    }
   
 }
  public static void main(String[]args){
        EvenAndOdd obj = new EvenAndOdd();
      obj.Numbers();
    }
    
}
    
    

    
 


