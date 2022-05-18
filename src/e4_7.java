
// A random100() method creates random values between 1 and 100
public class e4_7 {

    public static void main(String[] args) {
        System.out.println(random100());
    }

    static double random100 () { //Upon writing  Incompatible types. Found: 'double', required: 'int'
        double result = 0;
        result = Math.floor(100*Math.random()+1);
        // General rule of thumb is;
        // int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
        return result;
    }
}