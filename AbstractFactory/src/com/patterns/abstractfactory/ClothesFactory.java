package com.patterns.abstractfactory;

/**
 * Created by david on 22/05/14.
 */
public interface ClothesFactory {

    Shirt GetShirt();
    Trousers GetTrousers();
}
