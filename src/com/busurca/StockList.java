package com.busurca;

import java.util.HashMap;
import java.util.StringJoiner;

public class StockList {

    public static String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {

        if (lstOf1stLetter == null || lstOfArt == null || lstOf1stLetter.length==0 || lstOfArt.length==0) return "";

        //will store the string to be returned
        StringJoiner joiner = new StringJoiner(" - ");

        //transform the array to map for easier processing
        //the string will actually be the category of the book(letter) derived from the letter part of the code
        HashMap<String, Integer> stockList = new HashMap<>();

        //place the books and the quantity in the map
        for (String book : lstOfArt
        ) {
            int totalQuantityPerCategory = 0;

            //get the letter to put in key
            String category = book.substring(0, 1);

            //get the quantity
            if (stockList.containsKey(category)) {
                Integer currentStock = stockList.get(category);
                totalQuantityPerCategory = currentStock + Integer.parseInt(book.split(" ")[1]);
            } else {
                totalQuantityPerCategory = Integer.parseInt(book.split(" ")[1]);
            }

            //replace value if category exists in map or put new category
            if (stockList.containsKey(category)) {
                stockList.replace(category, totalQuantityPerCategory);
            } else {
                stockList.put(category, totalQuantityPerCategory);
            }

        }

        //generate the required string format
        for (String category : lstOf1stLetter
        ) {
            if (stockList.containsKey(category)) {
                joiner.add("(" + category + " : " + stockList.get(category) + ")");
            } else {
                joiner.add("(" + category + " : 0)");
            }
        }

        return joiner.toString();
    }
}
