
import java.util.Scanner;

public class StudentsGrade {
    private String First_Name;
    private String Second_Name;
    private int Grade;

    public StudentsGrade(String First_Name, String Second_Name, int Grade){
        this.First_Name = First_Name;
        this.Second_Name = Second_Name;
        this.Grade = Grade;
    }

    public String getFirst_Name() {
        return First_Name;
    }

    public void setFirst_Name(String first_Name) {
        First_Name = first_Name;
    }

    public String getSecond_Name() {
        return Second_Name;
    }

    public void setSecond_Name(String second_Name) {
        Second_Name = second_Name;
    }

    public int getGrade() {
        return Grade;
    }

    public void setGrade(int grade) {
        Grade = grade;
    }


    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Student's First Name: ");
        String First_Name = scanner.nextLine();
        System.out.print("Enter the Student's Second Name: ");
        String Second_Name = scanner.nextLine();
        System.out.print("Enter student's Marks: ");
        int Grade = scanner.nextInt();

        StudentsGrade obj = new StudentsGrade(First_Name, Second_Name, Grade);



        System.out.println(obj.First_Name + " " + obj.Second_Name + " " + obj.Grade);
    }
   
}
    
    

