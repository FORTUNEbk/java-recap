public class GCD {
    public static int GcdNum(int a, int b){
        if(b == a){
            return a;
        }else if( b == 0){
            return a;

        }
        return GcdNum(b, a % b); // Recursive call
        
        }
    public static void main(String[] args) {
        int a = 56;
        int b = 98;
        System.out.println("GCD of " + a + " and " + b + " is: " + GcdNum(a, b));   

    }
}   
    

