package com.tyrellhoxter;
import com.tyrellhoxter.*;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by tyrellhoxter on 5/2/16.
 */

public class BankAccessSpec {
    public double delta = 1e-15;
    @Test
    public void assignTest(){
        BankAccounts bankAccounts = new BankAccounts(AccountType.COMMERCIAL, 3, "Phillip Seymour Hoffman");
        AccountType expected = AccountType.COMMERCIAL;
        AccountType actual = bankAccounts.getAccountType();
        assertEquals("Test expected result is COMMERCIAL", expected, actual);
    }

    @Test
    public void balanceTest(){
        BankAccounts bankAccounts = new BankAccounts(AccountType.CHECKING,4, "Russell Crowe", 5);
        double actual = bankAccounts.getBalance();
        double expected = 5;
        Assert.assertEquals("The expected value should be 5", actual, expected, delta);
    }

    @Test
    public void setgetNameTest(){
        BankAccounts bankAccounts = new BankAccounts(AccountType.SAVING, 10, "Jamie Lanister", 15);
        String actual = bankAccounts.getName();
        String expected = "Jamie Lanister";
        Assert.assertEquals("Expected should Be HalleBerry", actual, expected);
    }
}

