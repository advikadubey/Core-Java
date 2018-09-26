package com.anupam.collections;

/**
 * Created by ANUPAM DUBEY on Sep, 2018
 **/
public class StockItem implements Comparable<StockItem>{
    private String itemName;
    private double price;
    private int quatityStock = 0 ;

    public StockItem(String itemName, double price) {
        this.itemName = itemName;
        this.price = price;
        this.quatityStock = 0 ;
    }

    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuatityStock() {
        return quatityStock;
    }

    public void setPrice(int price) {
        if (price > 0.0) {
            this.price = price ;
        }
    }

    public void adjustStock(int quantity) {
        int newQuantity = this.quatityStock + quantity ;
        if (newQuantity >= 0) {
            this.quatityStock = newQuantity ;
        }
    }

    @Override
    public boolean equals(Object obj) {
        System.out.println("Entering Stock-Item equals method");
        if (this == obj) {
            return true ;
        }
        if (obj == null || (obj.getClass() != this.getClass())) {
            return false;
        }

        String itemName = ((StockItem)(obj)).getItemName() ;
        return this.getItemName().equals(itemName);
    }

    @Override
    public int hashCode() {
        return this.itemName.hashCode() + 310 ;
    }

    @Override
    public int compareTo(StockItem o) {
        System.out.println("Enter into StokcItem.compareTo method");
        if (this == o) {
            return 0;
        }
        if (this != o) {
            return this.itemName.compareTo(o.getItemName());
        }
        throw new NullPointerException();
    }

    @Override
    public String toString() {
        return this.getItemName()+" Price: " + this.getPrice() ;
    }
}
