package com.ramacciotti.abstract_factory.company.abstract_factory;

import com.ramacciotti.abstract_factory.concrete_products.air_product.product.IAirTransport;
import com.ramacciotti.abstract_factory.concrete_products.land_product.product.ILandTransport;

/**
 * The Abstract Factory interface declares a set of methods for creating each of the abstract products.
 */
public interface ICompanyFactory {

    ILandTransport createLandTransport();

    IAirTransport createAirTransport();

}
