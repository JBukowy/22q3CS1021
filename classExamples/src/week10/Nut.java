package week10;

public class Nut implements Part{
    private String name = "Nut";
    private double weight;
    private double diameterInInches;

    Nut(double diameterInInches){
        this.diameterInInches = diameterInInches;
    }

    @Override
    public double getCost() {
        return 0.5 * this.diameterInInches;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public double getWeight() {
        return this.weight;
    }

    @Override
    public void printBillOfMaterials() {
        // Nut: 0.75” diameter, $0.38
        System.out.println(this.name + ": " +
                this.diameterInInches + '"' + ", " +
                "$" + this.getCost());
    }
}
