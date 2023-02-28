package com.ramacciotti.abstract_factory.concrete_products.air_product.concrete_product;

import com.ramacciotti.abstract_factory.concrete_products.air_product.product.IAirTransport;
import lombok.Data;

/**
 * <p>* This is a Concrete Product.</p>
 * <p>* It´s one of the different implementations of IAirTransport (product).</p>
 */
@Data
public class Helicopter implements IAirTransport {

    private String owner;

    @Override
    public void getCargo() {
        System.out.println("** Getting passenger...");
    }

    @Override
    public void startRide() {
        System.out.println("** Starting helicopter ride...");
    }

    @Override
    public void endRide() {
        System.out.println("** Ending helicopter ride.");
    }

}
