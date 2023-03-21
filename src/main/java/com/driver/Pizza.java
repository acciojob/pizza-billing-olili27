package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        bill = price + " ";
    }

    public int getPrice(){
        return this.price;
    }

    public boolean cheeseAdded = false;
    public void addExtraCheese(){
        // your code goes here
        if (cheeseAdded) return;

        int sampleBill = Integer.parseInt(bill);

        sampleBill += 80;

        cheeseAdded = true;

        bill = sampleBill + " ";
    }

    public boolean toppingsAdded = false;
    public void addExtraToppings(){
        // your code goes here
        if(toppingsAdded) return;

        if (!cheeseAdded) addExtraCheese();

        int sampleBill = Integer.parseInt(bill);

        if (isVeg) {
            sampleBill += 70;
        } else {
            sampleBill += 120;
        }

        toppingsAdded = true;

        bill = sampleBill + " ";
    }

    public void addTakeaway(){
        // your code goes here
        int sampleBill = Integer.parseInt(bill);
        sampleBill += 20;

        bill = sampleBill + " ";
    }

    public String getBill(){
        // your code goes here
        return this.bill;
    }
}
