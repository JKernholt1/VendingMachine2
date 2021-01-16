package se.lexicon.vending.model;

import se.lexicon.vending.data.VendingMachine;
import se.lexicon.vending.data.VendingMachineImpl;

public class Drink extends Product {

    private String volume;

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }



//-----------------
//
    @Override           //done
    public void use() {
        System.out.println("Consumed product: " + this.getName());

    }

    @Override             //done
    public String examine() {
        String exa1;
        exa1 = "The drink section reads:\n" +this.getName() + "\t\tprice: " + this.getPrice() + " credits" + "\t\tVolume: " + volume + ".\n";
        return exa1;
    }



}
