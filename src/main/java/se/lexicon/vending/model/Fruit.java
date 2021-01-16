package se.lexicon.vending.model;

import se.lexicon.vending.data.VendingMachineImpl;

public class Fruit extends Product {

    private int fatPercent;


    public int getFatPercent() {
        return fatPercent;
    }

    public void setFatPercent(int fatPercent) {
        this.fatPercent = fatPercent;
    }




//-----------------



    @Override           //done
    public void use() {
        System.out.println("Consumed product: " + this.getName());

    }

    @Override             //done
    public String examine() {
        String exa3;
        exa3 = "The fruit section reads:\n" +this.getName() + "\t\tprice: " + this.getPrice() + " credits" + "\t\tFat percent: " + fatPercent + "%.\n";
        return exa3;
    }

}
