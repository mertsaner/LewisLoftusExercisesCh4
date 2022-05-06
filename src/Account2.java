//import java.text.NumberFormat;
////************************************************************************
////  Account2.java    Author: Lewis/Loftus
////
////  Represents a bank account with basic services such as deposit and withdraw
////************************************************************************
//public class Account {
//
//    private final double RATE = 0.035; // interest rate of 3.5%
//
//    private long acctNumber;        //private visibility modifier used to ensure ensapsulation (self-governence of the object)
//    private double balance;
//    private String name;
//
//    //-----------------------------------------------------------------------------
//    // Sets up account by defining its owner, account number,
//    // and initial balance.
//    //-----------------------------------------------------------------------------
//    public Account (String owner, long account, double initial)
//    {
//        name = owner;
//        acctNumber = account;
//        balance = initial;
//    }
//
//    //------------------------------------------------------------------------------
//    // Deposits the specified amount into the account. Returns the new balance.
//    //------------------------------------------------------------------------------
//
//    public double deposit (double amount)
//    {
//        balance = balance + amount;     //Check this part in Account.java
//        return balance;
//    }
//
//    //------------------------------------------------------------------------------
//    //Withdraws the specified amount from the account and applies the fee. Returns the
//    //new balance
//    //-------------------------------------------------------------------------------
//
//    public double withdraw (double amount, double fee)
//    {
//        balance = balance - amount - fee;
//
//        return balance;
//    }
//
//    //----------------------------------------------------------------------------------
//    // Adds interest to the account and returns the new balance.
//    //----------------------------------------------------------------------------------
//    public double addInterest (){
//        balance += (balance * RATE);
//        return balance;
//    }
//
//    //----------------------------------------------------------------------------------
//    // Returns the current balance of the account.
//    //----------------------------------------------------------------------------------
//    public double getBalance()
//    {
//        return balance;
//    }
//    //----------------------------------------------------------------------------------
//    // Returns a one-line description of the account as a string
//    //----------------------------------------------------------------------------------
//    public String toString(){
//        NumberFormat fmt = NumberFormat.getCurrencyInstance();      //What does this do?
//        return acctNumber + "\t" + name + "\t" + fmt.format(balance);
//    }
//}