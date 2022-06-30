public class LaptopRecords {

    public static void main (String[] args){


        Laptop Macbook, DellG15_5510, S145;

        Macbook = new Laptop("Macbook", "Apple", "AppleStore", 2021);
        DellG15_5510 = new Laptop ("G15_5510", "Dell", "Amazon.de", 2021);
        S145 = new Laptop ("S145_14", "Lenovo", "EbayKleinanzeigen", 2022);


        //Initial Print
        //Specs of the first Laptop; Model: Macbook, Make:Apple, Purchaser: AppleStore
        //Specs of the second Laptop; Model: G15_5510, Make:Dell, Purchaser: Amazon.de

        Macbook.setPurchaser("AppleStoreTr");
        DellG15_5510.setModel("G15_5510_GTX1650");
        S145.setPurchaseYear(2010);     //Lenovo S145 released in 2019
        //Although we try to set it 2019, program(if loop below) does allow it since it not possible to purchase laptop older than 2019


        //NewPrint
        //Specs of the first Laptop; Model: Macbook, Make:Apple, Purchaser: AppleStoreTr
        //Specs of the second Laptop; Model: G15_5510_GTX1650, Make:Dell, Purchaser: Amazon.de

        System.out.println("Specs of the first Laptop; " + Macbook);
        System.out.println("Specs of the second Laptop; " + DellG15_5510);
        System.out.println("Specs of the second Laptop; " + S145);


    }
}

class Laptop {
    //this. identifier refers to this instance data declaration
    //This declarations will be always on the left side

//=============================================================
//    private String model;
//    private String make;
//    private String purchaser;
//    private int purchaseYear;

    //CHANGE PRIVATE TO PUBLIC OR NON-MODIFIER, IT WORKS SAME BUT ALL OF WHICH IN DIFFERENT SCOPE
    // WILL NOT WORK IN THE SAME MANNER IN DIFFERENT USE CASE

    String model;
    public String make;
    protected String purchaser;
    private int purchaseYear;
//=============================================================================================

    public Laptop(String model, String make, String purchaser, int purchaseYear){   //Laptop constructor that initialize every data
        this.model = model;
        this.make = make;
        this.purchaser = purchaser;
        this.purchaseYear = purchaseYear;
    }

    //Getters (Accessors)

    public String getModel() {
        return model;
    }

    public String getMake(){
        return make;
    }

    public String getPurchaser(){
        return purchaser;
    }

    public int getPurchaseYear(){
        return purchaseYear;
    }

    //Setters (Mutators)

    public void setModel(String myModel){
        model = myModel;        //Declared instance data variable ALWAYS ON THE LEFT SIDE
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setPurchaser(String purchaser) {
        this.purchaser = purchaser;
    }

    public void setPurchaseYear(int purchaseYear) {
        if (purchaseYear > 2023)    //Since the date in the future, it is not possible, make it return to 2020
            purchaseYear = 2022;
        if (purchaseYear < 2019)    //It is old date, and laptop is released in 2019, so purchase date cannot be older than this
            purchaseYear = 2019;
        this.purchaseYear = purchaseYear;
    }

    public String toString() {
        String result = "Model: " + getModel() + ", Make:" + getMake() + ", Purchaser: " + getPurchaser() + ", PurchaseYear: " + getPurchaseYear();
        return result;
    }
}