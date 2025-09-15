public class Student {

    private String name;
    private int age;
    private String grade;

    public Student(String name, int age, String grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGrade() {
        return grade;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public void printDetails() {
        System.out.println("Name: " + name + ", Age: " + age + ", Grade: " + grade);
    }

    public static void main(String[] args) {
        Student s1 = new Student("Alice", 20, "A");
        Student s2 = new Student("Bob", 22, "B");
        Student s3 = new Student("Charlie", 19, "A+");

        s1.setName("Ann");
        s1.setAge(21);
        s1.setGrade("A");

        s1.printDetails();
        s2.printDetails();
        s3.printDetails();
    }
}
