package se.lexicon.vending;

import se.lexicon.vending.model.*;
import se.lexicon.vending.data.*;

import java.util.Arrays;
import java.util.Scanner;

public class UserInterface {


    public static void main(String[] args) {

        VendingMachineImpl vending1 = new VendingMachineImpl();

        System.out.println("During the end of your tourist city stroll, you encounter a vending machine.");
        System.out.println("You decide to at least have a look, and walk over to it.");
        System.out.println("It's still filled with various drinks and edibles, with prices ranging from 5 to 25 credits per item.");
        System.out.println("It greets you with a welcome screen that reads:\n");
        System.out.println("\"Welcome to the snack bar vending machine!\"");
        System.out.println("\"We have multiple choices that may please your appetite.\"");
        System.out.println("\"Please insert your credit card to begin purchasing.\"\n");
        System.out.println("(Type in \"1\" to leave, or any other number to use your credit card.)");

        Scanner chooser1 = new Scanner(System.in);
        Scanner chooser2 = new Scanner(System.in);
        Scanner chooser3 = new Scanner(System.in);
//        Scanner chooser4 = new Scanner(System.in);
//----
        int choice1 = chooser1.nextInt();
//------------------------------------------------

        if (choice1 == 1) {
            System.out.println("\nYou decide the vending machine isn't really worth your time and head back to the hotel instead...");
            System.out.println("End of city stroll. (And this vending machine program is now shut down as well...)");
            System.exit(1);
        } else {

            System.out.println("\n\"There are fixed credit amounts that will be withdrawn from your platinum credit card by your choice.\"");
            System.out.println("\"Unused credits will be returned to your credit card before you have it returned from the machine.\"");
            System.out.println("\"Please select the amount you wish to withdraw from your credit card:\"");
            System.out.println("The given credit amounts on the Vending machine screen are: ");
            System.out.println("1, 2, 5, 10, 20, 50, 100, 200, 500 or 1000 credits.\n");
            System.out.println("(Type in your chosen amount(s), or type in anything else to stop stuffing the vending machine with your credits.)");
        }
//-----------------

        vending1.setMoneyPool(0);
        Boolean creditStuffing = true;
        int[] credChoices = vending1.getDenominations();

//-----------------
        while (creditStuffing) {

            boolean transaction = false;
            int choice2 = chooser2.nextInt();
            int indexValue = Arrays.binarySearch(credChoices, choice2);

            if (indexValue > -0.4) {

                switch (choice2) {
                    case 0:
                        int money = vending1.getMoneyPool();
                        money = money +1;
                        transaction = vending1.addMoney(money);
                        if (transaction) {
                            System.out.println("+1 credit added to your vending machine credit pool.");
                            System.out.println("Total amount of vending machine's credit pool is now: " + money + " credits.\n");
                            System.out.println("\"Enter more credits?\" (1, 2, 5, 10, 20, 50, 100, 200, 500 or 1000 - or other input to stop.)");
                        } else {
                            System.out.println("No money were put into the vending machine.");}
                        break;

                    case 1:
                        money = vending1.getMoneyPool();
                        money = money +2;
                        vending1.addMoney(money);
                        if (transaction) {
                        System.out.println("+2 credits added to your vending machine credit pool.");
                        System.out.println("Total amount of vending machine's credit pool is now: " + money + " credits.\n");
                        System.out.println("\"Enter more credits?\" (1, 2, 5, 10, 20, 50, 100, 200, 500 or 1000 - or other input to stop.)");
                        } else {
                            System.out.println("No money were put into the vending machine.");}
                        break;

                    case 2:
                        money = vending1.getMoneyPool();
                        money = money +5;
                        vending1.addMoney(money);
                        if (transaction) {
                        System.out.println("+5 credits added to your vending machine credit pool.");
                        System.out.println("Total amount of vending machine's credit pool is now: " + money + " credits.\n");
                        System.out.println("\"Enter more credits?\" (1, 2, 5, 10, 20, 50, 100, 200, 500 or 1000 - or other input to stop.)");
                        } else {
                            System.out.println("No money were put into the vending machine.");}
                        break;

                    case 3:
                        money = vending1.getMoneyPool();
                        money = money +10;
                        vending1.addMoney(money);
                        if (transaction) {
                        System.out.println("+10 credits added to your vending machine credit pool.");
                        System.out.println("Total amount of vending machine's credit pool is now: " + money + " credits.\n");
                        System.out.println("\"Enter more credits?\" (1, 2, 5, 10, 20, 50, 100, 200, 500 or 1000 - or other input to stop.)");
                        } else {
                            System.out.println("No money were put into the vending machine.");}
                        break;

                    case 4:
                        money = vending1.getMoneyPool();
                        money = money +20;
                        vending1.addMoney(money);
                        if (transaction) {
                        System.out.println("+20 credits added to your vending machine credit pool.");
                        System.out.println("Total amount of vending machine's credit pool is now: " + money + " credits.\n");
                        System.out.println("\"Enter more credits?\" (1, 2, 5, 10, 20, 50, 100, 200, 500 or 1000 - or other input to stop.)");
                        } else {
                            System.out.println("No money were put into the vending machine.");}
                        break;

                    case 5:
                        money = vending1.getMoneyPool();
                        money = money +50;
                        vending1.addMoney(money);
                        if (transaction) {
                        System.out.println("+50 credits added to your vending machine credit pool.");
                        System.out.println("Total amount of vending machine's credit pool is now: " + money + " credits.\n");
                        System.out.println("\"Enter more credits?\" (1, 2, 5, 10, 20, 50, 100, 200, 500 or 1000 - or other input to stop.)");
                        } else {
                            System.out.println("No money were put into the vending machine.");}
                        break;

                    case 6:
                        money = vending1.getMoneyPool();
                        money = money +100;
                        vending1.addMoney(money);
                        if (transaction) {
                        System.out.println("+100 credits added to your vending machine credit pool.");
                        System.out.println("Total amount of vending machine's credit pool is now: " + money + " credits.\n");
                        System.out.println("\"Enter more credits?\" (1, 2, 5, 10, 20, 50, 100, 200, 500 or 1000 - or other input to stop.)");
                        } else {
                            System.out.println("No money were put into the vending machine.");}
                        break;

                    case 7:
                        money = vending1.getMoneyPool();
                        money = money +200;
                        vending1.addMoney(money);
                        if (transaction) {
                        System.out.println("+200 credits added to your vending machine credit pool.");
                        System.out.println("Total amount of vending machine's credit pool is now: " + money + " credits.\n");
                        System.out.println("\"Enter more credits?\" (1, 2, 5, 10, 20, 50, 100, 200, 500 or 1000 - or other input to stop.)");
                        } else {
                            System.out.println("No money were put into the vending machine.");}
                        break;

                    case 8:
                        money = vending1.getMoneyPool();
                        money = money +500;
                        vending1.addMoney(money);
                        if (transaction) {
                        System.out.println("+500 credits added to your vending machine credit pool.");
                        System.out.println("Total amount of vending machine's credit pool is now: " + money + " credits.\n");
                        System.out.println("\"Enter more credits?\" (1, 2, 5, 10, 20, 50, 100, 200, 500 or 1000 - or other input to stop.)");
                        } else {
                            System.out.println("No money were put into the vending machine.");}
                        break;

                    case 9:
                        money = vending1.getMoneyPool();
                        money = money +1000;
                        vending1.addMoney(money);
                        if (transaction) {
                        System.out.println("+1000 credits added to your vending machine credit pool.");
                        System.out.println("Total amount of vending machine's credit pool is now: " + money + " credits.\n");
                        System.out.println("\"Enter more credits?\" (1, 2, 5, 10, 20, 50, 100, 200, 500 or 1000 - or other input to stop.)");
                        } else {
                            System.out.println("No money were put into the vending machine.");}
                        break;

                }//switch

            } else {
                int money = vending1.getMoneyPool();
                System.out.println("And there you stopped putting credits into the machine.");
                System.out.println("Time to buy some stuff for up to " + money + " credits in the vending machine.");
                creditStuffing = false;
                break;

            }//if
        }//while

        vending1.presentProducts();
        System.out.println("Now, what would you like to buy?");
        System.out.println("\"Press: 1 for the drink, 2 for the food, 3 for the fruit or 4 for the snack.\"");
        System.out.println("...or any other number to stop buying.");

        boolean yummy = true;

        while (yummy) {

            int choice3 = chooser3.nextInt();
            switch (choice3) {
                case 1:
                case 2:
                case 3:
                case 4:
                     vending1.productBuy(choice3);

                    System.out.println("\nWould you like to buy something else? (1-4, or other number to cancel...)");
                    break;
                default:
                    System.out.println("\nYou decide you're done with this machine for now and start checking out...");
                    yummy= false;
                    break;
            }//switch
        }//while




//---------------- becomes redundant because of insta-eat...  ----------------------------------
/*
        System.out.println("\n\nNow, which items would you like to consume of the those you might have bought?");
        System.out.println("\"Press: 1 for a drink, 2 for some food, 3 for a fruit or 4 for a snack.\"");
        System.out.println("...or any other number to stop consuming.");

        boolean chonk = true;

        while (chonk) {
            int choice4 = chooser4.nextInt();

//------------- under construction

            switch (choice4) {
                case 1:
                    int[] products1 = vending1.getProducts1();
                    int[] prods2 = vending1.productUse(1,products1);
                    vending1.setProducts1(prods2);
                    System.out.println("Would you like to consume something else? (1-4, or other number to cancel...)");
                    break;

                case 2:
                    products1 = vending1.getProducts1();
                    prods2 = vending1.productUse(2,products1);
                    vending1.setProducts1(prods2);
                    System.out.println("Would you like to consume something else? (1-4, or other number to cancel...)");
                    break;

                case 3:
                    products1 = vending1.getProducts1();
                    prods2 = vending1.productUse(3,products1);
                    vending1.setProducts1(prods2);
                    System.out.println("Would you like to consume something else? (1-4, or other number to cancel...)");
                    break;

                case 4:

                    products1 = vending1.getProducts1();
                    prods2 = vending1.productUse(4,products1);
                    vending1.setProducts1(prods2);
                    System.out.println("Would you like to consume something else? (1-4, or other number to cancel...)");
                    break;

                default:
                    System.out.println("\nYou decide you're done with consuming things and ponder if you should checkout");
                    System.out.println("from the vending machine. And so...\n");
                    chonk= false;

            }//switch
        }//while
*/

//------------- end of redundant...  -------------------------

        int left = vending1.getBalance();
        System.out.println("You check the current balance in the vending machine and it shows: " + left + " credits.");

        System.out.println("You checkout...");
        vending1.returnChange();

        left = vending1.getBalance();
        System.out.println("You check the current balance in the vending machine again and it shows: " + left + " credits.");

//------------- since no back pack anymore.... well
//        System.out.println("\nBefore you head back to the hotel, you also take whatever items you didn't eat or drink and");
//        System.out.println("put them in your spacious backpack.");
//-------------

        System.out.println("Carpe noctem. End of vending machine program...");

    }//main

}//class
