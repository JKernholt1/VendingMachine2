package se.lexicon.vending.model;

import se.lexicon.vending.data.VendingMachineImpl;

public class Fruit extends Product {

    private int fatPercent;
    private String name3;
    private int price3;


    public int getFatPercent() {
        return fatPercent;
    }

    public void setFatPercent(int fatPercent) {
        this.fatPercent = fatPercent;
    }

    @Override
    public String getName() {

        return name3;
    }

    @Override
    public void setName(String name) {

        this.name3 = name;
    }

    @Override
    public int getPrice() {

        return price3;
    }

    @Override
    public void setPrice(int price) {

        this.price3 = price;
    }



//-----------------

    @Override               //done
    public int[] productPurchase(int products1[] , int moneyPool) {

        if (price3 > moneyPool) {
            System.out.println("Sorry buddy, but you only have " + moneyPool + " credits left in the vending machine to buy for.");
            return products1;

        } else {

            String name = name3;
            int money = moneyPool - price3;
            vending1.setMoneyPool(money);
            products1[3]++;
            System.out.println("You bought a " + name + ".");
            System.out.println("You now have " + money + " credits left in the vending machine.");
            return products1;
        }//else


    }

    @Override
    public void use(int products1[]) {

        if (products1[3] > 0) {
            String name = name3;
            int products2[] = new int[5];
            System.out.println("You eat a " + name + ".");
            products1[3]--;
            products2 = products1;
            VendingMachineImpl.setProducts1(products2);
            System.out.println("You now have " + products1[3] + " " + name + " left.");


        } else {
            System.out.println("You can't eat what you don't have in your inventory.");

        }//else

    }


    @Override
    public String examine() {       //done
        String exa3 = new String();
        exa3 = "The fruit section reads:\n" +name3 + "\t\tprice: " + price3 + " credits" + "\t\tPercent fat: " + fatPercent + "%.\n";
        return exa3;
    }

}
