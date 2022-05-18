public class printingObjects {
    int x = 5;
    //private x = 123; reininitializing x as private would cause an error
    private double y = 6.890;
    protected boolean mybool = false;
    
    public static void main(String[] args) {
        printingObjects myObj1 = new printingObjects();  // Object 1
        printingObjects myObj2 = new printingObjects();  // Object 2
        printingObjects myObj3 = new printingObjects();  // Object 3
        printingObjects myObj4 = new printingObjects();  // Object 3


        System.out.println(myObj1.x);
        System.out.println(myObj2.x);
        System.out.println(myObj3.y);
        System.out.println(myObj4.mybool);
    }
}