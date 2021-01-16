package se.lexicon.vending.model;

import se.lexicon.vending.data.VendingMachineImpl;

public class Food extends Product {

    private int calories;


    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }




//-----------------


    @Override           //done
    public void use() {
        System.out.println("Consumed product: " + this.getName());

    }

    @Override             //done
    public String examine() {
        String exa2;
        exa2 = "The food section reads:\n" +this.getName() + "\t\tprice: " + this.getPrice() + " credits" + "\t\tCalories: " + calories + "kc.\n";
        return exa2;
    }

}
