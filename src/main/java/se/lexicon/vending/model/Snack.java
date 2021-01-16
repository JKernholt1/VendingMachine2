package se.lexicon.vending.model;

import se.lexicon.vending.data.VendingMachineImpl;

public class Snack extends Product {

    private int sugarPercent;


    public int getSugarPercent() {
        return sugarPercent;
    }

    public void setSugarPercent(int sugarPercent) {
        this.sugarPercent = sugarPercent;
    }




//-----------------



    @Override           //done
    public void use() {
        System.out.println("Consumed product: " + this.getName());

    }

    @Override             //done
    public String examine() {
        String exa1;
        exa1 = "The snack section reads:\n" +this.getName() + "\t\tprice: " + this.getPrice() + " credits" + "\t\tSugar percent: " + sugarPercent + "%.\n";
        return exa1;
    }

}
