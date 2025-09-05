import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SetAlarm {
    public List<String> getDays() {
        List days = new ArrayList<>();
        days.add("Monday");
        days.add("Tueday");
        days.add("Wednesday");
        days.add("Thurday");
        days.add("Friday");
        days.add("Saturday");
        days.add("Sunday");
         
        return days;
    }


    public void SetTime(){
        Scanner scanner = new Scanner(System.in);
        List<String> day = getDays();

        for(int i = 0; i < day.size(); i++){
            System.out.println((i + 1) +"." + day.get(i));

        }

        System.out.println("Enter the number of the day");
        int choice = scanner.nextInt();
        scanner.nextLine();

        if(choice < 1 || choice > day.size()){
            System.out.println("Invalid Choice! Please select a valid day");
            return;
        }

        String SelectedDay = day.get(choice - 1);

        System.out.println("Enter the wake up time (e.g 6:30 PM)");
        String time = scanner.nextLine();

        System.out.println("Alarm for " + SelectedDay + " is " + time);

    }
    

    public static void main(String[]args){
       SetAlarm WakeUp = new SetAlarm();
       WakeUp.SetTime();
    }
}
