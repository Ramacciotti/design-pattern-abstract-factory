package com.ramacciotti.abstract_factory.concrete_products.air_product.product;

/**
 * <p>* This class is the Product.</p>
 * <p>* It´s common to all objects produced by the AirTransportFactory (Creator).</p>
 */
public interface IAirTransport {

    void getCargo();

    void startRide();

    void endRide();

}
