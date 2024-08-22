package lesson24.labs.exercise05;

import java.math.BigDecimal;

public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();

        bankAccount.numberAccount = 7777777;
        bankAccount.special = false;

        bankAccount.balance = new BigDecimal("800.00");
        bankAccount.limit = new BigDecimal("1800.00");
    }
}
