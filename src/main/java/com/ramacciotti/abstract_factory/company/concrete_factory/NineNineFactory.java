package com.ramacciotti.abstract_factory.company.concrete_factory;

import com.ramacciotti.abstract_factory.concrete_products.air_product.concrete_product.Plane;
import com.ramacciotti.abstract_factory.concrete_products.air_product.product.IAirTransport;
import com.ramacciotti.abstract_factory.company.abstract_factory.ICompanyFactory;
import com.ramacciotti.abstract_factory.concrete_products.land_product.concrete_product.Bike;
import com.ramacciotti.abstract_factory.concrete_products.land_product.product.ILandTransport;

/**
 * Concrete Factories implement creation methods of the abstract factory (ICompanyFactory).
 * Each concrete factory (NineNine ou Uber) corresponds to a specific variant of products and creates only those product variants (In this case: Bike, Plane).
 */
public class NineNineFactory implements ICompanyFactory {

    @Override
    public ILandTransport createLandTransport() {
        return new Bike();
    }

    @Override
    public IAirTransport createAirTransport() {
        return new Plane();
    }

}
