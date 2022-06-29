public class PhoneCheck {

    public static void main(String [] args) {

     Phone phone1, phone2, phone3, phone4, phone5;

     phone1 = new Phone("Apple", "Iphone X", 2017 );      //Creating new object(called phone1) of the Phone Class
     phone2 = new Phone("Samsung", "S9", 2018);      //Creating new object(called phone2) of the Phone Class
     phone3 = new Phone("Nokia", "3310", 2000);
     phone4 = new Phone("Apple", "Iphone 6", 2014);
     phone5 = new Phone("Nokia", "5110", 1998);

        System.out.println("Phone1; "+ phone1 );
        System.out.println("Phone2; "+ phone2 );
        System.out.println("Phone3; "+ phone3 );
        System.out.println("Phone4; "+ phone4 );
        System.out.println("Phone5; "+ phone5 );
    }
}

class Phone {

    private final String make;
    private final String model;
    private final int releaseYear;


    Phone(String make, String model, int releaseYear){
        this.make = make;
        this.model = model;
        this.releaseYear = releaseYear;
    }

    String getMake(){        //letter M must capitalized, writing it like "getmake" does not works
        return make;
    }

    String getModel(){
        return model;
    }

    int getReleaseYear(){
        return releaseYear;
    }


    //Setters not used
//    public void setMake(){
//        make = " ";
//    }
//
//    public void setModel(){
//        model = " ";
//    }
//
//    public void setReleaseYear(){
//        model = " ";

    //

    boolean isObsolete(){
        boolean obsolete = false; //OR directly, boolean obsolete = (2022 - getReleaseYear()) > 10;
        if ((2022 - getReleaseYear()) > 10 )
            obsolete = true;

        return obsolete;
    }

    public String toString (){
        String result = "Make: " + getMake() + ", Model: " + getModel() + ", Year: " + getReleaseYear() + ", IsObsolete: " + isObsolete();
        return result;
    }
}