public class Passenger {

    private String passengerName;
    private String passengerGender;
    private String berthLocation;       //Location that Vessel's arrival on Sea

    public Passenger(String passengerName, String passengerGender, String berthLocation){
        this.passengerName = passengerName;
        this.passengerGender = passengerGender;
        this.berthLocation = berthLocation;
    }

    //Accessors
    public String getPassengerName(){
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
