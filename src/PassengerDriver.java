public class PassengerDriver {      //Driver Class

    public static void main (String[] args){

        Passenger newcomer1, newcomer2;     //Two objects declared
        newcomer1 = new Passenger("Ali", "Veli", "Hamburg" );
        newcomer2 = new Passenger("Ayse", "Fatma", "Bremerhaven");


        System.out.println("Newcomer1 is: " + newcomer1);
        System.out.println("Newcomer2 is: " + newcomer2);

    }
}