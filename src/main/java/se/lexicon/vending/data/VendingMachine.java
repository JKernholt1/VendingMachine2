package se.lexicon.vending.data;

import se.lexicon.vending.model.Product;

public interface VendingMachine {

    // interface we always can define a group of methods

   boolean addMoney(int money);



    public int[] productBuy(int prodNum, int products1[], int moneyPool);

    int returnChange();

   void presentProducts();

    int getBalance();

}
