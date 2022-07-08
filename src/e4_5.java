/*
 *   Write a method called synonyms that prints
 *   at least two synonyms of a word when invoked.
 *   The method should accept no parameters and return no value.
 */

public class e4_5 {
    public static void main(String[] args) {
        synonyms();
    }

     static void synonyms (){
        //In other call a method from main method, the method should be declared as static
        // Error Occurred, java: non-static method synonyms() cannot be referenced from a static context
        String initial = "equal";
        String firstSynonym = "equivalent";
        String secondSynonym = "identical";

        System.out.println("Two synonym of the word, equal: ");
        System.out.println(firstSynonym);
        System.out.println(secondSynonym);

    }
}