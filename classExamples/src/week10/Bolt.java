package week10;

public class Bolt implements Part{
    private String name = "Bolt";
    private double weight;
    private double diameterInInches;
    private double lengthInInches;

    Bolt(double diameterInInches, double lengthInInches){
        this.diameterInInches = diameterInInches;
        this.lengthInInches = lengthInInches;
    }

    @Override
    public double getCost() {
        return this.diameterInInches * this.lengthInInches;
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
                this.diameterInInches + '"' + " diameter, " +
                "$" + this.getCost());
    }
}
