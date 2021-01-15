package se.lexicon.vending.model;

import se.lexicon.vending.data.VendingMachineImpl;

public class Snack extends Product {

    private int sugarPercent;
    private String name4;
    private int price4;


    public int getSugarPercent() {
        return sugarPercent;
    }

    public void setSugarPercent(int sugarPercent) {
        this.sugarPercent = sugarPercent;
    }

    @Override
    public String getName() {

        return name4;
    }

    @Override
    public void setName(String name) {

        this.name4 = name;
    }

    @Override
    public int getPrice() {

        return price4;
    }

    @Override
    public void setPrice(int price) {

        this.price4 = price;
    }


//-----------------


    @Override               //done
    public int[] productPurchase(int products1[] , int moneyPool) {

        if (price4 > moneyPool) {
            System.out.println("Sorry buddy, but you only have " + moneyPool + " credits left in the vending machine to buy for.");
            return products1;

        } else {

            String name = name4;
            int money = moneyPool - price4;
            vending1.setMoneyPool(money);
            products1[4]++;
            System.out.println("You bought a " + name + ".");
            System.out.println("You now have " + money + " credits left in the vending machine.");
            return products1;
        }//else


    }

    @Override
    public void use(int products1[]) {

        if (products1[4] > 0) {
            String name = name4;
            int products2[] = new int[5];
            System.out.println("You eat a " + name + ".");
            products1[4]--;
            products2 = products1;
            vending1.setProducts1(products2);
            System.out.println("You now have " + products1[4] + " " + name + " left.");


        } else {
            System.out.println("You can't eat what you don't have in your inventory.");

        }//else

    }
    public String examine() {       //done
        String exa4 = new String();
        exa4 = "The snack section reads:\n" +name4 + "\t\tprice: " + price4 + " credits" + "\t\tPercent sugar: " + sugarPercent + "%.\n\n";
        return exa4;
    }

}
