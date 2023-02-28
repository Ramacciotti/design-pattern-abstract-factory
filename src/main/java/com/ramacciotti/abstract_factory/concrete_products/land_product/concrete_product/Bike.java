package com.ramacciotti.abstract_factory.concrete_products.land_product.concrete_product;

import com.ramacciotti.abstract_factory.concrete_products.land_product.product.ILandTransport;
import lombok.Data;

import java.time.LocalDate;

/**
 * <p>* This is a Concrete Product.</p>
 * <p>* It´s one of the different implementations of ILandTransport (product).</p>
 */
@Data
public class Bike implements ILandTransport {

    private String owner;

    private LocalDate registrationDate;

    @Override
    public void getCargo() {
        System.out.println("** Getting package...");
    }

    @Override
    public void startRide() {
        System.out.println(" ");
        System.out.println("** Starting bike ride...");
    }

    @Override
    public void endRide() {
        System.out.println("** Ending bike ride.");
        System.out.println(" ");
    }

}
