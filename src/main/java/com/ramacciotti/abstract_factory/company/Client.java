package com.ramacciotti.abstract_factory.company;

import com.ramacciotti.abstract_factory.company.abstract_factory.ICompanyFactory;
import com.ramacciotti.abstract_factory.concrete_products.air_product.product.IAirTransport;
import com.ramacciotti.abstract_factory.concrete_products.land_product.product.ILandTransport;

/**
 * The Client can work with any concrete factory/product variant, as long as it communicates with their objects via abstract interfaces.
 * This Client is either Uber or 99.
 */
public class Client {

    private ILandTransport iLandTransport;

    private IAirTransport iAirTransport;

    public Client(ICompanyFactory iCompanyFactory) {
        iLandTransport = iCompanyFactory.createLandTransport();
        iAirTransport = iCompanyFactory.createAirTransport();
    }

    public void startCompanyLandAndAirTransport(){
        iLandTransport.startRide();
        iLandTransport.getCargo();
        iLandTransport.endRide();

        iAirTransport.startRide();
        iAirTransport.getCargo();
        iAirTransport.endRide();
    }

}
