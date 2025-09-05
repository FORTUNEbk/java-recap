
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class BarAge {
    public void BarIdChecker(){
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        try{
        System.out.println("Please enter date of birth on your ID Number");
        String date = scanner.nextLine();
        LocalDate dob = LocalDate.parse(date, formatter);
        LocalDate today = LocalDate.now();

        int age =Period.between(dob, today).getYears();
        if(age < 0){
            System.out.println("invalid age, Pleas select a valid date of birth");
        }else if(age >= 18){
            System.out.println("Congradulations, you are of valid age. Welcome!!");
        }else{
        System.out.println("Your are under age");
        }
        }catch (DateTimeParseException e) {
            System.out.println("Invalid format, Please use (yyyy-MM-dd)");
        }
        

    }

    public static void main(String []args){
        BarAge Visit = new BarAge();
        Visit.BarIdChecker();
    }
    
}
