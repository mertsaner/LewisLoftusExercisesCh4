import java.io.Serial;
// This is my version of Account Java
//Gives wrong result, check again -431.75 as a result of the program
public class Account {

    private String AccountName;
    private int AccountNumber; //const could be used
    private double deposit;
    final double RATE = 0.035;

    public Account (String name, int AccountNumber, double deposit){ //Constructor
        AccountName = name;
        AccountNumber = this.AccountNumber;
        deposit = this.deposit;
    }

    public double deposit (double deposit){
        deposit = this.deposit + deposit;
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
        deposit =  deposit + deposit * RATE;
    }

    @Override
    @Serial
    public String toString() {
        return "Account{" +
                "AccountName='" + AccountName + '\'' +
                ", AccountNumber=" + AccountNumber +
                ", deposit=" + deposit +
                ", RATE=" + RATE +
                '}';
    }
}