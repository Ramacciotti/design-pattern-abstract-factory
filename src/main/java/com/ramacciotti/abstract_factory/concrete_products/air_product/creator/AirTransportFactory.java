package com.ramacciotti.abstract_factory.concrete_products.air_product.creator;

import com.ramacciotti.abstract_factory.concrete_products.air_product.product.IAirTransport;

/**
 * <p>* This class is a Creator.</p>
 * <p>* it declares the factory method that returns new product objects.</p>
 * <p>* Its abstract to force all subclasses to implement their own versions of the factory method.</p>
 */
public abstract class AirTransportFactory {

    /**
     * <p>- Initialize the Factory</p>
     */
    public void initFactory() {

        System.out.println(" ");
        System.out.println("Initializing Service ----------------------------------------------------------------------");
        System.out.println(" ");

        // Create a new Transport.
        IAirTransport iAirTransport = createTransport();

        iAirTransport.getCargo();
        iAirTransport.startRide();
        iAirTransport.endRide();

    }

    /**
     * <p>- Factory Method.</p>
     * <p>- Decides how the Transport will be created.</p>
     *
     * @Returns ILandTransport interface.
     */
    protected abstract IAirTransport createTransport();

}
