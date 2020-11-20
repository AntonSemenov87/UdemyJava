package RebootCamp;

import java.lang.reflect.Array;
import java.util.*;

public class ArrayList_vs_HashSet {
    public static void main(String[] args) {

        String [] companies = {"Bank of America", "Bank of America", "Capital One", "Capital One"};

        Set<String> set1 = new HashSet<>(); // []  Accepts null, doesn't keep insertion order
        set1.addAll( Arrays.asList(companies) ); // checks
        set1.addAll( Arrays.asList(null, null));
        set1.add("A");
        System.out.println(set1);

        Set<String> set2 = new LinkedHashSet<>(); // Accepts null AND stores in insertion order
        set2.addAll( Arrays.asList(companies) );
        set2.addAll( Arrays.asList(null, null));
        set2.add("A");
        System.out.println(set2);

        Set<String> set3 = new TreeSet<>();
        set3.addAll( Arrays.asList("D", "D", "B", "E", "B", "C", "C", "A")); // will sort and not allow duplicates
        set3.add(null); // does not allow null
        System.out.println(set3);

    }
}
