package com.anupam.list;

import java.util.ArrayList;

/**
 * Created by ANUPAM DUBE on Aug, 2018
 **/
public class GroceryList {
    private ArrayList groceryList = new ArrayList();

    public GroceryList(ArrayList groceryList) {
        this.groceryList = groceryList;
    }

    public ArrayList getGroceryList() {
        return groceryList;
    }
}
