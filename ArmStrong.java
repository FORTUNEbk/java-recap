public class ArmStrong {
    public boolean isArmStrong(int n){
        int originalNum = n;
        int sum = 0;
        int digits = String.valueOf(n).length();
        while(n != 0){
            int digit = n % 10;
            sum += Math.pow(digit, digits);
            n /= 10;
        }
        return sum == originalNum;
    }
    public static void main(String[] args) {
        ArmStrong obj = new ArmStrong();
        int number = 153; // Example number
        if(obj.isArmStrong(number)){
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }
}