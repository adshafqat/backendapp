package com.ng.backend;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:application.properties")
public class Account {

    @Value("${accountNumber}")
    private String accountNumber;
    @Value("${name}")
    private String name;
    @Value("${balanceAmount}")
    private String balanceAmount;

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBalanceAmount() {
        return balanceAmount;
    }

    public void setBalanceAmount(String balanceAmount) {
        this.balanceAmount = balanceAmount;
    }
   
    @Override
    public String toString() {
        return "{" +
                "Name='" + name + '\'' +
                ", Account Number='" + accountNumber + '\'' +
                ", Balance='" + balanceAmount + '\'' +
                '}';
    }
    

}