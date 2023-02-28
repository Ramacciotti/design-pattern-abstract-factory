package com.ramacciotti.abstract_factory.concrete_products.land_product.concrete_creator;

import com.ramacciotti.abstract_factory.concrete_products.land_product.concrete_product.Car;
import com.ramacciotti.abstract_factory.concrete_products.land_product.creator.LandTransportFactory;
import com.ramacciotti.abstract_factory.concrete_products.land_product.product.ILandTransport;

/**
 * <p>* This class is the Concrete Creator.</p>
 * <p>* It overrides the base factory method to return a specific Concrete Product (Car).</p>
 * <p>* This is where the 'new' operator belongs.</p>
 */
public class CarManufacturer extends LandTransportFactory {

    @Override
    protected ILandTransport createTransport() {
        return new Car();
    }

}
