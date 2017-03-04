/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankbranches;

import java.util.ArrayList;

/**
 *
 * @author jaime
 */
public class Customer {
    private String name;
    private ArrayList<Double> transactions;


    public Customer(String name, double initialTransaction) {
        this.name = name;
        this.transactions = new ArrayList<Double>();
        addTransaction(initialTransaction);
    }

    public void addTransaction(double amount) {
        this.transactions.add(amount);
    }
    
    public ArrayList<Double> getTransactions() {
        return transactions;
}

    public String getName() {
        return name;
    }

    
}
