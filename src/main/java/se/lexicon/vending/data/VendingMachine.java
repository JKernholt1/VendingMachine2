package se.lexicon.vending.data;

import se.lexicon.vending.model.Product;

public interface VendingMachine {

    // interface we always can define a group of methods

   boolean addMoney(int money);



    Product productBuy(int prodNum);

    int returnChange();

   void presentProducts();

    int getBalance();

}
