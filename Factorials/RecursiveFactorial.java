package Factorials;

public class RecursiveFactorial {
    public int factorial(int num){
        if(num == 0 || num == 1){
            return 1;
        } else {
            return num * factorial(num - 1);
        }
    }

    public static void main(String[] args) {
        RecursiveFactorial rf = new RecursiveFactorial();
        int n = 5; 
       int result =  rf.factorial(n);
       System.out.println(result);
    }
}
