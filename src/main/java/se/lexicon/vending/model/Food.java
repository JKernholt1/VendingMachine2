package se.lexicon.vending.model;

import se.lexicon.vending.data.VendingMachineImpl;

public class Food extends Product {

    private int calories;
    private String name2;
    private int price2;

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    @Override
    public String getName() {

        return name2;
    }


    @Override
    public void setName(String name1) {

        this.name2 = name1;
    }


    @Override
    public int getPrice() {

        return price2;
    }


    @Override
    public void setPrice(int price) {

        this.price2 = price;
    }


//-----------------

    @Override               //done
    public int[] productPurchase(int products1[] , int moneyPool) {

        if (price2 > moneyPool) {
            System.out.println("Sorry buddy, but you only have " + moneyPool + " credits left in the vending machine to buy for.");
            return products1;

        } else {

            String name = name2;
            int money = moneyPool - price2;
            vending1.setMoneyPool(money);
            products1[2]++;
            System.out.println("You bought a " + name + ".");
            System.out.println("You now have " + money + " credits left in the vending machine.");
            return products1;
        }//else


    }

    @Override
    public void use(int products1[]) {

        if (products1[2] > 0) {
            String name = name2;
            int products2[] = new int[5];
            System.out.println("You eat a " + name + ".");
            products1[2]--;
            products2 = products1;
            vending1.setProducts1(products2);
            System.out.println("You now have " + products1[2] + " " + name + " left.");


        } else {
            System.out.println("You can't eat what you don't have in your inventory.");

        }//else

    }


    @Override
    public String examine() {       //done
        String exa2 = new String();
        exa2 = "The food section reads:\n" +name2 + "\t\tprice: " + price2 + " credits" + "\t\tCalories: " + calories + "kc.\n";
        return exa2;
    }

}
