package se.lexicon.vending.data;

import se.lexicon.vending.model.*;

public class VendingMachineImpl implements VendingMachine {

    /*  Q's and statements:
    1. I'm not going to use the variable "money" for more than the initial direct touch of the denominations.
        I'd much rather use the moneyPool for purchases since the use of the variable "money" is just for ADDING "money".
    2. yes, I know arrays starts with index 0, but I wanted a "0" if there would be an emergency use with products1,
        and that's why it has a length of 5.



    */

    private Product[] products = new Product[4];
    private int[] denominations = {1, 2, 5, 10, 20, 50, 100, 200, 500, 1000};


   private int moneyPool;
   private int products1[] = new int[5];

    public Drink drink1 = new Drink();
    public Food food1 = new Food();
    public Fruit fruit1 = new Fruit();
    public Snack snack1 = new Snack();


    public VendingMachineImpl() {      //done

        drink1.setName("Mer");
        drink1.setPrice(8);
        drink1.setVolume("25cl");

        food1.setName("Pizza");
        food1.setPrice(25);
        food1.setCalories(1400);

        fruit1.setName("Apple");
        fruit1.setPrice(5);
        fruit1.setFatPercent(1);

        snack1.setName("Japp");
        snack1.setPrice(7);
        snack1.setSugarPercent(30);
        products[0] = drink1;
        products[1] = food1;
        products[2] = fruit1;
        products[3] = snack1;


    }//vendingMachineImpl1

    public int getMoneyPool() {
        return moneyPool;
    }

    public int[] getDenominations() {
        return denominations;
    }

    public void setMoneyPool(int money) {
        moneyPool = money;
    }

/*    public int[] getProducts1() {
        return products1;
    }

    public void setProducts1(int[] products2) {
        products1 = products2;
    }
*/

    @Override
    public boolean addMoney(int money) {        //done
        moneyPool = money;

        return false;
    }

    @Override           //done
    public Product productBuy(int prodNum) {
        int cash;
        for (int i = 0; i < 4; i++){

         if (i == prodNum-1){
            cash = products[i].getPrice();
            if (cash > moneyPool){
                System.out.println("You haven't put enough money into the vending machine to buy that product.");
            }   else{
                moneyPool = moneyPool - cash;
                System.out.println("You bought a " + products[i].getName());
                products[i].use();
            }

         } else {}//else

        }//for                                // for loop statement
                                            // search product from array of product
                                            // return found product
        return null;
    }//productBuy

   /* public int[] productUse(int prodNum, int products1[]){

        if (prodNum == 1) {
            drink1.use(products1);
            return products1;
        } else if (prodNum == 2) {
            food1.use(products1);
            return products1;
        } else if (prodNum == 3) {
            fruit1.use(products1);
            return products1;
        } else if (prodNum == 4) {
            snack1.use(products1);
            return products1;
        } else {
            System.out.println("Error, something went wrong with consuming products.");
        }

        return products1;
    }

    */

    @Override          //done
    public int returnChange() {
        System.out.println("You get " + moneyPool + " credits back from the vending machine as you check out from it.");
        moneyPool = 0;
        return 0;
    }

    @Override           //done
    public void presentProducts() {
        System.out.println("The following products can be found in this vending machine: ");
        System.out.println(drink1.examine());
        System.out.println(food1.examine());
        System.out.println(fruit1.examine());
        System.out.println(snack1.examine());

    }

    @Override       //done
    public int getBalance() {

        return moneyPool;
    }


}
