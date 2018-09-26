package com.anupam.collections;

import java.util.Map;

/**
 * Created by ANUPAM DUBE on Sep, 2018
 **/
public class StockList {
    private final Map<String, StockItem> list ;

    public StockList(Map<String, StockItem> list) {
        this.list = list;
    }
}
