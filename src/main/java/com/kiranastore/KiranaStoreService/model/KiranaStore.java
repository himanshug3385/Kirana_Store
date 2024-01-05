package com.kiranastore.KiranaStoreService.model;


import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Date;


// Model -
//1. TransactionId
//2. Username
//3. Amount
//4. Transaction Type - Credit, Debit
//5. Amount Type -  USD, INR
@Entity
@Table(name="kirana_store_details")
public class KiranaStore {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id; //transaction id -- primary key
    private String Username;
    private double amount;
    private LocalDate transactionDate;
    private  String amountType;
    private  String transactionType;

    public KiranaStore( String username, double amount, String amountType, String transactionType) {

        Username = username;
        this.amount = amount;
        this.amountType = amountType;
        this.transactionType = transactionType;
    }

    public KiranaStore() {
    }

    public LocalDate getDate() {
        return transactionDate;
    }

    public void setDate(LocalDate date) {
        this.transactionDate = date;
    }

    public int getId() {
        return id;
    }

//    public void setId(String id) {
//        this.id = id;
//    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getAmountType() {
        return amountType;
    }

    public void setAmountType(String amountType) {
        this.amountType = amountType;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }
}
