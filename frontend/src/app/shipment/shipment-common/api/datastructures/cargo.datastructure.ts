export class Cargo {
    public cargoDescription: string;
    public totalWeight: number;
    public totalCapacity: number;
    public dangerousGoods: boolean;
    public numberPackages: number;
    public value: number;

    constructor(cargoDescription: string, totalWeight: number, totalCapacity: number, dangerousGoods: boolean, numberPackages: number, value: number) {
        this.cargoDescription = cargoDescription;
        this.totalWeight = totalWeight;
        this.totalCapacity = totalCapacity;
        this.dangerousGoods = dangerousGoods;
        this.numberPackages = numberPackages;
        this.value = value;
    }
}
