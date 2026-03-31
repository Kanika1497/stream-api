

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Q10 {
    public static void main(String args[]){

        List<String> str=List.of("Kanika","Kani","KanikaKumar","KanikaDinanath","KanikaRenu");

        Optional<String> s= str.stream().max(Comparator.comparingInt(s1 -> s1.length()));
        System.out.println(s.orElse(null));


    }
}
