package com.ramacciotti.abstract_factory.concrete_products.land_product.product;

/**
 * <p>* This class is the Product.</p>
 * <p>* It´s common to all objects produced by the LandTransportFactory (Creator).</p>
 */
public interface ILandTransport {

    void getCargo();

    void startRide();

    void endRide();

}
