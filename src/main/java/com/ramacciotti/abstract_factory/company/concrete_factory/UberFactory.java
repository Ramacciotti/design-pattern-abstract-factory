package com.ramacciotti.abstract_factory.company.concrete_factory;

import com.ramacciotti.abstract_factory.concrete_products.air_product.concrete_product.Helicopter;
import com.ramacciotti.abstract_factory.concrete_products.air_product.product.IAirTransport;
import com.ramacciotti.abstract_factory.company.abstract_factory.ICompanyFactory;
import com.ramacciotti.abstract_factory.concrete_products.land_product.concrete_product.Car;
import com.ramacciotti.abstract_factory.concrete_products.land_product.product.ILandTransport;

/**
 * Concrete Factories implement creation methods of the abstract factory (ICompanyFactory).
 * Each concrete factory (Uber or NineNine) corresponds to a specific variant of products and creates only those product variants (In this case: Car, Helicopter).
 */
public class UberFactory implements ICompanyFactory {

    @Override
    public ILandTransport createLandTransport() {
        return new Car();
    }

    @Override
    public IAirTransport createAirTransport() {
        return new Helicopter();
    }

}
