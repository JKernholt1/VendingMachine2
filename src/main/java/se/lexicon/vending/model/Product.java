package se.lexicon.vending.model;

// an abstract class is a class that can only be used for inheritance
public abstract class Product {
    // Ctrl + Alt + L : your code automatically can be sorted
    //fields or variables
    private String name;
    private int price;

    // constructors



    // methods or behaviors
    public String examine() {
        // todo: should implement this method later. Or not...

        return "";
    }


    // abstract method is a method that has no implementation or without body
    // using abstract keyword all subclasses must implement this method and override them
    public abstract int[] productPurchase(int products1[], int moneyPool);


    public abstract void use(int products1[]);



    // setters/getters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


    // override methods


}
