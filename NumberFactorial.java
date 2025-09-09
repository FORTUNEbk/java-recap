public class NumberFactorial {
    public int Number(int num){
        int fact = 1;
        for(int i = 1; i <=num; i++){
            fact *= i;
        }

        return fact;
    }

    public static void main(String[] args) {
        NumberFactorial factor = new NumberFactorial();
        int n = 5; 
       int result =  factor.Number(n);
       System.out.println(result);
    }
    
}
