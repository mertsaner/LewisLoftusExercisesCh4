public class InternDriver {         //To call the non-static method from Static context
                                    //You need to create object of it
    public static void main (String[] args){

        ClassWithoutMethods object1, object2;
        object1 = new ClassWithoutMethods();

        System.out.println("Your x is: " +  object1.getX());
        System.out.println("Your y is: " +  object1.getY());

    }
}