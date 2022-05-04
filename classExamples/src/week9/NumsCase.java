package week9;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class NumsCase {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>();

        nums.add(1);
        nums.add(3);
        nums.add(5);
        nums.add(2);


        List out = nums.stream().
                map( i -> "" + i).
                filter( s -> (s.charAt(s.length()-1)) != '2').
                collect(Collectors.toList());

        System.out.println(out);

    }
}
