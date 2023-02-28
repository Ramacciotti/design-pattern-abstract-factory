package com.ramacciotti.abstract_factory;

import com.ramacciotti.abstract_factory.company.Client;
import com.ramacciotti.abstract_factory.company.abstract_factory.ICompanyFactory;
import com.ramacciotti.abstract_factory.company.concrete_factory.NineNineFactory;
import com.ramacciotti.abstract_factory.company.concrete_factory.UberFactory;

import java.util.Objects;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        System.out.println(" ");
        Scanner scanner = new Scanner(System.in);
        System.out.println(">> Uber offer the services: car ride, helicopter ride");
        System.out.println(">> 99 offer the services: bike ride, plane ride");
        System.out.println(" ");
        System.out.print(">> Type the company you would like to initiate the services (Uber or 99): ");
        String choice = scanner.nextLine().toLowerCase();
        System.out.println(" ");

        Client client = choseCompany(choice);

        client.startCompanyLandAndAirTransport();

    }

    public static Client choseCompany(String company) {

        System.out.println(company + " company ---------------------------------------------------------------------------------------------------");

        ICompanyFactory iCompanyFactory = null;

        if (company.equals("uber")) {

            iCompanyFactory = new UberFactory();

        } else if (Objects.equals(company, "99")) {

            iCompanyFactory = new NineNineFactory();

        }

        return new Client(iCompanyFactory);

    }

}
