public class RollingDice2 {     //Driver Class
    //Driver Classes instantiates objects, includes main method

    public static void main (String [] args) {

        PairOfDice die1, die2;
        int sum;

        die1 = new PairOfDice(0);
        die2 = new PairOfDice(0);

        System.out.println("Initial FaceValue of the first die: " + die1);
        System.out.println("Initial FaceValue of the second die: " + die2);

        System.out.println("Dice are rolled!");

        die1.roll();
        die2.roll();

        System.out.println("FaceValue of the first die: " + die1);
        System.out.println("FaceValue of the second die: " + die2);

        sum = die1.getFacevalue() + die2.getFacevalue();

        System.out.println("Sum of faceValue of two die: " + sum);
    }
}