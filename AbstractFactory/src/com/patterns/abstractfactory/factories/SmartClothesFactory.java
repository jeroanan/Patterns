package com.patterns.abstractfactory.factories;

import com.patterns.abstractfactory.ClothesFactory;
import com.patterns.abstractfactory.Shirt;
import com.patterns.abstractfactory.Trousers;
import com.patterns.abstractfactory.smartclothes.SmartShirt;
import com.patterns.abstractfactory.smartclothes.SmartTrousers;

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
