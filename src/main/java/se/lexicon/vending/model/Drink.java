package se.lexicon.vending.model;

import se.lexicon.vending.data.VendingMachine;
import se.lexicon.vending.data.VendingMachineImpl;

public class Drink extends Product {

    private String volume;
    private String name1;
    private int price1;

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }


    @Override
    public String getName() {

        return name1;
    }

    @Override
    public void setName(String name) {

        this.name1 = name;
    }

    @Override
    public int getPrice() {

        return price1;
    }

    @Override
    public void setPrice(int price) {

        this.price1 = price;
    }

//-----------------
//
    @Override           //done
    public int[] productPurchase(int products1[] , int moneyPool) {

        if (price1 > moneyPool) {
            System.out.println("Sorry buddy, but you only have " + moneyPool + " credits left in the vending machine to buy for.");
            return products1;

        } else {

            String name = name1;
            int money = moneyPool - price1;
            vending1.setMoneyPool(money);
            products1[1]++;
            System.out.println("You bought a " + name + ".");
            System.out.println("You now have " + money + " credits left in the vending machine.");
            return products1;
        }//else

    }

    @Override           //done
    public void use(int products1[]) {

        if (products1[1] > 0) {
            String name = name1;
            int products2[] = new int[5];
            System.out.println("You eat a " + name + ".");
            products1[1]--;
            products2 = products1;
            vending1.setProducts1(products2);
            System.out.println("You now have " + products1[1] + " " + name + " left.");


        } else {
            System.out.println("You can't eat what you don't have in your inventory.");

        }//else

    }
    @Override             //done
    public String examine() {
        String exa1 = new String();
        exa1 = "The drink section reads:\n" +name1 + "\t\tprice: " + price1 + " credits" + "\t\tVolume: " + volume + "cl.\n";
        return exa1;
    }



}
