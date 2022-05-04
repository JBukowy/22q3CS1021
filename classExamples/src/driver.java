import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class driver {
    public static void main(String[] args) {
        Double[] fibs = new Double[]{1., 1., 2., 3., 5., 8., 13., 21., 34., 55., 89., 144., 233., 377., 610.9};
        List<Double> fibList = Arrays.asList(fibs);

        System.out.println(fibList.stream()
                .map(d -> d.intValue())
                .map(i -> i * i)
                .filter(i -> i%2==0)
                .collect(Collectors.toList()));

    }
}
