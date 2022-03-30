package week3;

public interface Calculable {

    public Calculable plus(Calculable that);

    public Calculable minus(Calculable that);

    public double doubleValue();

    public int intValue();

}
