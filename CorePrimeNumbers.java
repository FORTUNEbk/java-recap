public class CorePrimeNumbers {
    public int GCD(int a, int b){
        if(b == a){
            return a;
        }
        else if ( b == 0){
            return a;
        }
        return GCD(b, a % b);
    }
    public boolean CorePrime(int a, int b){
        return GCD(a, b) == 1;
    }
    public static void main(String[] args) {
        CorePrimeNumbers cp = new CorePrimeNumbers();
        int a = 56;
        int b = 99;
        if(cp.CorePrime(a, b)){
            System.out.println(a + " and " + b + " are coprime numbers.");
        } else {
            System.out.println(a + " and " + b + " are not coprime numbers.");
        }
    }
    
}
