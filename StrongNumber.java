public class StrongNumber {
    public int factorial(int num){
        if(num == 0 || num == 1){
            return 1;
        }
        int fact = 1;
        for(int i = 2; i <= num; i++){
            fact *= i;
        }
        return fact;
    }

    public boolean isStrong(int n){
        int originalNum = n;
        int sum = 0;
        while(n != 0){
            int digit = n % 10;
            sum += factorial(digit);
            n /=10;
        }
        return sum == originalNum;
    }
    public static void main(String[] args) {
        StrongNumber obj = new StrongNumber();
        int number = 145; 
        if(obj.isStrong(number)){
            System.out.println(number + " is a Strong number.");
        } else {
            System.out.println(number + " is not a Strong number.");
        }
    }
    
}
