package week3;

public class Double implements Calculable{

    double value;

    Double(double value){
        this.value = value;
    }

    @Override
    public Calculable plus(Calculable that) {
        return new Double(this.value + that.doubleValue());
    }

    @Override
    public Calculable minus(Calculable that) {
        return new Double(this.value - that.doubleValue());
    }

    @Override
    public double doubleValue() {
        return value;
    }

    @Override
    public int intValue() {
        return (int) value;
    }
}
