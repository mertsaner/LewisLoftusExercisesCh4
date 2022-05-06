public class Account {

    String AccountName;
    int AccountNumber; //const could be used
    double deposit;

    public Account (String name, int AccountNumber, double deposit){ //Constructor
        AccountName = name;
        AccountNumber = this.AccountNumber;
        deposit = this.deposit;
    }

    public double deposit (double deposit){
        deposit= this.deposit + deposit;
        //New Value of deposit equals thisdeposit(deposit amount entered) + earlier deposit
        return deposit;
    }

    public double getDeposit() {
        return deposit;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    public double withdraw(double withdrawAmount, double fee){
        deposit = deposit - withdrawAmount - fee;
        return deposit;
    }

    public void addInterest()
    {
        deposit =  deposit + deposit * 0.02;
    }

}
