package org.educama.shipment.model;

import javax.persistence.Embeddable;

/**
 * This represents the address entity used for database persistence.
 */
@Embeddable
public class Cargo {

    public Integer numberPackages;

    public Double totalWeight;

    public Double totalCapacity;

    public String cargoDescription;

    public Boolean dangerousGoods;

    public Double value;

    /**
     * Constructor for JPA.
     */
    public Cargo() {
        // empty
    }

    public Cargo(Integer numberPackages, Double totalWeight, Double totalCapacity, String cargoDescription,
            Boolean dangerousGoods, Double value) {
        this.numberPackages = numberPackages;
        this.totalWeight = totalWeight;
        this.totalCapacity = totalCapacity;
        this.cargoDescription = cargoDescription;
        this.dangerousGoods = dangerousGoods;
        this.value = value;
    }
}
