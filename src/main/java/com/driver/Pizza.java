package com.driver;

public class Pizza {

    private final int price;
    private String bill;
    private final int paperBagPrice;
    private final int toppingsPrice;
    private final int cheesePrice;
    private boolean isCheeseAdded;
    private boolean isToppingsAdded;
    private boolean isPaperBagAdded;
    private int totalPrice;
    private boolean isBilled;

    public Pizza(Boolean isVeg){
        isCheeseAdded = false;
        isBilled = false;
        isToppingsAdded = false;
        isPaperBagAdded = false;
        paperBagPrice = 20;
        cheesePrice = 80;

        if (isVeg) {
            this.price = 300;
            this.toppingsPrice = 70;
        } else {
            this.price = 400;
            this.toppingsPrice = 120;
        }

        totalPrice = this.price;

        bill = "Base Price Of The Pizza: " + this.price + "\n";
    }

    public int getPrice(){
        return this.price;
    }


    public void addExtraCheese(){
        // your code goes here
        if (!isCheeseAdded) {
            this.totalPrice += cheesePrice;
            isCheeseAdded = true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if (!isToppingsAdded) {
            this.totalPrice += toppingsPrice;
            isToppingsAdded = true;
        }
    }

    public void addTakeaway(){
        // your code goes here
       if (!isPaperBagAdded) {
           totalPrice += paperBagPrice;
           isPaperBagAdded = true;

           bill = bill + "Paperbag Added: " + paperBagPrice + "\n";
       }
    }

    public String getBill(){
        // your code goes here
        if(!isBilled) {
            if (isCheeseAdded) bill = bill + "Extra Cheese Added: " + cheesePrice + "\n";

            if (isToppingsAdded)   bill = bill + "Extra Toppings Added: " + toppingsPrice + "\n";

            bill = bill + "Total Price: " + totalPrice + "\n";
        }
        return this.bill;
    }
}
