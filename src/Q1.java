import java.util.List;
import java.util.stream.Collectors;

public class Q1 {
    //Filter even numbers from a list


    public static void main (String args[]){
        List<Integer> list= List.of(1,2,3,4,5,6,7,8,9);
        list.stream().filter(x-> x%2==0).forEach(System.out::println);;

       // for(int ele : list) System.out.println(ele);
    }

}
