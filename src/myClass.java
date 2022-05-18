public class myClass {

    public static void main(String[] args) {
        //synonyms();
        //repeater();


        Classes Asinifi = new Classes();
        Asinifi.synonyms();
    }

    /*
     *   Write a method called synonyms that prints
     *   at least two synonyms of a word when invoked.
     *   The method should accept no parameters and return no value.
     */
}

class Classes {

        void synonyms (){
            System.out.println("Hi there, I am synonyms");
            repeater();
        }

        void repeater (){
            System.out.println("Hi there, I am repeater");
        }
}