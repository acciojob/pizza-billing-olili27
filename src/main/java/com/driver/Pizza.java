package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if (isVeg) {
            this.price = 300;
        } else {
            this.price = 400;
        }
        bill = this.price + "";

        System.out.println("Base Price Of The Pizza: " + this.price);
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

        bill = sampleBill + "";
        System.out.println("Extra Cheese Added: " + 80 );
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

        bill = sampleBill + "";
        System.out.println("Extra Toppings Added: " + 70);
    }

    public void addTakeaway(){
        // your code goes here
        int sampleBill = Integer.parseInt(bill);
        sampleBill += 20;

        bill = sampleBill + "";
        System.out.println("Paper Bag Added: " + 20);
    }

    public String getBill(){
        // your code goes here
        System.out.println("Total Price: " + this.bill);
        return this.bill;
    }
}
