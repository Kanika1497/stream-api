import java.util.List;

public class Q2 {
    public static void main(String []args){
        //remove duplicate from list

        List<Integer> list= List.of(1,1,3,4,4,3,8,7,8,8,9);

        list.stream().distinct().forEach(System.out::println);
    }
}
