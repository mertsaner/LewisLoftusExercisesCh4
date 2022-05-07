import java.util.Random;

public class test {
    public static void main(String[] args) {

        //Generate random values between 20 and 200
        Random rand = new Random(); //new rand object from Random Class
        int upperbound = 201;
        int int_random = rand.nextInt(upperbound);
        System.out.println("Random integer value from 0 to " + (upperbound-1) + " : "+ (int_random+20));
    }
}
