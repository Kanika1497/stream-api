import java.util.List;
import java.util.stream.Collectors;

public class Q9 {
    public static void main(String args[]){
        List<List<Integer>> list= List.of(List.of(1,2,3,4),List.of(3,6,4,6));

        List<Integer> l=list.stream().flatMap(a-> a.stream()).collect(Collectors.toList());

        for(int a : l){
            System.out.print(a + " ,");
        }
    }
}
