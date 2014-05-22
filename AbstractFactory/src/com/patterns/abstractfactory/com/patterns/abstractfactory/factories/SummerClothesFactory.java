package com.patterns.abstractfactory.com.patterns.abstractfactory.factories;

import com.patterns.abstractfactory.ClothesFactory;
import com.patterns.abstractfactory.Shirt;
import com.patterns.abstractfactory.Trousers;
import com.patterns.abstractfactory.com.patterns.abstractfactory.summerclothes.*;

/**
 * Created by david on 22/05/14.
 */
public class SummerClothesFactory implements ClothesFactory {
    @Override
    public Shirt GetShirt() {
        return new TShirt();
    }

    @Override
    public Trousers GetTrousers() {
        return new Shorts();
    }
}
