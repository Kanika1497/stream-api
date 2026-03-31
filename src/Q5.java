import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

public class Q5 {
    //Second highest element from a list
    public static void main(String args[]){
        List<Integer> list=List.of(1,56,45,4,77,4,3);
        Optional<Integer> result =list.stream().sorted((a, b)->b-a).skip(1).findFirst();
        System.out.println(result.orElse(null));
    }
}
