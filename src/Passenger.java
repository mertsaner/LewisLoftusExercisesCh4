public class Passenger {

    private String passengerName;       // These are not static variables these are instance variables
    private String passengerGender;     // So they are different each instance of the class
    private String berthLocation;       // Location that Vessel's arrival on Sea

    public Passenger(String passengerName, String passengerGender, String berthLocation){
        this.passengerName = passengerName;
        this.passengerGender = passengerGender;
        this.berthLocation = berthLocation;
    }

    //Accessors
    public String getPassengerName(){
        //static int x= 23;         //A local variable declared within a method cannot be static
        return passengerName;
    }

    public String getPassengerGender(){
        return passengerGender;
    }

    public String getBerthLocation(){
        return berthLocation;
    }

    public void setPassengerName(String passengerName){
        this.passengerName = passengerName;
    }

    public void setPassengerGender(){
        this.passengerGender = passengerGender;
    }
    public void setBerthLocation(){
        this.berthLocation = berthLocation;
    }

    public String toString() {
        String result = "Passenger's name: " + getPassengerName() + ", Gender: " + getPassengerGender() + ", Berth Location: " + getBerthLocation();
        return result;
    }
}
