package week9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionalDriver {

    public static void main(String[] args) {

        List<String> words = new ArrayList<>();

        words.add("Person");
        words.add("Woman");
        words.add("Man");
        words.add("Camera");
        words.add("TV");
        words.add("Tourniquet");

        Predicate<String> pred = s -> s.length() > 3;

        for(String s: words){
            System.out.println(pred.test(s));
        }

        Consumer<String> consume = s -> System.out.println(s);

        for(String s: words){
            consume.accept(s);
        }

        Function<String, Integer> func =  s -> s.length();

        for(String s: words){
            consume.accept("" + func.apply(s));
        }

        Comparator<String> compare = (string1, string2) -> {
            if(string1.length() > string2.length()){
                return 1;
            }else if(string1.length() < string2.length()){
                return -1;
            }else{
                return 0;
            }
        };

        System.out.println(compare.compare(words.get(0),words.get(1)));


        System.out.println(words);

        Collections.sort(words, (s1,s2) -> {
            if(s1.charAt(0) > s2.charAt(0)){
                return -1;
            }else if(s1.charAt(0) < s2.charAt(0)){
                return 1;
            }else{
                return 0;
            }
        });

        System.out.println(words);


    }




}
