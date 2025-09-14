public class LCM {
    public int GCD(int a, int b){
        if(b == a){
            return a;
        }
        else if ( b == 0){
            return a;
        }
        return GCD(b, a % b); 
    }

    public int LcmNum(int a, int b){
        return (a * b) / GCD(a, b);
    }
    public static void main(String[] args) {
        LCM lcm = new LCM();
        int a = 56;
        int b = 98;
        System.out.println("LCM of " + a + " and " + b + " is: " + lcm.LcmNum(a, b));   
    }
    
}
