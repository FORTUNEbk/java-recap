import java.util.Scanner;

public class ReverseWord {
public void Build(String word){
  StringBuilder building = new StringBuilder(word);

 
  String reversed = building.reverse().toString();
  System.out.println(reversed);
  }

  public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);

      System.out.println(" Enter a word to be reversed: ");
      String word = scanner.nextLine();

      ReverseWord nword = new ReverseWord();
      nword.Build(word);
  }
}
        
    
