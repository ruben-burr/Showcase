package org.educama.shipment.api.datastructure;

import org.educama.shipment.model.Cargo;

/**
 * Re-usable data structure used by resources.
 */
public class CargoDS {

    public Integer numberPackages;

    public Double totalWeight;

    public Double totalCapacity;

    public String cargoDescription;

    public Boolean dangerousGoods;

    public Double value;

    /*
     * For Jackson Parser
     */
    private CargoDS() {
        // empty
    }

    public CargoDS(Cargo cargo) {
        this.numberPackages = cargo.numberPackages;
        this.totalWeight = cargo.totalWeight;
        this.totalCapacity = cargo.totalCapacity;
        this.cargoDescription = cargo.cargoDescription;
        this.value = cargo.value;
    }

    public CargoDS(Integer numberPackages, Double totalWeight, Double totalCapacity, String cargoDescription, Boolean dangerousGoods, Double value) {
        this.numberPackages = numberPackages;
        this.totalWeight = totalWeight;
        this.totalCapacity = totalCapacity;
        this.cargoDescription = cargoDescription;
        this.dangerousGoods = dangerousGoods;
        this.value = value;
    }

    public Cargo toCargo() {
        return new Cargo(this.numberPackages, this.totalWeight, this.totalCapacity, this.cargoDescription, this.dangerousGoods, this.value);
    }

}
