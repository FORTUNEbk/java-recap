package JavaStacks;
import java.util.ArrayList;
import java.util.Scanner;

public class VowelsAndConsonants {
    ArrayList<Character> vowels = new ArrayList<>();
    ArrayList<Character> consonants = new ArrayList<>();
    public void checkChar(char ch){

        if(ch =='a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
           ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
            System.out.println(ch + " is a vowel");
            vowels.add(ch);
           }else{
            System.out.println(ch + " is a consonant");
            consonants.add(ch);
           }
    }

    public void EnterWord(String word){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: "); 
        word = scanner.nextLine();
        for(int i = 0; i < word.length(); i++){
            checkChar(word.charAt(i));
           
        }
         System.out.println(vowels);
         System.out.println(consonants);
    }

    public static void main(String[] args) {
        VowelsAndConsonants obj = new VowelsAndConsonants();
        obj.EnterWord("");
    }

    
}
