import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Q12 {
    //Partition even and odd numbers

    public static void main(String args[]){
        List<Integer> list= List.of(1,2,3,4,5,6,7,8,9,10);

        Map<Boolean, List<Integer>> partition= list.stream().collect(Collectors.partitioningBy(i->i%2==0));


                for(boolean b : partition.keySet()){
                    System.out.print(b +" -");
                    for(int a : partition.get(b)){
                        System.out.print(a +" ,");
                    }
                    System.out.println();
                }
    }
}
