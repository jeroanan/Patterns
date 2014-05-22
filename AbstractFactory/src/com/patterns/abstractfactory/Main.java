package com.patterns.abstractfactory;

import com.patterns.abstractfactory.com.patterns.abstractfactory.factories.*;

/**
 * Created by david on 22/05/14.
 */
public class Main {
    public static void main (String[] args)
    {
        ClothesFactory factory = new SmartClothesFactory();

        Shirt shirt = factory.GetShirt();
        Trousers trousers = factory.GetTrousers();

        System.out.println(shirt);
        System.out.println(trousers);

        factory = new SummerClothesFactory();
        shirt = factory.GetShirt();
        trousers = factory.GetTrousers();

        System.out.println("");

        System.out.println(shirt);
        System.out.println(trousers);
    }
}
