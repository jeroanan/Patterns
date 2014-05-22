package com.patterns.abstractfactory.com.patterns.abstractfactory.factories;

import com.patterns.abstractfactory.ClothesFactory;
import com.patterns.abstractfactory.Shirt;
import com.patterns.abstractfactory.Trousers;
import com.patterns.abstractfactory.com.patterns.abstractfactory.smartclothes.SmartShirt;
import com.patterns.abstractfactory.com.patterns.abstractfactory.smartclothes.SmartTrousers;

/**
 * Created by david on 22/05/14.
 */
public class SmartClothesFactory implements ClothesFactory {
    @Override
    public Shirt GetShirt() {
        return new SmartShirt();
    }

    @Override
    public Trousers GetTrousers() {
        return new SmartTrousers();
    }
}
