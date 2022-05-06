//***********************************************************************
//  Transactions.java                   Author: Lewis/Loftus
//
//  Demonstrates the creation and use of multiple Account objects.
//***********************************************************************

public class Transactions {

    //-------------------------------------------------------------------
    //  Creates some bank accounts and requests various services
    //-------------------------------------------------------------------
    public static void main(String[] args){
        Account acct1 = new Account("Ted Murphy", 72354, 102.56);   //Object named acct1 created from Account class
        Account acct2 = new Account("Jane Smith", 69713, 40.00);    //Object named acct2 created from Account class
        Account acct3 = new Account("Edward Demsey", 93757, 759.32);//Object named acct3 created from Account class

        acct1.deposit(25.85);

        double smithBalance = acct2.deposit(500.00);
        System.out.println("Smith balance after deposit: " + smithBalance);

        System.out.println("Smith balance after withdrawal: " + acct2.withdraw (430.25, 1.50));

        acct1.addInterest();
        acct2.addInterest();
        acct3.addInterest();

        System.out.println();
        System.out.println(acct1);
        System.out.println(acct2);
        System.out.println(acct3);
    }
}
