package com.ramacciotti.abstract_factory.concrete_products.air_product.concrete_creator;

import com.ramacciotti.abstract_factory.concrete_products.air_product.concrete_product.Helicopter;
import com.ramacciotti.abstract_factory.concrete_products.air_product.creator.AirTransportFactory;
import com.ramacciotti.abstract_factory.concrete_products.air_product.product.IAirTransport;

/**
 * <p>* This class is the Concrete Creator.</p>
 * <p>* It overrides the base factory method to return a specific Concrete Product (Helicopter).</p>
 * <p>* This is where the 'new' operator belongs.</p>
 */
public class HelicopterManufacturer extends AirTransportFactory {

    @Override
    protected IAirTransport createTransport() {
        return new Helicopter();
    }

}
