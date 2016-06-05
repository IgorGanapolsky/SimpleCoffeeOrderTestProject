package com.alexzh.simplecoffeeorder.view;

import com.alexzh.simplecoffeeorder.model.Coffee;

import java.util.HashMap;

public interface CoffeeOrderDetailsView {

    void displayOrderedCoffeeList(HashMap<Coffee, Integer> coffeeMap);

    void displayTotalPrice(float totalPrice);

}