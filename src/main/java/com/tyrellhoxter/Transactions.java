package com.tyrellhoxter;

import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

/**
 * Created by tyrellhoxter on 5/2/16.
 */
public class Transactions {
    public double credit;
    public double debit;
    public boolean overdraft = false;
    private ArrayList transRecords = new ArrayList();
    Random random = new Random();
    Date date = new Date( );
    BankAccounts bankAccounts;


    public void addCredit(double val1, BankAccounts bankAccounts) {
        double myBalance = bankAccounts.getBalance();
        bankAccounts.getStatus();
        if (bankAccounts.getStatus() == Status.FROZEN || bankAccounts.getStatus() == Status.CLOSED) {
            System.out.println("Bank Account Frozen, Balance can not be retrieved");
        } else {
            bankAccounts.setBalance(myBalance + val1);
        }

    }

    public void deductDebit(double val2, BankAccounts bankAccounts) {
        double myBalance = bankAccounts.getBalance();
        bankAccounts.getStatus();
        if (bankAccounts.getStatus() == Status.FROZEN || bankAccounts.getStatus() == Status.CLOSED) {
            System.out.println("Bank Account Frozen, Balance can not be retrieved");
        } else if(myBalance - val2 < 0){
            System.out.println("Transaction Declined");
        }
        else {
            bankAccounts.setBalance(myBalance - val2);
        }
    }

    public void dateTime(){
        System.out.println(date.toString());
    }
}
