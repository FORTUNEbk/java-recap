public class PerfectNumber {
    public boolean Perfect(int num){
        int sum = 0;
        for(int i = 1; i <= num/2; i++){
            if(num % i == 0){
                sum += i;
            }
        }
        return sum == num;
    }
    public static void main(String[] args) {
        PerfectNumber obj = new PerfectNumber();
        int number = 28; // Example number
        if(obj.Perfect(number)){
            System.out.println(number + " is a Perfect number.");
        } else {
            System.out.println(number + " is not a Perfect number.");
        }
    }
    
}
