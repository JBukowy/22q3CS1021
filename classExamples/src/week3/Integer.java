package week3;

public class Integer implements Calculable{

    int value;

    Integer(int value){
        this.value = value;
    }


    @Override
    public Calculable plus(Calculable that) {
        return new Integer(this.value + that.intValue());
    }

    @Override
    public Calculable minus(Calculable that) {
        return new Integer(this.value - that.intValue());
    }

    @Override
    public double doubleValue() {
        return value;
    }

    @Override
    public int intValue() {
        return value;
    }
}
